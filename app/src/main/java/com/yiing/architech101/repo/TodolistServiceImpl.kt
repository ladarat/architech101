package com.yiing.architech101.repo

import com.yiing.architech101.core.createRetrofitBuilder

class TodolistServiceImpl {
    fun createService(): TodoService {
        return createRetrofitBuilder(TodoService::class.java)
    }
}