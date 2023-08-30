package com.mariovg.jetpacklogin.login.domain

import com.mariovg.jetpacklogin.login.data.LoginRepository

class LoginUseCase {
    val repository = LoginRepository()

    suspend operator fun invoke(user: String, password: String): Boolean {
        return repository.doLogin(user, password)

    }
}