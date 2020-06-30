package com.example.CoroutinesFlow.util

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.CoroutinesFlow.data.api.ApiHelper
import com.example.CoroutinesFlow.data.repositories.MainRepository
import com.example.CoroutinesFlow.ui.main.viewmodel.MainViewModel

/*
 This is a factory method.
 A factory method is a method that returns an instance of the same class.
 */

class ViewModelFactory(private val apiHelper: ApiHelper) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(MainRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}