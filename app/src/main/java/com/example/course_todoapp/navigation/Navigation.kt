package com.example.course_todoapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.course_todoapp.util.Constants.LIST_SCREEN
import com.example.course_todoapp.navigation.destinations.listComposable
import com.example.course_todoapp.navigation.destinations.taskComposable
import com.example.course_todoapp.ui.viewmodels.SharedViewModel

@Composable
fun SetupNavigation(navController: NavHostController, sharedViewModel: SharedViewModel) {
    val screen = remember(navController) {
        Screens(navController = navController)
    }

    NavHost(navController = navController, startDestination = LIST_SCREEN) {
        listComposable(navigateToTaskScreen = screen.task, sharedViewModel = sharedViewModel)
        taskComposable(navigateToListScreen = screen.list)
    }
}