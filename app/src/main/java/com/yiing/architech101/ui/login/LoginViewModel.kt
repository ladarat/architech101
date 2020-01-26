package com.yiing.architech101.ui.login

import android.util.Log
import androidx.lifecycle.ViewModel
import com.yiing.architech101.domain.LoginDomainResponse
import com.yiing.architech101.domain.LoginUseCase
import io.reactivex.Observable
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.addTo
import io.reactivex.subjects.BehaviorSubject

class LoginViewModel constructor(
    private val loginUseCase: LoginUseCase
) : ViewModel() {

    private val disposable = CompositeDisposable()

    private val _login = BehaviorSubject.create<LoginDomainResponse>()
    val login: Observable<LoginDomainResponse>
        get() = _login

    override fun onCleared() {
        super.onCleared()
        disposable.clear()
    }

    fun callLogin(loginUiModel: LoginUiModel) {
        loginUseCase.execute(loginUiModel.mapToDomain())
            .subscribe(
                {
                    _login.onNext(it)
                },
                {
                    Log.e("login", it.message)
                })
            .addTo(disposable)
    }
}