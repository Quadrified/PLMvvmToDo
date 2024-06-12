package com.quadrified.plmvvmtodo.data

import androidx.room.PrimaryKey

data class Todo(
    @PrimaryKey val id: Int? = null,
    val title: String,
    val description: String?,
    val isDone: Boolean
)
