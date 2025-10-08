package lessons.lesson09

fun main() {

    val numbers: Array<Int> = arrayOf(1,2,3,4,5)
    val dbarray: DoubleArray = doubleArrayOf(1.1,2.1,3.1)

    val emptyAr: Array(5) = { "" }
    val nulAr = arrayOfNulls<Int>( 5)

    val listour: List<String> = listOf("1", "2", "3") // не изменяемые элементы
    val mutList: MutableList<String> = mutableListOf("1", "2", "3") // тут можно менять элементы

    numbers[0] = 10

    mutList.add("4")
    mutList.removeAt(0) // удалить
    mutList[0] = "4"
    mutList.remove("3") // удалить первый попавшийся элемент
    mutList.add(1, "5") // поместить элемент с таким индексом, сместив другие направо

    // МНОЖЕСТВА

    val mySet: Set<Int> = setOf(1, 2, 3, 4, 5)
    val mutSet: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5) // изменяемый
    val emSet: Set<Int> = emptySet()  // пустой

    mutList.toSet() // удалить все дубликаты

    for (let in mutSet) {
        println(let)
    }

    for (index in mutList.indices) {
        if (index == mutList.lastIndex)
    }

    var index = mutList.lastIndex
    while (index >= 0) {
        println(к)
    }





}