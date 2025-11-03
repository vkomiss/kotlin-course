package lessons.lesson16.homeworks.hw4

fun main() {
    val cart = Cart()

    // 1) Добавляем один товар
    cart.addToCart(101)

    // 2) Добавляем товар с количеством
    cart.addToCart(102, 3)

    // 3) Добавляем несколько товаров из словаря
    val bulkItems = mapOf(103 to 2, 104 to 5, 102 to 2)
    cart.addToCart(bulkItems)

    // 4) Добавляем список id
    val itemList = listOf(105, 106, 101, 101)
    cart.addToCart(itemList)

    // Печатаем корзину
    println(cart)
}