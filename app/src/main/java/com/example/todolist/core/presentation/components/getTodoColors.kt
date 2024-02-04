package com.example.todolist.core.presentation.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.example.todolist.feature_todo.domain.model.TodoItem

data class TodoItemColors(
    val backgroundColor: Color,
    val textColor: Color,
    val archivedIconColor: Color,
    val checkColor: Color
)

@Composable
fun getTodoColors(todo: TodoItem): TodoItemColors {
    return if (todo.archived) {

        TodoItemColors(
            backgroundColor = MaterialTheme.colorScheme.secondary.copy(alpha = 0.6f), // for transparent background
            textColor = MaterialTheme.colorScheme.onSecondary,
            archivedIconColor = MaterialTheme.colorScheme.onSecondary,
            checkColor = if (todo.completed) MaterialTheme.colorScheme.tertiaryContainer
            else MaterialTheme.colorScheme.onSecondary
        )
    } else {
        TodoItemColors(
            backgroundColor = MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.6f), // for transparent background
            textColor = MaterialTheme.colorScheme.onPrimaryContainer,
            archivedIconColor = MaterialTheme.colorScheme.secondary,
            checkColor = if (todo.completed) MaterialTheme.colorScheme.tertiaryContainer
            else MaterialTheme.colorScheme.secondary
        )
    }

}

