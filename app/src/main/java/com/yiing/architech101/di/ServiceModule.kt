package com.yiing.architech101.di

import com.yiing.architech101.core.service.createRetrofitBuilder
import com.yiing.architech101.data.LoginService
import com.yiing.architech101.repo.TodolistServiceImpl
import org.koin.dsl.module

val serviceModule = module {
    single { createRetrofitBuilder(LoginService::class.java) }
    single { TodolistServiceImpl().createService() }
}