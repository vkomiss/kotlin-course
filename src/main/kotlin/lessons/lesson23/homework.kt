package lessons.lesson23

// Задача: Создай функцию, которая принимает список чисел и возвращает среднее арифметическое
// всех чётных чисел этого списка. С помощью require проверь, что список не пустой.
fun srCh(sp: List<Int>): Double {
    require(sp.isNotEmpty())
    val ch = sp.filter { it % 2 == 0 }
    return if (ch.isEmpty()) 0.0 else ch.average()
}

// Создай аналогичную анонимную функцию.
val srChAnon = fun(sp: List<Int>): Double {
    require(sp.isNotEmpty())
    val ch = sp.filter { it % 2 == 0 }
    return if (ch.isEmpty()) 0.0 else ch.average()
}

// Создай аналогичное лямбда выражение с указанием типа.
val srChLamTyped: (List<Int>) -> Double = { sp ->
    require(sp.isNotEmpty())
    val ch = sp.filter { it % 2 == 0 }
    if (ch.isEmpty()) 0.0 else ch.average()
}

// Создай лямбда выражение без указания типа.
val srChLam = { sp: List<Int> ->
    require(sp.isNotEmpty())
    val ch = sp.filter { it % 2 == 0 }
    if (ch.isEmpty()) 0.0 else ch.average()
}

// Проверь, что лямбда выражение работает правильно с помощью
// нескольких наборов данных (в том числе пустого).
fun testSrCh() {
    println(srChLamTyped(listOf(2, 4, 6)))
    println(srChLamTyped(listOf(1, 3, 5, 8)))
    try { println(srChLamTyped(emptyList())) } catch (e: Exception) { println(e) }
}

////////////////////////
// Задача: Создай функцию, которая принимает большое число и возвращает сумму цифр этого числа.
// Сделай проверку, что входящее число больше нуля.
fun sumCif(n: Long): Int {
    require(n > 0)
    return n.toString().sumOf { it.digitToInt() }
}

// Создай аналогичную анонимную функцию.
val sumCifAnon = fun(n: Long): Int {
    require(n > 0)
    return n.toString().sumOf { it.digitToInt() }
}

// Создай аналогичное лямбда выражение с указанием типа.
val sumCifLamTyped: (Long) -> Int = { n ->
    require(n > 0)
    n.toString().sumOf { it.digitToInt() }
}

// Создай лямбда выражение без указания типа.
val sumCifLam = { n: Long ->
    require(n > 0)
    n.toString().sumOf { it.digitToInt() }
}

// Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных.
fun testSumCif() {
    println(sumCifLam(123456))
    println(sumCifLam(99999))
    try { println(sumCifLam(0)) } catch (e: Exception) { println(e) }
}

////////////////////////
// Задача: Создай функцию-расширение списка чисел, которая будет возвращать множество
// дубликатов чисел (встречающихся в списке более одного раза).
fun List<Int>.dupSet(): Set<Int> {
    return this.groupBy { it }.filter { it.value.size > 1 }.keys
}

// Создай аналогичную анонимную функцию.
val dupSetAnon = fun(sp: List<Int>): Set<Int> {
    return sp.groupBy { it }.filter { it.value.size > 1 }.keys
}

// Создай аналогичное лямбда выражение с указанием типа.
val dupSetLamTyped: (List<Int>) -> Set<Int> = { sp ->
    sp.groupBy { it }.filter { it.value.size > 1 }.keys
}

// Создай аналогичное лямбда выражение без указания типа.
val dupSetLam = { sp: List<Int> ->
    sp.groupBy { it }.filter { it.value.size > 1 }.keys
}

// Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных.
fun testDup() {
    println(dupSetLam(listOf(1, 2, 2, 3, 3, 3)))
    println(dupSetLam(listOf(5, 5, 6, 7)))
    println(dupSetLam(listOf(1, 2, 3)))
}
