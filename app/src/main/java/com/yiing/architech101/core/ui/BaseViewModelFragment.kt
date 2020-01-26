package com.yiing.architech101.core.ui

import androidx.lifecycle.ViewModel

abstract class BaseViewModelFragment<V : ViewModel> : BaseFragment() {
    abstract fun initViewModel()
    lateinit var viewModel: V
}
