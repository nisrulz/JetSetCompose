import androidx.compose.desktop.Window
import custom.BuyMeACoffeeWidget
import custom.DesktopTheme

fun main() = Window {
    DesktopTheme {
        BuyMeACoffeeWidget("GDG UK")
    }
}