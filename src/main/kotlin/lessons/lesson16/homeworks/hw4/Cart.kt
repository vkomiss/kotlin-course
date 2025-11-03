package lessons.lesson16.homeworks.hw4

class Cart {
    private val items = mutableMapOf<Int, Int>()

    // добавить один товар по ID
    fun addToCart(itemId: Int) {
        items[itemId] = (items[itemId] ?: 0) + 1
    }

    // добавить товар с указанием количества
    fun addToCart(itemId: Int, amount: Int) {
        items[itemId] = (items[itemId] ?: 0) + amount
    }

    // добавить несколько товаров из словаря (id -> количество)
    fun addToCart(itemsMap: Map<Int, Int>) {
        for ((id, count) in itemsMap) {
            items[id] = (items[id] ?: 0) + count
        }
    }

    // добавить список id, по одному товару каждого
    fun addToCart(ids: List<Int>) {
        for (id in ids) {
            items[id] = (items[id] ?: 0) + 1
        }
    }

    override fun toString(): String {
        if (items.isEmpty()) return "Корзина пуста."

        val totalUnique = items.size
        val totalCount = items.values.sum()

        val builder = StringBuilder()
        builder.appendLine("Корзина товаров:")
        builder.appendLine("----------------------------")
        builder.appendLine("ID товара | Количество")
        builder.appendLine("----------------------------")

        for ((id, count) in items) {
            builder.appendLine("$id\t\t|\t$count")
        }

        builder.appendLine("----------------------------")
        builder.appendLine("Итого позиций: $totalUnique")
        builder.appendLine("Всего товаров: $totalCount")
        return builder.toString()
    }
}