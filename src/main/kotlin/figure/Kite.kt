package figure

import helper.ANSI_RESET

class Kite(
    private val _rows: Int,
    private val _color: String
): Figure {
    override val rows = _rows
    private val rows2 = _rows - 1
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

        for (i in rows2 downTo 1) {
            for (space in 1..rows2 - (i - 1)) {
                print("  ")
            }

            for (j in 1..2 * i - 1) {
                print("$color* $ANSI_RESET")
            }

            println()
        }

        println("Layang-layang Bintang")
        println()
    }
}