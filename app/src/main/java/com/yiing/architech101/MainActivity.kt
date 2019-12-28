package com.yiing.architech101

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvDemo.adapter = DemoAdaptor(
            this,
            listOf(
                DemoProfile(name = "ying", code = "01"),
                DemoProfile(name = "bas", code = "02")
            )
        )

        rvDemo.layoutManager = LinearLayoutManager(this)
    }
}
