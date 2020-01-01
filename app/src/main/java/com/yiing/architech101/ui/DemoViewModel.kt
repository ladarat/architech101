package com.yiing.architech101.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel

class DemoViewModel : ViewModel() {

    private val _data = MediatorLiveData<List<DemoProfile>>()
    val data: LiveData<List<DemoProfile>>
        get() = _data

    fun loadData() {
        val data = listOf(
            DemoProfile(userId = "bas", id = "02"),
            DemoProfile(userId = "ying", id = "01")
        )

        Log.d("DemoViewModel", "loadData")

        _data.value = data
    }
}