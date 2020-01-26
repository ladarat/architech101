package com.yiing.architech101.data

import com.google.gson.annotations.SerializedName
import com.yiing.architech101.domain.LoginDomainRequest

data class LoginRequest(
    @SerializedName("userName") val userName: String,
    @SerializedName("password") val password: String
)

fun LoginDomainRequest.mapToData(): LoginRequest =
    LoginRequest(
        userName = userName,
        password = passWord
    )

