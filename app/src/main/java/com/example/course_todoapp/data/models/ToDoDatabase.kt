package com.example.course_todoapp.data.models

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.course_todoapp.data.ToDoDAO

@Database(entities = [ToDoTask::class], version = 1, exportSchema = false)
abstract class ToDoDatabase:RoomDatabase() {
    abstract fun ToDoDAO():ToDoDAO
}