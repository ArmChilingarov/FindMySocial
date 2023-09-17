package com.example.findmysocial

import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.text.input.TextFieldValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory

class MainViewModel : ViewModel() {
    val phoneNumberTextField = mutableStateOf(TextFieldValue(""))
    fun updateText(newText: TextFieldValue) {
        phoneNumberTextField.value = newText
    }


    companion object {
        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                MainViewModel()
            }
        }
    }
}