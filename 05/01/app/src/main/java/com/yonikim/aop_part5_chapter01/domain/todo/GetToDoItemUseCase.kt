package com.yonikim.aop_part5_chapter01.domain.todo

import com.yonikim.aop_part5_chapter01.data.entity.ToDoEntity
import com.yonikim.aop_part5_chapter01.data.repository.ToDoRepository
import com.yonikim.aop_part5_chapter01.domain.UseCase

internal class GetToDoItemUseCase(
    private val toDoRepository: ToDoRepository
) : UseCase {

    suspend operator fun invoke(itemId: Long): ToDoEntity? {
        return toDoRepository.getToDoItem(itemId)
    }
}