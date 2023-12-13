package figure

import helper.ANSI_RESET

class Square(
    private val _rows: Int,
    private val _color: String
): Figure {
    override val rows = _rows
    override val color = _color

    override fun show() {
        for (i in 1..rows) {
            for (j in 1 .. rows) {
                print("$color*  $ANSI_RESET")
            }

            println()
        }

        println("Persegi")
        println()
    }
}