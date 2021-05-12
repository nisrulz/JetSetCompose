package com.nisrulz.androidapp.custom

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun HeaderText(name: String) {
    Text(
        buildAnnotatedString {
            append("Buy ")
            withStyle(SpanStyle(color = Color.Gray)) {
                append(name)
            }
            append(" a coffee")
        },
        fontWeight = FontWeight.Bold,
        fontSize = 25.sp
    )
}

@Composable
fun MultiplierValue(value: Int, onClickOfItem: (Int) -> Unit) {
    Box(
        modifier = Modifier
            .width(20.dp)
            .height(20.dp)
            .padding(2.dp)
            .offset(y = 3.dp)
            .background(MaterialTheme.colors.primary, CircleShape)
            .border(1.dp, MaterialTheme.colors.primaryVariant, CircleShape),
        contentAlignment = Alignment.Center
    ) {
        ClickableText(buildAnnotatedString {
            withStyle(
                SpanStyle(
                    fontSize = 10.sp,
                    color = Color.White,
                )
            ) { append(value.toString()) }
        }) {
            onClickOfItem(value)
        }

    }
}


@Composable
fun InputBox(
    value: String,
    placeholder: String,
    modifier: Modifier = Modifier,
    onValueChange: (String) -> Unit
) {
    OutlinedTextField(
        modifier = modifier.fillMaxWidth(),
        value = value,
        onValueChange = { onValueChange(it) },
        placeholder = {
            Text(text = placeholder)
        },
        keyboardOptions = KeyboardOptions(
            capitalization = KeyboardCapitalization.None,
            autoCorrect = true,
            keyboardType = KeyboardType.Text,
        )
    )
}

@Composable
fun ActionButton(finalAmount: Int) {
    Button(
        modifier = Modifier
            .fillMaxWidth(),
        shape = RoundedCornerShape(18.dp),
        onClick = {
            // TODO: Open link
        }
    ) {
        Text(text = "Support $$finalAmount")
    }
}
