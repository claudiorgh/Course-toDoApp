package com.example.course_todoapp.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.course_todoapp.util.Constants.DATABASE_TABLE

@Entity(tableName = DATABASE_TABLE)
data class ToDoTask(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    var title: String,
    var descriptor: String,
    var priority: Priority

)