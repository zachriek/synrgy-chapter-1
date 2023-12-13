package figure

import helper.ANSI_RESET

class Triangle(
    private val _rows: Int,
    private val _color: String
): Figure {
    override val rows = _rows
    override val color = _color

    override fun show() {
        for (i in 1..rows) {
            for (space in 1..rows - i) {
                print("  ")
            }

            for (j in 1..2 * i - 1) {
                print("$color* $ANSI_RESET")
            }

            println()
        }

        println("Piramida Bintang")
        println()
    }
}