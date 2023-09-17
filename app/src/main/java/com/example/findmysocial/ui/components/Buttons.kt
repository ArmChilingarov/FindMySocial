package com.example.findmysocial.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.findmysocial.R
import com.example.findmysocial.ui.theme.DisabledTextColor
import com.example.findmysocial.ui.theme.FindMySocialTheme
import com.example.findmysocial.ui.theme.TelegramColor
import com.example.findmysocial.ui.theme.ViberColor
import com.example.findmysocial.ui.theme.WhatsAppColor


@Composable
fun WhatsappButton() {
    OutlinedButton(modifier = Modifier,
        enabled = true,
        colors = ButtonDefaults.outlinedButtonColors(
            contentColor = WhatsAppColor,
            disabledContentColor = DisabledTextColor
        ),
        border = ButtonDefaults.outlinedButtonBorder.copy(brush = SolidColor(WhatsAppColor)),
        onClick = {
        }) {
        Image(
            modifier = Modifier.size(24.dp),
            painter = painterResource(id = R.drawable.ic_whatsapp),
            contentDescription = "Whatsapp logo"
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = "Whatsapp")
    }
}

@Composable
fun ViberButton() {
    OutlinedButton(modifier = Modifier,
        enabled = true,
        colors = ButtonDefaults.outlinedButtonColors(
            contentColor = ViberColor,
            disabledContentColor = DisabledTextColor
        ),
        border = ButtonDefaults.outlinedButtonBorder.copy(brush = SolidColor(ViberColor)),
        onClick = {
        }) {
        Image(
            modifier = Modifier.size(24.dp),
            painter = painterResource(id = R.drawable.ic_viber),
            contentDescription = "Whatsapp logo"
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = "Call")
    }
}

@Composable
fun TelegramButton() {
    OutlinedButton(modifier = Modifier,
        enabled = true,
        colors = ButtonDefaults.outlinedButtonColors(
            contentColor = TelegramColor,
            disabledContentColor = DisabledTextColor
        ),
        border = ButtonDefaults.outlinedButtonBorder.copy(brush = SolidColor(TelegramColor)),
        onClick = {
        }) {
        Image(
            modifier = Modifier.size(24.dp),
            painter = painterResource(id = R.drawable.ic_telegram),
            contentDescription = "Whatsapp logo"
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = "Call")
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FindMySocialTheme {
        Column {
            WhatsappButton()
            ViberButton()
            TelegramButton()
        }
    }
}