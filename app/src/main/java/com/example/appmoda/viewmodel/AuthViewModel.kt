package com.example.appmoda.viewmodel

import androidx.lifecycle.ViewModel
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

data class AuthState(
    val isLoggedIn: Boolean = false,
    val isLoading: Boolean = false,
    val error: String? = null,
    val email: String = ""
)

class AuthViewModel : ViewModel() {

    private val auth: FirebaseAuth = FirebaseAuth.getInstance()

    private val _authState = MutableStateFlow(AuthState())
    val authState: StateFlow<AuthState> = _authState

    init {
        if (auth.currentUser != null) {
            _authState.value = AuthState(
                isLoggedIn = true,
                email = auth.currentUser?.email ?: ""
            )
        }
    }

    fun login(email: String, password: String) {
        if (email.isBlank() || password.isBlank()) {
            _authState.value = _authState.value.copy(error = "Preencha todos os campos")
            return
        }

        _authState.value = _authState.value.copy(isLoading = true, error = null)

        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    _authState.value = AuthState(
                        isLoggedIn = true,
                        email = auth.currentUser?.email ?: ""
                    )
                } else {
                    _authState.value = _authState.value.copy(
                        isLoading = false,
                        error = traduzirErro(task.exception?.message ?: "Erro ao fazer login")
                    )
                }
            }
    }

    fun register(email: String, password: String, confirmPassword: String) {
        if (email.isBlank() || password.isBlank() || confirmPassword.isBlank()) {
            _authState.value = _authState.value.copy(error = "Preencha todos os campos")
            return
        }
        if (password != confirmPassword) {
            _authState.value = _authState.value.copy(error = "As senhas nao coincidem")
            return
        }
        if (password.length < 6) {
            _authState.value = _authState.value.copy(error = "A senha deve ter pelo menos 6 caracteres")
            return
        }

        _authState.value = _authState.value.copy(isLoading = true, error = null)

        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    _authState.value = AuthState(
                        isLoggedIn = true,
                        email = auth.currentUser?.email ?: ""
                    )
                } else {
                    _authState.value = _authState.value.copy(
                        isLoading = false,
                        error = traduzirErro(task.exception?.message ?: "Erro ao criar conta")
                    )
                }
            }
    }

    fun logout() {
        auth.signOut()
        _authState.value = AuthState()
    }

    fun clearError() {
        _authState.value = _authState.value.copy(error = null)
    }

    private fun traduzirErro(msg: String): String {
        return when {
            msg.contains("There is no user record") -> "Usuario nao encontrado"
            msg.contains("The password is invalid") -> "Senha incorreta"
            msg.contains("already in use") -> "Este email ja esta em uso"
            msg.contains("badly formatted") -> "Email invalido"
            msg.contains("network error") -> "Erro de conexao com a internet"
            else -> msg
        }
    }
}
