package com.example.CoroutinesFlow.data.repositories

import com.example.CoroutinesFlow.data.api.ApiHelper

class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getUsers() = apiHelper.getUsers()

}