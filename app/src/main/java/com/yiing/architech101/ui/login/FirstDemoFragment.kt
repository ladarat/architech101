package com.yiing.architech101.ui.login

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf

import com.yiing.architech101.R
import com.yiing.architech101.core.ui.BaseFragment
import com.yiing.architech101.ui.DemoViewModel
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.addTo
import kotlinx.android.synthetic.main.fragment_first_demo.*
import org.koin.androidx.viewmodel.ext.android.sharedViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class FirstDemoFragment : BaseFragment() {

    private val viewModel: DemoViewModel by sharedViewModel()
    private val loginViewModel: LoginViewModel by viewModel()

    private val disposable = CompositeDisposable()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        loginViewModel.login.subscribe {
            Log.d("Login", "name: ${it.name}, gender: ${it.gender}")
        }.addTo(disposable)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first_demo, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        btnToSecond.setOnClickListener {
            //            viewModel.loadData()
            val loginUiModel = LoginUiModel(
                loginEdUserName.text.toString(),
                loginEdPassword.text.toString()
            )
            loginViewModel.callLogin(loginUiModel)


//            next(R.id.secondFragment, bundleOf("loginRes" to "from first"))
        }
    }
}
