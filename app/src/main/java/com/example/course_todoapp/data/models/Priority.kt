package com.example.course_todoapp.data.models

import androidx.compose.ui.graphics.Color

enum class Priority(val color: Color) {
    HIGH(Color.Red),
    MEDIUM(Color.Yellow),
    LOW(Color.Green),
    NONE(Color.White)
}