package lessons.lesson14.homeworks

class concert(
    val gruppa: String,
    val mesto: String,
    val stoim: Double,
    val vmestim: Int
) {
    private var prodano: Int = 0

    fun info() {
        println("Группа: $gruppa, Место: $mesto, Стоимость билета: $stoim, Вместимость: $vmestim, Продано: $prodano")
    }

    fun buyTicket() {
        if (prodano < vmestim) {
            prodano++
            println("Билет куплен! Всего продано: $prodano")
        } else {
            println("Все билеты проданы!")
        }
    }
}

fun main() {
    val koncert = concert("Лебеди", "Главная сцена", 2500.0, 3)
    koncert.info()
    koncert.buyTicket()
    koncert.buyTicket()
    koncert.buyTicket()
    koncert.buyTicket()
    koncert.info()
}