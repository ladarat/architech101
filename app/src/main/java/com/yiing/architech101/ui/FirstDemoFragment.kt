package com.yiing.architech101.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController

import com.yiing.architech101.R
import kotlinx.android.synthetic.main.fragment_first_demo.*
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class FirstDemoFragment : Fragment() {

    private val viewModel: DemoViewModel by sharedViewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first_demo, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        btnToSecond.setOnClickListener {
            viewModel.loadData()
            findNavController()
                .navigate(R.id.secondFragment, bundleOf("keyyyy" to "from first"))
        }
    }


}
