package lessons.lesson14.homeworks

class shelf(val capacity: Int) {
    private val items = mutableListOf<String>()

    fun addItem(predm: String): Boolean {
        val sumLen = items.sumOf { it.length }
        if (sumLen + predm.length <= capacity) {
            items.add(predm)
            return true
        }
        return false
    }

    fun removeItem(predm: String): Boolean {
        return items.remove(predm)
    }

    fun canAccommodate(predm: String): Boolean {
        val sumLen = items.sumOf { it.length }
        return sumLen + predm.length <= capacity
    }

    fun containsItem(predm: String): Boolean {
        return items.contains(predm)
    }

    fun getItems(): List<String> {
        return items.toList()
    }

    fun ostalosMesta(): Int {
        val sumLen = items.sumOf { it.length }
        return capacity - sumLen
    }

    override fun toString(): String {
        return "Вместимость: $capacity, Осталось: ${ostalosMesta()}, Предметы: $items"
    }
}