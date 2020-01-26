package com.yiing.architech101.di

import com.yiing.architech101.core.AppSchedulerProvider
import com.yiing.architech101.core.SchedulerProvider
import com.yiing.architech101.repo.TodoService
import com.yiing.architech101.repo.TodolistRepoImpl
import com.yiing.architech101.repo.TodolistRepository
import com.yiing.architech101.repo.TodolistServiceImpl
import org.koin.dsl.module

val appModule = module {

    //    single {
//        Room.databaseBuilder(androidContext(), POSDatabase::class.java, "pos.db")
//            .fallbackToDestructiveMigration()
//            .build()
//    }


    single<TodolistRepository> { TodolistRepoImpl(get()) }
    single<SchedulerProvider> { AppSchedulerProvider() }

}
