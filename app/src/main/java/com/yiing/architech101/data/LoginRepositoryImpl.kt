package com.yiing.architech101.data

import com.yiing.architech101.domain.LoginDomainRequest
import com.yiing.architech101.domain.LoginDomainResponse
import com.yiing.architech101.domain.LoginRepository
import io.reactivex.Single

class LoginRepositoryImpl constructor(
    private val loginService: LoginService
): LoginRepository{

    override fun login(loginDomainRequest: LoginDomainRequest): Single<LoginDomainResponse> {
        return loginService.login(loginDomainRequest.mapToData())
            .map { it.mapToDomain() }
    }

}