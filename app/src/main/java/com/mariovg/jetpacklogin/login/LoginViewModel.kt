package com.mariovg.jetpacklogin.login

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel:ViewModel() {

    private val _email = MutableLiveData<String>()
    val email : LiveData<String> = _email

    fun onLoginChanged(email: String){
        _email.value = email

    }
}