package com.nisrulz.androidapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.nisrulz.androidapp.custom.BuyMeACoffeeWidget
import com.nisrulz.androidapp.ui.theme.AndroidAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidAppTheme {
               BuyMeACoffeeWidget(name = "Nishant Srivastava")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AndroidAppTheme {
        BuyMeACoffeeWidget(name = "Nishant Srivastava")
    }
}