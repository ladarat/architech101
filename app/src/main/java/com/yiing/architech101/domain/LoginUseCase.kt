package com.yiing.architech101.domain

import com.yiing.architech101.core.SchedulerProvider
import io.reactivex.Single

class LoginUseCase constructor(
    private val schedulerProvider: SchedulerProvider,
    private val loginRepository: LoginRepository
) {

    fun execute(loginDomainRequest: LoginDomainRequest): Single<LoginDomainResponse> {
        return loginRepository.login(loginDomainRequest)
            .observeOn(schedulerProvider.main())
            .subscribeOn(schedulerProvider.io())
    }
}