package com.example.course_todoapp.navigation

import androidx.navigation.NavHostController
import com.example.course_todoapp.util.Actions
import com.example.course_todoapp.util.Constants.LIST_SCREEN

class Screens(navController: NavHostController) {

    val list: (Actions) -> Unit = { action ->
        navController.navigate(route = "list/${action.name}") {
            popUpTo(LIST_SCREEN) { inclusive = true }
        }
    }

    val task: (Int) -> Unit = { taskId ->
        navController.navigate(route = "task/$taskId") {

        }
    }
}