package lessons.lesson16.homeworks.hw2

class Square(private val side: Double) : Shape() {
    override fun area(): Double {
        return side * side
    }
}