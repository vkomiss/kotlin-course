package lessons.lesson15.homeworks.hw1

class triangle(
    val sideA: Double,
    val sideB: Double,
    val sideC: Double
) : polygon("Треугольник", 3) {

    override fun area(): Double {
        val p = perimeter() / 2
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC))
    }
}