package lessons.lesson15.homeworks.hw1

class circle(
    val radius: Double
) : geometricFigure("Круг") {
    override fun area(): Double = 3.1415926 * radius * radius
}