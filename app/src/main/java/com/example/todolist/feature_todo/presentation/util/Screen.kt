package com.example.todolist.feature_todo.presentation.util

sealed class Screen(val route: String) {
    object TodoItemListScreen : Screen("todoItemList_Screen")
    object TodoNewUpdateScreen : Screen("todoNewUpdate_Screen")
}