package com.yiing.architech101.domain

import io.reactivex.Single

interface LoginRepository {
    fun login(loginDomainRequest: LoginDomainRequest): Single<LoginDomainResponse>
}
