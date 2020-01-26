package com.yiing.architech101.ui.login

import com.yiing.architech101.domain.LoginDomainRequest

data class LoginUiModel(
    val userName: String,
    val password: String
)

fun LoginUiModel.mapToDomain(): LoginDomainRequest =
    LoginDomainRequest(
        userName = userName,
        passWord = password
    )