package com.yiing.architech101.repo

class TodolistServiceImpl {
    fun createService(): TodoService {
        return createRetrofitBuilder(TodoService::class.java)
    }
}