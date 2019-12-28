package com.yiing.architech101.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.yiing.architech101.ui.DemoProfile

class DemoViewModel : ViewModel() {

    private val _data = MediatorLiveData<List<DemoProfile>>()
    val data: LiveData<List<DemoProfile>>
        get() = _data

    fun loadData() {
        val data = listOf(
            DemoProfile(name = "bas", code = "02"),
            DemoProfile(name = "ying", code = "01")
        )

        Log.d("DemoViewModel", "loadData")

        _data.value = data
    }
}