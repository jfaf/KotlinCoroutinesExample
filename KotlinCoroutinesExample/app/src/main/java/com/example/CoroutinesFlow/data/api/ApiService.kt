package com.example.CoroutinesFlow.data.api

import com.example.CoroutinesFlow.data.model.User
import retrofit2.http.GET

interface ApiService {

    @GET("users")
    suspend fun getUsers(): List<User>
}