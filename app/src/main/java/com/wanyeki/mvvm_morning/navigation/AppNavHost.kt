package com.wanyeki.mvvm_morning.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.wanyeki.mvvm_morning.ui.theme.screens.about.AboutScreen
import com.wanyeki.mvvm_morning.ui.theme.screens.home.HomeScreen


@Composable
fun AppNavHost(modifier: Modifier=Modifier,
               navController: NavHostController= rememberNavController(),
               startDestination:String= ROUTE_HOME){
    NavHost(navController = navController, modifier=modifier,
        startDestination = startDestination ){
        composable(ROUTE_HOME){
            HomeScreen(navController)
        }
        composable(ROUTE_ABOUT){
            AboutScreen(navController)
        }
    }



}