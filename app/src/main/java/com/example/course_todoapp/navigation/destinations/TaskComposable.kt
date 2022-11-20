package com.example.course_todoapp.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.course_todoapp.util.Actions
import com.example.course_todoapp.util.Constants.TASK_ARGUMENT_KEY
import com.example.course_todoapp.util.Constants.TASK_SCREEN

fun NavGraphBuilder.taskComposable(navigateToListScreen: (Actions) -> Unit) {
    composable(route = TASK_SCREEN, arguments = listOf(navArgument(TASK_ARGUMENT_KEY) {
        type = NavType.IntType
    })) {
    }
}