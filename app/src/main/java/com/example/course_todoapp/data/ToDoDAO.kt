package com.example.course_todoapp.data

import androidx.room.*
import com.example.course_todoapp.data.models.ToDoTask
import kotlinx.coroutines.flow.Flow

@Dao
interface ToDoDAO {

    @Query(value = "SELECT * FROM todo_table ORDER BY id ASC")
    fun getAllTask(): Flow<List<ToDoTask>>

    @Query(value = "SELECT * FROM TODO_TABLE WHERE id =:taskId")
    fun getSelectedTask(taskId: Int):Flow<ToDoTask>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addTask(toDoTask: ToDoTask)

    @Update
    suspend fun updateTask(toDoTask: ToDoTask)

    @Delete
    suspend fun deleteTask(toDoTask: ToDoTask)

    @Query(value = "DELETE FROM TODO_TABLE ")
    suspend fun deleteAllTask()

    @Query(value = "SELECT * FROM TODO_TABLE WHERE title LIKE :searchQuery OR descriptor LIKE :searchQuery")
    fun searchDatabase(searchQuery:String):Flow<List<ToDoTask>>

    @Query(value = "SELECT * FROM TODO_TABLE ORDER BY CASE WHEN priority LIKE 'L%' THEN 1 WHEN priority LIKE 'M%' THEN 2 WHEN priority LIKE 'H%' THEN 3 END")
    fun sortByLowPriority():Flow<List<ToDoTask>>

    @Query(value = "SELECT * FROM TODO_TABLE ORDER BY CASE WHEN priority LIKE 'L%' THEN 3 WHEN priority LIKE 'M%' THEN 2 WHEN priority LIKE 'H%' THEN 1 END")
    fun sortByHighPriority():Flow<List<ToDoTask>>

}