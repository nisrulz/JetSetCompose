package com.nisrulz.androidapp.custom

import android.content.Intent
import android.net.Uri

object Utils {

    fun getPayPalLink(amount: Int): Intent {
        val webpage: Uri = Uri.parse("https://www.paypal.com/paypalme/nisrulz/${amount}usd")
        return Intent(Intent.ACTION_VIEW, webpage)
    }
}