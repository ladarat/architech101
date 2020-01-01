package com.yiing.architech101.repo

import com.yiing.architech101.ui.DemoProfile
import io.reactivex.Single

interface TodolistRepository {
    fun getTodoList(): Single<List<DemoProfile>>
}