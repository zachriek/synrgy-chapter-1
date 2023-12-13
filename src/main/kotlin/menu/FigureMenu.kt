package menu

import figure.Hexagon
import figure.HollowStar
import figure.InvertedTriangle
import figure.Kite
import figure.Rectangle
import figure.Square
import figure.Star
import figure.Parallelogram
import figure.Trapezoid
import figure.Triangle

fun figureMenu(option: Int) {
//    Input Rows
    val rows = rowsMenu()

//    Input Color
    val color = colorMenu()

//    Check Option
    when (option) {
        1 -> {
            val triangle = Triangle(rows, color)
            triangle.show()
        }
        2 -> {
            val invertedTriangle = InvertedTriangle(rows, color)
            invertedTriangle.show()
        }
        3 -> {
            val kite = Kite(rows - rows / 2, color)
            kite.show()
        }
        4 -> {
            val star = Star(rows - rows / 2, color)
            star.show()
        }
        5 -> {
            val hollowStar = HollowStar(rows, color)
            hollowStar.show()
        }
        6 -> {
            val square = Square(rows, color)
            square.show()
        }
        7 -> {
            val rectangle = Rectangle(rows, color)
            rectangle.show()
        }
        8 -> {
            val parallelogram = Parallelogram(rows, color)
            parallelogram.show()
        }
        9 -> {
            val trapezoid = Trapezoid(rows, color)
            trapezoid.show()
        }
        10 -> {
            val hexagon = Hexagon(rows, color)
            hexagon.show()
        }
    }

//    Back to Menu (y/n)
    quitMenu()
}