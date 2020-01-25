package com.yiing.architech101.core.ui

import android.os.Bundle
import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

abstract class BaseFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    protected fun next(@IdRes resId: Int, bundle: Bundle? = null) {
        findNavController()
            .navigate(resId, bundle)
    }

}