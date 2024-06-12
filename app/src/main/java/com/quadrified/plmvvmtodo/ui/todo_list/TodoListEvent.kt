package com.quadrified.plmvvmtodo.ui.todo_list

import com.quadrified.plmvvmtodo.data.Todo

sealed class TodoListEvent {
    data class DeleteTodo(val todo: Todo) : TodoListEvent()
    data class OnDoneChange(val todo: Todo, val isDone: Boolean) : TodoListEvent()
    object OnUndoDeleteClick : TodoListEvent()
    data class OnTodoClick(val todo: Todo) : TodoListEvent()
    object OnAddTodoClick : TodoListEvent()
}