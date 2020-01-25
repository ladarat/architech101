package com.yiing.architech101.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.yiing.architech101.core.AppSchedulerProvider
import com.yiing.architech101.core.SchedulerProvider
import com.yiing.architech101.repo.TodolistRepoImpl
import com.yiing.architech101.repo.TodolistRepository
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.addTo

class DemoViewModel constructor(
    val todolistRepo: TodolistRepository,
    val scheduleProvider: SchedulerProvider
) :
    ViewModel() {
    private val disposable = CompositeDisposable()
    private val _data = MediatorLiveData<List<DemoProfile>>()
    val data: LiveData<List<DemoProfile>>
        get() = _data

    private val _loading = MediatorLiveData<String>()
    val loading: LiveData<String>
        get() = _loading

    fun loading(data: String) {
        _loading.value = data
    }

    fun hideLoading(data: String) {
        _loading.value = data
    }

    fun loadData() {
        todolistRepo.getTodoList()
            .doOnSubscribe { loading("loading") }
            .doOnTerminate { hideLoading("hide loading") }
            .observeOn(scheduleProvider.main())// ถ้าทำเสร็จให้กลับที่ main trade
            .subscribeOn(scheduleProvider.io())// background trade
            .subscribe({
                _data.value = it
            }, {
                Log.d("DemoViewModel err ", it.message)
            })
            .addTo(disposable)

        Log.d("DemoViewModel", "loadData")
    }
}