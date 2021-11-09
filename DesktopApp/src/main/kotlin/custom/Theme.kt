package custom

import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val CustomLightColorPalette = lightColors(
    primary = MyPrimaryColor,
    primaryVariant = MyBorderColor,
    secondary = MyLightBgColor
)

@Composable
fun DesktopTheme(content: @Composable() () -> Unit) {
    MaterialTheme(
        colors = CustomLightColorPalette,
        content = content
    )
}