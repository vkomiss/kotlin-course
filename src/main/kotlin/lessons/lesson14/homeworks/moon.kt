package lessons.lesson14.homeworks

class moon(var isVisible: Boolean, var phase: String) {

    fun showPhase() {
        println("Фаза Луны: $phase")
    }
}

fun main() {
    val luna = moon(true, "Полнолуние")
    if (luna.isVisible) {
        luna.showPhase()
    } else {
        println("Луна сейчас не видна.")
    }
}