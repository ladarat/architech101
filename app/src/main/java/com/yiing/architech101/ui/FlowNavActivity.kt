package com.yiing.architech101.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.yiing.architech101.R
import kotlinx.android.synthetic.main.activity_flow_nav.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class FlowNavActivity : AppCompatActivity() {

    private val viewModel: DemoViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flow_nav)

        observe()
        viewModel.loadData()
        busExamTv.text = "loding"
    }

    private fun observe() {
//        busExamTv.text =
        viewModel.loading.observe(this, Observer {
            busExamTv.text = it
        })
    }


}
