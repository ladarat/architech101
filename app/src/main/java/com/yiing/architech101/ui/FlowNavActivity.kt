package com.yiing.architech101.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.yiing.architech101.R
import kotlinx.android.synthetic.main.activity_flow_nav.*

class FlowNavActivity : AppCompatActivity() {
    private lateinit var viewModel: DemoViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flow_nav)

        viewModel = ViewModelProvider.NewInstanceFactory().create(DemoViewModel::class.java)
        observe()
        viewModel.loadData()

    }

    private fun observe() {
        busExamTv.text = "loding"
    }


}
