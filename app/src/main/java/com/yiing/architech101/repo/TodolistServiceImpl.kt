package com.yiing.architech101.repo

import com.yiing.architech101.core.service.createRetrofitBuilder

class TodolistServiceImpl {
    fun createService(): TodoService {
        return createRetrofitBuilder(
            TodoService::class.java
        )
    }
}