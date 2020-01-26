package com.yiing.architech101.data

import io.reactivex.Single
import retrofit2.http.Body
import retrofit2.http.POST

interface LoginService {

    @POST("login")
    fun login(@Body loginRequest: LoginRequest): Single<LoginResponse>
}