package lessons.lesson19.homeworks

// Напиши класс ListHolder, который будет хранить список элементов типа T
// и иметь метод для добавления нового элемента
// и метод для получения всех элементов в виде неизменяемого списка.
class ListHolder<T>(val lst: MutableList<T> = mutableListOf()) {
    fun add(el: T) {
        lst.add(el)
    }
    fun getAll(): List<T> {
        return
        lst.toList()
    }
}