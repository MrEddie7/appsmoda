package com.example.appmoda.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.appmoda.util.NetworkUtils
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import androidx.lifecycle.viewModelScope

data class AuthState(
    val isLoggedIn: Boolean = false,
    val isLoading: Boolean = false,
    val error: String? = null,
    val email: String = "",
    val isNetworkAvailable: Boolean = true,
    val connectionError: Boolean = false
)

class AuthViewModel(application: Application) : AndroidViewModel(application) {

    private val auth: FirebaseAuth = FirebaseAuth.getInstance()
    private val context = application.applicationContext
    private var timeoutJob: Job? = null

    private val _authState = MutableStateFlow(AuthState())
    val authState: StateFlow<AuthState> = _authState

    init {
        // Desativa a verificacao do reCAPTCHA para testes e desenvolvimento
        auth.firebaseAuthSettings.setAppVerificationDisabledForTesting(true)

        if (auth.currentUser != null) {
            _authState.value = AuthState(
                isLoggedIn = true,
                email = auth.currentUser?.email ?: "",
                isNetworkAvailable = NetworkUtils.isNetworkAvailable(context)
            )
        }
    }

    fun checkNetwork() {
        val available = NetworkUtils.isNetworkAvailable(context)
        _authState.value = _authState.value.copy(isNetworkAvailable = available)
    }

    fun login(email: String, password: String) {
        if (email.isBlank() || password.isBlank()) {
            _authState.value = _authState.value.copy(error = "Preencha todos os campos")
            return
        }

        if (!NetworkUtils.isNetworkAvailable(context)) {
            _authState.value = _authState.value.copy(
                error = "Sem conexao com a internet. Verifique sua rede e tente novamente.",
                isNetworkAvailable = false,
                connectionError = true
            )
            return
        }

        _authState.value = _authState.value.copy(
            isLoading = true,
            error = null,
            isNetworkAvailable = true,
            connectionError = false
        )

        startTimeout()

        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                cancelTimeout()
                if (task.isSuccessful) {
                    _authState.value = AuthState(
                        isLoggedIn = true,
                        email = auth.currentUser?.email ?: "",
                        isNetworkAvailable = true
                    )
                } else {
                    val exception = task.exception
                    val errorMessage = when {
                        exception?.message?.contains("CONFIGURATION_NOT_FOUND", ignoreCase = true) == true ->
                            "Erro de configuracao do Firebase: reCAPTCHA nao ativado/configurado no Console do Firebase."
                        exception?.message?.contains("network", ignoreCase = true) == true ->
                            "Erro de conexao. Verifique sua internet e tente novamente."
                        exception?.message?.contains("timeout", ignoreCase = true) == true ->
                            "Tempo esgotado. Verifique sua conexao e tente novamente."
                        exception?.message?.contains("unavailable", ignoreCase = true) == true ->
                            "Servico temporariamente indisponivel. Tente novamente em alguns instantes."
                        exception?.message?.contains("There is no user record") == true ->
                            "Usuario nao encontrado"
                        exception?.message?.contains("The password is invalid") == true ->
                            "Senha incorreta"
                        exception?.message?.contains("already in use") == true ->
                            "Este email ja esta em uso"
                        exception?.message?.contains("badly formatted") == true ->
                            "Email invalido"
                        exception?.message?.contains("too many requests", ignoreCase = true) == true ->
                            "Muitas tentativas. Aguarde alguns minutos e tente novamente."
                        exception?.message?.contains("admin-restricted", ignoreCase = true) == true ->
                            "Acesso restrito. Entre em contato com o administrador."
                        else -> traduzirErro(exception?.message ?: "Erro ao fazer login")
                    }
                    _authState.value = _authState.value.copy(
                        isLoading = false,
                        error = errorMessage
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

        if (!NetworkUtils.isNetworkAvailable(context)) {
            _authState.value = _authState.value.copy(
                error = "Sem conexao com a internet. Verifique sua rede e tente novamente.",
                isNetworkAvailable = false,
                connectionError = true
            )
            return
        }

        _authState.value = _authState.value.copy(
            isLoading = true,
            error = null,
            isNetworkAvailable = true,
            connectionError = false
        )

        startTimeout()

        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                cancelTimeout()
                if (task.isSuccessful) {
                    _authState.value = AuthState(
                        isLoggedIn = true,
                        email = auth.currentUser?.email ?: "",
                        isNetworkAvailable = true
                    )
                } else {
                    val exception = task.exception
                    val errorMessage = when {
                        exception?.message?.contains("CONFIGURATION_NOT_FOUND", ignoreCase = true) == true ->
                            "Erro de configuracao do Firebase: reCAPTCHA nao ativado/configurado no Console do Firebase."
                        exception?.message?.contains("network", ignoreCase = true) == true ->
                            "Erro de conexao. Verifique sua internet e tente novamente."
                        exception?.message?.contains("timeout", ignoreCase = true) == true ->
                            "Tempo esgotado. Verifique sua conexao e tente novamente."
                        exception?.message?.contains("unavailable", ignoreCase = true) == true ->
                            "Servico temporariamente indisponivel. Tente novamente em alguns instantes."
                        exception?.message?.contains("There is no user record") == true ->
                            "Usuario nao encontrado"
                        exception?.message?.contains("The password is invalid") == true ->
                            "Senha incorreta"
                        exception?.message?.contains("already in use") == true ->
                            "Este email ja esta em uso"
                        exception?.message?.contains("badly formatted") == true ->
                            "Email invalido"
                        exception?.message?.contains("too many requests", ignoreCase = true) == true ->
                            "Muitas tentativas. Aguarde alguns minutos e tente novamente."
                        exception?.message?.contains("admin-restricted", ignoreCase = true) == true ->
                            "Acesso restrito. Entre em contato com o administrador."
                        else -> traduzirErro(exception?.message ?: "Erro ao criar conta")
                    }
                    _authState.value = _authState.value.copy(
                        isLoading = false,
                        error = errorMessage
                    )
                }
            }
    }

    fun logout() {
        auth.signOut()
        _authState.value = AuthState(isNetworkAvailable = NetworkUtils.isNetworkAvailable(context))
    }

    fun clearError() {
        _authState.value = _authState.value.copy(error = null, connectionError = false)
    }

    private fun startTimeout() {
        timeoutJob?.cancel()
        timeoutJob = viewModelScope.launch {
            delay(30_000L)
            _authState.value = _authState.value.copy(
                isLoading = false,
                error = "Tempo esgotado. Verifique sua conexao com a internet e tente novamente.",
                connectionError = true
            )
        }
    }

    private fun cancelTimeout() {
        timeoutJob?.cancel()
        timeoutJob = null
    }

    private fun traduzirErro(msg: String): String {
        return when {
            msg.contains("CONFIGURATION_NOT_FOUND", ignoreCase = true) ->
                "Erro de configuracao do Firebase reCAPTCHA no Console."
            msg.contains("There is no user record") -> "Usuario nao encontrado"
            msg.contains("The password is invalid") -> "Senha incorreta"
            msg.contains("already in use") -> "Este email ja esta em uso"
            msg.contains("badly formatted") -> "Email invalido"
            msg.contains("network error", ignoreCase = true) ->
                "Erro de conexao com a internet"
            msg.contains("connection", ignoreCase = true) ->
                "Falha na conexao. Verifique sua internet."
            msg.contains("timeout", ignoreCase = true) ->
                "Tempo esgotado. Tente novamente."
            msg.contains("unavailable", ignoreCase = true) ->
                "Servico indisponivel. Tente novamente em instantes."
            msg.contains("quota", ignoreCase = true) ->
                "Limite de uso atingido. Aguarde e tente novamente."
            msg.contains("disabled", ignoreCase = true) ->
                "Conta desativada. Entre em contato com o suporte."
            msg.contains("invalid", ignoreCase = true) && msg.contains("credential", ignoreCase = true) ->
                "Credenciais invalidas. Verifique email e senha."
            else -> "Erro inesperado. Tente novamente."
        }
    }

    override fun onCleared() {
        super.onCleared()
        cancelTimeout()
    }
}
