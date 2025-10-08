package lessons.lesson09

fun main() {

    // 1. Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
    val arr1 = arrayOf(1, 2, 3, 4, 5)

    // 2. Создайте пустой массив строк размером 10 элементов.
    val arr2 = Array(10) { "" }

    // 3. Создайте массив из 5 элементов типа Double и заполните
    // его значениями, являющимися удвоенным индексом элемента.
    val arr3 = Array(5) { 0.0 }
    for (index in arr3.indices) {
        arr3[index] = index * 2.0
    }

    // 4. Создайте массив из 5 элементов типа Int. Используйте цикл,
    // чтобы присвоить каждому элементу значение, равное его индексу, умноженному на 3.
    val arr4 = Array(5) { 0 }
    for (i in arr4.indices) {
        arr4[i] = i * 3
    }

    // 5. Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.
    val arr5 = arrayOf<String?>(null, "Hello", "World")

    // 6. Создайте массив целых чисел и скопируйте его в новый массив в цикле.
    val arr6 = arrayOf(1, 2, 3, 4)
    val arr7 = Array(arr6.size) { 0 }
    for (i in arr6.indices) {
        arr7[i] = arr6[i]
    }

    // 7. Создайте два массива целых чисел одинаковой длины.
    // Создайте третий массив, вычев значения одного из другого. Распечатайте полученные значения.
    val a1 = arrayOf(5, 7, 9)
    val a2 = arrayOf(1, 2, 3)
    val a3 = Array(a1.size) { 0 }
    for (i in a1.indices) {
        a3[i] = a1[i] - a2[i]
        println(a3[i])
    }

    // 8. Найдите индекс элемента со значением 5 через цикл while.
    val arr8 = arrayOf(1, 3, 7, 9)
    var i = 0
    var index = -1
    while (i < arr8.size) {
        if (arr8[i] == 5) {
            index = i
            break
        }
        i++
    }
    println(index)

    // 9. Используйте цикл для вывода элементов и отметки "чётное"/"нечётное".
    val arr9 = arrayOf(1, 2, 3, 4, 5)
    for (n in arr9) {
        if (n % 2 == 0) {
            println("$n - чётное")
        } else {
            println("$n - нечётное")
        }
        }
    }

    // 10. Функция поиска подстроки в массиве строк
    fun findContains(arr: Array<String>, text: String) {
        for (item in arr) {
            if (item.contains(text)) {
                println(item)
            }
        }
    }
    //findContains(arrayOf("kotlin", "java", "python"), "java")

    // 11. Создайте пустой неизменяемый список целых чисел.
    val list1 = listOf<Int>()

    // 1. Создайте неизменяемый список строк.
    val list2 = listOf("Hello", "World", "Kotlin")

    // 3. Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.
    val list3 = mutableListOf(1, 2, 3, 4, 5)

    // 4. Добавьте новые элементы.
    //list3.add(6)
    //list3.add(7)
    //list3.add(8)

    // 5. Удалите элемент "World".
    val list4 = mutableListOf("Hello", "World", "Kotlin")
    list4.remove("World")

    // 6. Вывод элементов списка.
    val list5 = listOf(1, 2, 3, 4)
    for (n in list5) {
        println(n)
    }

    // 7. Получите второй элемент.
    val list6 = listOf("a", "b", "c")
    println(list6[1])

    // 8. Измените значение элемента по индексу.
    val list7 = mutableListOf(10, 20, 30)
    list7[2] = 99

    // 9. Объедините два списка.
    val l1 = listOf("a", "b")
    val l2 = listOf("c", "d")
    val l3 = mutableListOf<String>()
    for (x in l1) {
        l3.add(x)
    }
    for (x in l2) {
        l3.add(x)
    }
    println(l3)

    // 10. Найдите минимальный и максимальный элементы.
    val list8 = listOf(4, 9, 1, 7)
    var min = list8[0]
    var max = list8[0]
    for (x in list8) {
        if (x < min) {min = x}
        if (x > max) {max = x}
    }
    println("min=$min max=$max")

    // 12. Новый список только чётных чисел.
    val list9 = listOf(1, 2, 3, 4, 5, 6)
    val evens = mutableListOf<Int>()
    for (x in list9) {
        if (x % 2 == 0) {
            evens.add(x)
        }
    }
    println(evens)

    // 1. Пустое неизменяемое множество целых чисел.
    val set1 = setOf<Int>()

    // 2. Неизменяемое множество с тремя элементами.
    val set2 = setOf(1, 2, 3)

    // 3. Изменяемое множество строк.
    val set3 = mutableSetOf("Kotlin", "Java", "Scala")

    // 4. Добавьте новые элементы.
    set3.add("Swift")
    set3.add("Go")

    // 5. Удалите элемент.
    val set4 = mutableSetOf(1, 2, 3)
    set4.remove(2)

    // 6. Вывод всех элементов.
    val set5 = setOf(10, 20, 30)
    for (x in set5) {
        println(x)
    }

    // 7. Функция проверки наличия строки.
    fun hasString(set: Set<String>, str: String): Boolean {
        for (x in set) {
            if (x == str) {
                return true
            }
        }
        return false
    }
    println(hasString(setOf("a", "b", "c"), "b"))

    // 8. Преобразуйте множество в список.
    val set6 = setOf("one", "two", "three")
    val listFromSet = mutableListOf<String>()
    for (x in set6) {
        listFromSet.add(x)
    }
    println(listFromSet)


}