package menu

fun rowsMenu(): Int {
    println("Berapa baris yang ingin kamu tampilkan? (contoh: 5) (minimal: 3, maksimal: 19)")

//    Input Rows
    val inputRows: Int? = readlnOrNull()?.toIntOrNull()

    when {
        inputRows == null -> {
            println("Nilai tidak valid")
            return rowsMenu()
        }
        inputRows < 3 -> {
            println("Minimal 3 baris")
            return rowsMenu()
        }
        inputRows > 19 -> {
            println("Maksimal 19 baris")
            return rowsMenu()
        }
        else -> return inputRows
    }
}