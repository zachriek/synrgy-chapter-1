package figure

interface Figure {
    val rows: Int
    val color: String

    abstract fun show()
}