package menu

import helper.menus

fun mainMenu() {
//    Welcome
    println("Selamat Datang")
    println("------------------")

//    Show Menu
    for (menu in menus) {
        println(menu)
    }

    println("Pilih menu di atas (contoh: 1)")

//    Input Menu
    val option: Int? = readlnOrNull()?.toIntOrNull()

//    Check Menu Option
    if (!checkOptionNull(option)) {
        figureMenu(option!!)
    } else {
        println("Nilai tidak valid")
        mainMenu()
    }
}

fun checkOptionNull(option: Int?): Boolean {
//    Check if option is null or option not in 1 - menus size
    return option == null || option !in 1..menus.size
}