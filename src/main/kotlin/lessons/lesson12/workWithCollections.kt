package lessons.lesson12

fun main() {

    val numbers1 = listOf<Int>(-1,0,1,2,3,4,5>)
    val numbers = listOf<Int?>(-1,0,1,2,3,4,5>)

    // перебор списка
    numbers.forEach { myElem ->
        // it - хранит значение
        // myElem - если я хочу свое название переменной
    }

    // фильтрация по условию (например, по диапазону)
    val filter2 = numbers.filter {
        it in 7..17
    }

    // фильтр НЕ
    val filter3 = numbers.filterNot {
        it > 0
    }

    // фильтр избавления от null
    val filter4 = numbers.filterNotNull()

    // первый и последний в списке
    val last = numbers.last()
    val frst = numbers.first()

    // первый с условием
    val frst2 = numbers.first() {it > 0}

// ДЛЯ SET
    val set1 = setOf(1,2,3,4,5)
    val fst1 = set1.first()

    val fst2 = set1.firstOrNull() {it > 0} // чтобы не стопорнуться на null

    val elementElse = numbers.getOrElse(10) { -1 }

// ПРЕОБРАЗОВАНИЯ КОЛЛЕКЦИЙ

    val incNumbers = numbers.map { it + 1 } // меняем каждый элемент по коду в {}

    val nsm = numbers.associate { it to it * it } // каждый элемент преобразуется по коду

    val multipleList = listOf(
        listOf(1,2,3),
        listOf(4,5,6)
    )
    val flList = multipleList.flatten() // объединяет списки

    val flListMap = multipleList.flatMap { myList ->
        myList.map { it * 2 }
    }

// ДРУГОЕ

    // склеить элементы списка через разделитель
    val listStr = numbers.joinToString("/") { "${it * 2}" }  // каждый элемент умножим на 2

    // СОРТИРОВКА
    val sort1 = numbers1.sorted()

    // сортировка обратно
    val sort2 = numbers1.sortedByDescending()

    println(numbers.size) // размер

    println(numbers.isEmpty()) // пустая ли
    println(numbers.isNotEmpty()) // не пустая ли

    println(numbers.contains(42)) // есть ли 42

    println(numbers.containsAll(listOf(1,2))) // включает ли все значения

    println(numbers.sum()) // суммирует все значения в одно

    println(numbers1.average()) // считает среднее арифметическое

    println(numbers.maxByOrNull()) // макс

    println(numbers.minByOrNull()) // мин

    // РАЗДЕЛЯЕТ на группы списков по условию
    val grBy: Map<String, List<Int>> = numbers.groupBy { if (it>0) "+" else "-" }

    val distNum = listOf(1,2,3,3,4,5,5).distinct() // очищает от дублей: 1,2,3,4,5

    println(numbers.take(3))  // создает коллекцию из ПЕРВЫХ 3 значений
    println(numbers.takeLast(3))  // создает коллекцию из ПОСЛЕДНИХ 3 значений

    println(numbers.drop(2)) // создаст коллекцию, игнорируя 2 первых элемента




}