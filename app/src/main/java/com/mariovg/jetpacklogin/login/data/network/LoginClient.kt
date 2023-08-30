package com.mariovg.jetpacklogin.login.data.network

import com.mariovg.jetpacklogin.login.data.network.response.LoginResponse
import retrofit2.Response
import retrofit2.http.GET

interface LoginClient {
    @GET("/v3/f78c9d3-28b-481-9cf1-6d6ff78fa014")
    suspend fun doLogin():Response<LoginResponse>
}