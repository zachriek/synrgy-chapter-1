package menu

fun quitMenu() {
    println("Ingin memilih menu lagi? (y/n)")

    when (readlnOrNull()) {
        null -> {
            println("Nilai tidak valid")
            quitMenu()
        }
        "y" -> mainMenu()
        else -> return
    }
}