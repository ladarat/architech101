package com.yiing.architech101.di

import com.yiing.architech101.ui.DemoViewModel
import com.yiing.architech101.ui.login.LoginViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { DemoViewModel(get(), get()) }
    viewModel { LoginViewModel(get()) }
}
