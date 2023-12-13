package figure

import helper.ANSI_RESET

class Star(
    private val _rows: Int,
    private val _color: String
): Figure {
    override val rows = _rows
    override val color = _color

    override fun show() {
        for (i in rows downTo 1) {
            for (space in 1..rows - 1 - (i - 1)) {
                print("  ")
            }

            for (j in 1..2 * i - 1) {
                if (j == 1 || j == 2 * i - 1) {
                    print("$color* $ANSI_RESET")
                } else {
                    print("  ")
                }
            }

            println()
        }

        for (i in 2..rows) {
            for (space in 1..rows - i) {
                print("  ")
            }

            for (j in 1..2 * i - 1) {
                if (j == 1 || j == 2 * i - 1) {
                    print("$color* $ANSI_RESET")
                } else {
                    print("  ")
                }
            }

            println()
        }

        println("X Bintang")
        println()
    }
}