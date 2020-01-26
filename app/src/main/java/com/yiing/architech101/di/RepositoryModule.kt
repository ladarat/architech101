package com.yiing.architech101.di

import com.yiing.architech101.data.LoginRepositoryImpl
import com.yiing.architech101.domain.LoginRepository
import org.koin.dsl.module

val repositoryModule = module {
    single<LoginRepository> {
        LoginRepositoryImpl(get())
    }
}