package lessons.lesson30

class InventoryManager(private val capacity: Int) {

    private val items = mutableMapOf<String, Int>()

    fun getItemCount(itemName: String): Int {
        return items[itemName] ?: 0
    }

    fun addItem(itemName: String, quantity: Int) {
        require(quantity > 0)

        val current = items[itemName] ?: 0
        checkCapacity(quantity)

        items[itemName] = current + quantity
    }

    fun removeItem(itemName: String, quantity: Int): Boolean {
        require(quantity > 0)

        val current = items[itemName] ?: return false
        if (current < quantity) return false

        val newValue = current - quantity
        if (newValue == 0) {
            items.remove(itemName)
        } else {
            items[itemName] = newValue
        }
        return true
    }

    private fun checkCapacity(itemsForAdding: Int) {
        check(items.values.sum() + itemsForAdding <= capacity) {
            "Количество инвентаря не должно превышать $capacity единиц"
        }
    }
}