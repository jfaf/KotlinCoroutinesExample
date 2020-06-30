package com.example.CoroutinesFlow.data.api

import com.example.CoroutinesFlow.data.model.User

class ApiHelperImpl(private val apiService: ApiService): ApiHelper {

    override suspend fun getUsers(): List<User> {
        return apiService.getUsers()
    }
}