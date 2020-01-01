package com.yiing.architech101.repo

import com.yiing.architech101.ui.DemoProfile
import io.reactivex.Single

class TodolistRepoImpl constructor(
    val todoService: TodoService = TodolistServiceImpl().createService()
) : TodolistRepository {
    override fun getTodoList(): Single<List<DemoProfile>> {
        return todoService.getTodoList()
    }

}