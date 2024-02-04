package com.example.todolist.feature_todo.data.local.dto

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Timestamp

@Entity(tableName = "Todo")

data class LocalTodoItem(
val title: String,
val description: String,
val timestamp: Long,
val completed: Boolean,
val archived: Boolean,

@PrimaryKey(autoGenerate = true)
val id: Int?

)
