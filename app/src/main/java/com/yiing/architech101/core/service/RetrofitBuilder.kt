package com.yiing.architech101.core.service

import com.yiing.architech101.BuildConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

fun <T> createRetrofitBuilder(clazzService: Class<T>): T {
    return Retrofit.Builder()
        .client(createOkHttpClient())
        .baseUrl("http://192.168.43.82:8888/")
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(clazzService)
}

private fun createOkHttpClient(): OkHttpClient {
        val bodyLogging = HttpLoggingInterceptor()
        bodyLogging.level = HttpLoggingInterceptor.Level.BODY

    val client = OkHttpClient.Builder()
        .connectTimeout(30, TimeUnit.SECONDS)
        .readTimeout(20, TimeUnit.SECONDS)

    if (BuildConfig.DEBUG) {
            client.addNetworkInterceptor(bodyLogging)
    }

    return client.build()
}
