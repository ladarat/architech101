package com.yiing.architech101.repo

import com.yiing.architech101.ui.DemoProfile
import io.reactivex.Single
import retrofit2.http.GET

interface TodoService {
    @GET("todos")
    fun getTodoList(): Single<List<DemoProfile>>
}