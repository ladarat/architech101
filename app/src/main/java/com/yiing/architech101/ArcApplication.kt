package com.yiing.architech101

import android.app.Application
import com.yiing.architech101.di.appModule
import com.yiing.architech101.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class ArcApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        setupKoin()
    }

    private fun setupKoin() {
        startKoin {
            androidContext(this@ArcApplication)// provide context ให koin
            modules(
                listOf(
                    appModule,
                    viewModelModule
                )
            )
        }
    }
}