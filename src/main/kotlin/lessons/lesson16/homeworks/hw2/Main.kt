package lessons.lesson16.homeworks.hw2

fun main() {

    val shapes: List<Shape> = listOf(
        Circle(5.0),
        Square(4.0),
        Triangle(3.0, 6.0, 45.0)
    )

    for ((index, shape) in shapes.withIndex()) {
        println("Фигура #${index + 1}: площадь = ${"%.2f".format(shape.area())}")
    }
}