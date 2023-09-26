package com.example.b_moversapplication.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.b_moversapplication.ui.theme.pages.bookings.bookingspage

import com.example.b_moversapplication.ui.theme.pages.home.homescreenpage
import com.example.b_moversapplication.ui.theme.pages.registration.Registrationpage
import com.example.b_moversapplication.ui.theme.pages.registration.ViewdriversScreen


@Composable
fun AppNavHost (
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination:String = ROUTE_HOME) {
    NavHost(
        navController = navController,
        modifier = modifier, startDestination = startDestination
    ) {
        composable(ROUTE_HOME) {
       homescreenpage(navController)
        }
        composable(ROUTE_VIEW_DRIVER) {
            ViewdriversScreen(navController)
        }
        composable(ROUTE_ADD_DRIVER) {
            Registrationpage(navController)
        }


    }
}
