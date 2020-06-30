package com.example.CoroutinesFlow.data.api

import com.example.CoroutinesFlow.data.model.User

interface ApiHelper{

    suspend fun getUsers(): List<User>
}