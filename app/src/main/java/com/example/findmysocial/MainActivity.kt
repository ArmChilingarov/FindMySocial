@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.findmysocial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.findmysocial.ui.components.SelectCountryWithCountryCode
import com.example.findmysocial.ui.components.TelegramButton
import com.example.findmysocial.ui.components.ViberButton
import com.example.findmysocial.ui.components.WhatsappButton
import com.example.findmysocial.ui.theme.FindMySocialTheme

class MainActivity : ComponentActivity() {
    val mainViewModel by viewModels<MainViewModel> { MainViewModel.Factory }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FindMySocialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen(mainViewModel)
                }
            }
        }
    }
}

@Composable
fun MainScreen(
    viewModel: MainViewModel
) {
    val text by viewModel.phoneNumberTextField
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        SelectCountryWithCountryCode()
        Spacer(modifier = Modifier.height(16.dp))
        WhatsappButton()
        ViberButton()
        TelegramButton()
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FindMySocialTheme {
        MainScreen(MainViewModel())
    }
}