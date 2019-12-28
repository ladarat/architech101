package com.yiing.architech101.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.yiing.architech101.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: DemoViewModel
    private val adaptor: DemoAdaptor
            by lazy { DemoAdaptor(this, listOf()) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider.NewInstanceFactory().create(DemoViewModel::class.java)
        observe()
        viewModel.loadData()

        setUpView()
    }

    private fun observe() {
        viewModel.data.observe(this, Observer {
            adaptor.update(it)
        })
    }

    private fun setUpView() {
        rvDemo.adapter = adaptor
        rvDemo.layoutManager = LinearLayoutManager(this)
    }
}
