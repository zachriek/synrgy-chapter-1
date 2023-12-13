package menu

import helper.ANSI_BLUE
import helper.ANSI_GREEN
import helper.ANSI_PURPLE
import helper.ANSI_RED
import helper.ANSI_YELLOW
import helper.colors

fun colorMenu(): String {
    //    Show Colors
    for (color in colors) {
        println(color)
    }

    println("Pilih warna di atas (contoh: 1)")

//    Check Color
    when (readlnOrNull()?.toIntOrNull()) {
        null -> {
            println("Warna tidak valid!")
            return colorMenu()
        }
        1 -> return ANSI_RED
        2 -> return ANSI_YELLOW
        3 -> return ANSI_GREEN
        4 -> return ANSI_BLUE
        5 -> return ANSI_PURPLE
        else -> {
            println("Warna tidak valid!")
            return colorMenu()
        }
    }
}