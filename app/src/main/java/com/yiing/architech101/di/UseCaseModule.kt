package com.yiing.architech101.di

import com.yiing.architech101.domain.LoginUseCase
import org.koin.dsl.module

val useCaseModule = module {
    factory { LoginUseCase(get(), get()) }
}