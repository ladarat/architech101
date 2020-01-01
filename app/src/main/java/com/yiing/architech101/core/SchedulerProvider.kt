package com.yiing.architech101.core

import io.reactivex.Scheduler


interface SchedulerProvider {

    fun main(): Scheduler

    fun computation(): Scheduler

    fun io(): Scheduler
}