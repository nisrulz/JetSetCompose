package custom

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun CoffeeMultiplierBox(onValueChange: (Int) -> Unit) {
    Card(
        shape = RoundedCornerShape(3.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colors.secondary)
                .border(1.dp, MaterialTheme.colors.primaryVariant)
                .padding(10.dp),
        ) {
            Text(text = "☕️ x ", textAlign = TextAlign.Center)
            MultiplierValue(value = 1) {
                onValueChange(it)
            }
            MultiplierValue(value = 3) {
                onValueChange(it)
            }
            MultiplierValue(value = 5) {
                onValueChange(it)
            }
        }
    }
}

@Composable
fun BuyMeACoffeeWidget(name: String) {
    Card(
        modifier = Modifier.fillMaxWidth().fillMaxHeight(),
        elevation = 8.dp
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(25.dp)
        ) {

            val multiplier = remember { mutableStateOf(1) }
            val nameOfUser = remember { mutableStateOf("") }
            val message = remember { mutableStateOf("") }

            HeaderText(name = name)
            Spacer(modifier = Modifier.height(15.dp))
            CoffeeMultiplierBox {
                multiplier.value = it
            }

            InputBox(value = nameOfUser.value, "Name or @your_twitter (optional)") {
                nameOfUser.value = it
            }
            Spacer(modifier = Modifier.height(10.dp))
            InputBox(
                value = message.value,
                placeholder = "Say something nice.. (optional)",
                modifier = Modifier.height(110.dp)
            ) {
                message.value = it
            }
            Spacer(modifier = Modifier.height(30.dp))

            val finalAmount = 5 * multiplier.value
            ActionButton(finalAmount)
        }
    }
}