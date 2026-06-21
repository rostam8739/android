package com.zaneschepke.wireguardautotunnel.ui.theme

import androidx.compose.ui.graphics.Color

val OffWhite = Color(0xFFF2F2F4)
val CoolGray = Color(0xFF8D9D9F)
val LightGrey = Color(0xFFECEDEF)
val Aqua = Color(0xFF76BEBD)
val Plantation = Color(0xFF2E3538)
val Shark = Color(0xFF21272A)
val BalticSea = Color(0xFF1C1B1F)
val RoyalBlue = Color(0xFF1976D2)
val SkyBlue = Color(0xFF42A5F5)
val DarkBg = Color(0xFF121212)
// amoled
val ElectricTeal = Color(0xFF4DD0E1)

// Status colors
val SilverTree = Color(0xFF6DB58B)
val AlertRed = Color(0xFFCF6679)
val Straw = Color(0xFFD4C483)

val Disabled = CoolGray.copy(alpha = 0.4f)

// Other colors
val ConfigHeaderColor = Color(0xFFBB86FC)
val ConfigKeyColor = Color(0xFF03DAC5)
val Heart = Color(0xFFDB61A2)

sealed class ThemeColors(
    val background: Color,
    val surface: Color,
    val primary: Color,
    val secondary: Color,
    val onSurface: Color,
    val onBackground: Color,
    val outline: Color,
) {

    data object Light :
        ThemeColors(
            background = OffWhite,
            surface = OffWhite,
            primary = RoyalBlue,
            secondary = SkyBlue,
            onSurface = BalticSea,
            outline = Plantation.copy(alpha = .75f),
            onBackground = BalticSea,
        )

    data object Dark :
        ThemeColors(
            background = DarkBg,
            surface = DarkBg,
            primary = RoyalBlue,
            secondary = SkyBlue,
            onSurface = OffWhite,
            outline = CoolGray,
            onBackground = OffWhite,
        )
}
