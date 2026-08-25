package com.example.appmoda.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.appmoda.ui.auth.LoginScreen
import com.example.appmoda.ui.auth.RegisterScreen
import com.example.appmoda.ui.gallery.DetailScreen
import com.example.appmoda.ui.gallery.GalleryScreen
import com.example.appmoda.viewmodel.AuthViewModel
import com.example.appmoda.viewmodel.GalleryViewModel

object Routes {
    const val LOGIN = "login"
    const val REGISTER = "register"
    const val GALLERY = "gallery"
    const val DETAIL = "detail/{itemId}"

    fun detail(itemId: String) = "detail/$itemId"
}

@Composable
fun AppNavGraph(
    navController: NavHostController,
    authViewModel: AuthViewModel = viewModel(),
    galleryViewModel: GalleryViewModel = viewModel()
) {
    val authState = authViewModel.authState.value

    NavHost(
        navController = navController,
        startDestination = if (authState.isLoggedIn) Routes.GALLERY else Routes.LOGIN
    ) {
        composable(Routes.LOGIN) {
            LoginScreen(
                onLogin = { email, password ->
                    authViewModel.login(email, password)
                },
                onNavigateToRegister = {
                    navController.navigate(Routes.REGISTER)
                },
                isLoading = authViewModel.authState.value.isLoading,
                error = authViewModel.authState.value.error,
                isNetworkAvailable = authViewModel.authState.value.isNetworkAvailable,
                onRetry = { authViewModel.checkNetwork() }
            )
        }

        composable(Routes.REGISTER) {
            RegisterScreen(
                onRegister = { email, password, confirmPassword ->
                    authViewModel.register(email, password, confirmPassword)
                },
                onNavigateBack = {
                    navController.popBackStack()
                },
                isLoading = authViewModel.authState.value.isLoading,
                error = authViewModel.authState.value.error,
                isNetworkAvailable = authViewModel.authState.value.isNetworkAvailable,
                onRetry = { authViewModel.checkNetwork() }
            )
        }

        composable(Routes.GALLERY) {
            GalleryScreen(
                galleryState = galleryViewModel.galleryState.value,
                onSelectDecada = { galleryViewModel.selectDecada(it) },
                onSelectCategoria = { galleryViewModel.selectCategoria(it) },
                onSearch = { galleryViewModel.search(it) },
                onItemClick = { itemId ->
                    navController.navigate(Routes.detail(itemId))
                },
                onLogout = {
                    authViewModel.logout()
                    navController.navigate(Routes.LOGIN) {
                        popUpTo(0) { inclusive = true }
                    }
                }
            )
        }

        composable(
            route = Routes.DETAIL,
            arguments = listOf(navArgument("itemId") { type = NavType.StringType })
        ) { backStackEntry ->
            val itemId = backStackEntry.arguments?.getString("itemId") ?: ""
            DetailScreen(
                item = galleryViewModel.getItemById(itemId),
                onBack = { navController.popBackStack() }
            )
        }
    }
}
