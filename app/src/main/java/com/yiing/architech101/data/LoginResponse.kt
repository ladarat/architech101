package com.yiing.architech101.data

import com.google.gson.annotations.SerializedName
import com.yiing.architech101.domain.LoginDomainResponse

data class LoginResponse(
    @SerializedName("name") val name: String,
    @SerializedName("gender") val gender: String
)

fun LoginResponse.mapToDomain(): LoginDomainResponse =
    LoginDomainResponse(
        name = name,
        gender = gender
    )
