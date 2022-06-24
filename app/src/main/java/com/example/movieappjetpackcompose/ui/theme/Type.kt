package com.example.movieappjetpackcompose.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.movieappjetpackcompose.R.font.*

val poppinsFonts = FontFamily(
    /** 100 **/
    Font(poppins_thin, FontWeight.Thin),
    /** 100 **/
    Font(poppins_thin_italic, FontWeight.Thin, FontStyle.Italic),
    /** 200 **/
    Font(poppins_extra_light, FontWeight.ExtraLight),
    /** 200 **/
    Font(poppins_extra_light_italic, FontWeight.ExtraLight, FontStyle.Italic),
    /** 400 **/
    Font(poppins_regular, FontWeight.Normal),
    /** 400 **/
    Font(poppins_italic, FontWeight.Normal, FontStyle.Italic),
    /** 500 **/
    Font(poppins_medium, FontWeight.Medium),
    /** 500 **/
    Font(poppins_medium_italic, FontWeight.Medium, FontStyle.Italic),
    /** 600 **/
    Font(poppins_semi_bold, FontWeight.SemiBold),
    /** 600 **/
    Font(poppins_semi_bold_italic, FontWeight.SemiBold, FontStyle.Italic),
    /** 700 **/
    Font(poppins_bold, FontWeight.Bold),
    /** 700 **/
    Font(poppins_bold_italic, FontWeight.Bold, FontStyle.Italic),
    /** 800 **/
    Font(poppins_extra_bold, FontWeight.ExtraBold),
    /** 800 **/
    Font(poppins_extra_bold_italic, FontWeight.ExtraBold, FontStyle.Italic),
    /** 900 **/
    Font(poppins_black, FontWeight.Black),
    /** 900 **/
    Font(poppins_black_italic, FontWeight.Black, FontStyle.Italic),
)
val productSansFonts = FontFamily(
    /** 400 **/
    Font(productsans_400, FontWeight.Normal),
    /** 400 **/
    Font(productsans_400_italic, FontWeight.Normal, FontStyle.Italic),
    /** 700 **/
    Font(productsans_700_bold, FontWeight.Bold),
    /** 700 **/
    Font(productsans_700_italic, FontWeight.Bold, FontStyle.Italic),
)
val sourceSansPro = FontFamily(
    /** 200 **/
    Font(sourcesanspro_extra_light, FontWeight.ExtraLight),
    /** 200 **/
    Font(sourcesanspro_extra_light_italic, FontWeight.ExtraLight, FontStyle.Italic),
    /** 300 **/
    Font(sourcesanspro_light, FontWeight.Light),
    /** 300 **/
    Font(sourcesanspro_light_italic, FontWeight.Light, FontStyle.Italic),
    /** 400 **/
    Font(sourcesanspro_regular, FontWeight.Normal),
    /** 400 **/
    Font(sourcesanspro_italic, FontWeight.Normal, FontStyle.Italic),
    /** 600 **/
    Font(sourcesanspro_semi_bold, FontWeight.SemiBold),
    /** 600 **/
    Font(sourcesanspro_semi_bold_italic, FontWeight.SemiBold, FontStyle.Italic),
    /** 700 **/
    Font(sourcesanspro_bold, FontWeight.Bold),
    /** 700 **/
    Font(sourcesanspro_bold_italic, FontWeight.Bold, FontStyle.Italic),
    /** 900 **/
    Font(sourcesanspro_black, FontWeight.Black),
    /** 900 **/
    Font(sourcesanspro_black_italic, FontWeight.Black, FontStyle.Italic),
)

val BVTTypography = CustomTypography()
class CustomTypography(
    // ==== Poppins ====
    val popSemiBold14sp: TextStyle = TextStyle(
        fontFamily = poppinsFonts,
        fontWeight = FontWeight.SemiBold,
        fontSize = 14.sp,
    ),
    val popSemiBold18sp: TextStyle = TextStyle(
        fontFamily = poppinsFonts,
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp,
    ),
    val popBold14sp: TextStyle = TextStyle(
        fontFamily = poppinsFonts,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
    ),
    val pop18sp: TextStyle = TextStyle(
        fontFamily = poppinsFonts,
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp,
    ),
    val pop10sp: TextStyle = TextStyle(
        fontFamily = poppinsFonts,
        fontWeight = FontWeight.Normal,
        fontSize = 10.sp,
    ),
    val pop12spLetter07: TextStyle = TextStyle(
        fontFamily = poppinsFonts,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        letterSpacing = 0.83.em,
    ),
    // ==== Product Sans ====
    val proSans12sp: TextStyle = TextStyle(
        fontFamily = productSansFonts,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
    ),
    val proSans12spLetter05: TextStyle = TextStyle(
        fontFamily = productSansFonts,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        letterSpacing = 0.05.em
    ),
    val proSans14sp: TextStyle = TextStyle(
        fontFamily = productSansFonts,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
    ),
    val proSans14spLetter05: TextStyle = TextStyle(
        fontFamily = productSansFonts,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        letterSpacing = 0.05.em
    ),
    val proSans16sp: TextStyle = TextStyle(
        fontFamily = productSansFonts,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
    ),
    val proSansBold16spLetter05: TextStyle = TextStyle(
        fontFamily = productSansFonts,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        letterSpacing = 0.05.em
    ),
    val proSansBold16sp: TextStyle = TextStyle(
        fontFamily = productSansFonts,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
    ),
    // ==== Source Sans Pro ====
    val sourceSans14sp: TextStyle = TextStyle(
        fontFamily = sourceSansPro,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
    ),
    val sourceSansBold16sp: TextStyle = TextStyle(
        fontFamily = sourceSansPro,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
    ),
    val sourceSansBold16spLetter1: TextStyle = TextStyle(
        fontFamily = sourceSansPro,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        letterSpacing = 0.1.em
    ),
    val sourceSansSemiBold18sp: TextStyle = TextStyle(
        fontFamily = sourceSansPro,
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp,
    ),
    val sourceSans10sp: TextStyle = TextStyle(
        fontFamily = sourceSansPro,
        fontWeight = FontWeight.Normal,
        fontSize = 10.sp,
    ),
    val sourceSans16sp: TextStyle = TextStyle(
        fontFamily = sourceSansPro,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
    ),
    val sourceSans24sp: TextStyle = TextStyle(
        fontFamily = sourceSansPro,
        fontWeight = FontWeight.Normal,
        fontSize = 24.sp,
    ),
    val sourceSans36sp: TextStyle = TextStyle(
        fontFamily = sourceSansPro,
        fontWeight = FontWeight.Normal,
        fontSize = 36.sp,
    ),
)

val Typography = Typography(
    h4 = TextStyle(
        fontFamily = poppinsFonts,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    body2 = TextStyle(
        fontFamily = poppinsFonts,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp
    ),
    subtitle1 = TextStyle(
        fontFamily = poppinsFonts,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp
    ),
    button = TextStyle(
        fontFamily = poppinsFonts,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
        letterSpacing = 0.01.em
    )
)
