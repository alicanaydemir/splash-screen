package com.aydemir.samples.splash

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    val isLoading = MutableStateFlow(true)

    init {
        viewModelScope.launch {
            delay(2000)
            isLoading.value = false
        }
    }
}