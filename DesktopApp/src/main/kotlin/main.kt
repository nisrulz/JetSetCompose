import androidx.compose.ui.window.singleWindowApplication
import custom.BuyMeACoffeeWidget
import custom.DesktopTheme

fun main() = singleWindowApplication(
    title = "JetSetCompose-Desktop"
) {
    DesktopTheme {
        BuyMeACoffeeWidget("GDG UK")
    }
}
