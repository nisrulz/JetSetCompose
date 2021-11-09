import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import custom.BuyMeACoffeeWidget
import custom.DesktopTheme

fun main() = application {
    val windowState = rememberWindowState()
    Window(
        onCloseRequest = ::exitApplication,
        state = windowState,
        title = "JetSetCompose-Desktop"
    ) {
        DesktopTheme {
            BuyMeACoffeeWidget("GDG UK")
        }
    }
}
