package lessons.lesson14.homeworks

data class product(
    val nazv: String,
    val cena: Double,
    val kolvo: Int
)

fun main() {
    val produkt = product("Хлеб", 120.0, 2)
    println("Продукт: ${produkt.nazv}, Цена: ${produkt.cena}, Количество: ${produkt.kolvo}")
}