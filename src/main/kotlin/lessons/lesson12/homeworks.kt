package lessons.lesson12

// 1. Проверить, что размер коллекции больше 5 элементов.
fun task1() {
    val kol = listOf(1, 2, 3, 4, 5, 6)
    val bolshe5 = kol.size > 5
    println("1) Размер больше 5: $bolshe5")
}

// 2. Проверить, что коллекция пустая.
fun task2() {
    val kol = listOf<Int>()
    val pust = kol.isEmpty()
    println("2) Коллекция пустая: $pust")
}

// 3. Проверить, что коллекция не пустая.
fun task3() {
    val kol = listOf("один", "два")
    val nePust = kol.isNotEmpty()
    println("3) Коллекция не пустая: $nePust")
}

// 4. Взять элемент по индексу или создать значение если индекса не существует.
fun task4() {
    val kol = listOf("яблоко", "груша")
    val ind = 3
    val zn = kol.getOrElse(ind) { "нет такого" }
    println("4) Элемент: $zn")
}

// 5. Собрать коллекцию в строку.
fun task5() {
    val kol = listOf("кот", "пёс", "ёж")
    val stroka = kol.joinToString(", ")
    println("5) Как строка: $stroka")
}

// 6. Посчитать сумму всех значений.
fun task6() {
    val kol = listOf(10, 20, 30)
    val sum = kol.sum()
    println("6) Сумма: $sum")
}

// 7. Посчитать среднее.
fun task7() {
    val kol = listOf(2, 4, 6)
    val sred = kol.average()
    println("7) Среднее: $sred")
}

// 8. Взять максимальное число.
fun task8() {
    val kol = listOf(1, 5, 9, 3)
    val max = kol.maxOrNull()
    println("8) Максимум: $max")
}

// 9. Взять минимальное число.
fun task9() {
    val kol = listOf(4, 2, 8, 1)
    val min = kol.minOrNull()
    println("9) Минимум: $min")
}

// 10. Взять первое число или null.
fun task10() {
    val kol = listOf<Int>()
    val perv = kol.firstOrNull()
    println("10) Первое или null: $perv")
}

// 11. Проверить что коллекция содержит элемент.
fun task11() {
    val kol = listOf("молоко", "хлеб", "сыр")
    val est = kol.contains("хлеб")
    println("11) Есть ли хлеб: $est")
}

// 12. Отфильтровать коллекцию по диапазону 18-30
fun task12() {
    val kol = listOf(15, 18, 22, 30, 35, 40)
    val filtr = kol.filter { it in 18..30 }
    println("12) В диапазоне 18-30: $filtr")
}

// 13. Выбрать числа, которые не делятся на 2 и 3 одновременно
fun task13() {
    val kol = listOf(3, 6, 9, 10, 12, 13, 15, 17)
    val filtr = kol.filter { it % 2 != 0 && it % 3 != 0 }
    println("13) Не делятся на 2 и 3: $filtr")
}

// 14. Очистить текстовую коллекцию от null элементов
fun task14() {
    val kol = listOf("яблоко", null, "груша", null, "слива")
    val och = kol.filterNotNull()
    println("14) Без null: $och")
}

// 15. Преобразовать текстовую коллекцию в коллекцию длин слов
fun task15() {
    val kol = listOf("кот", "паровоз", "солнце")
    val dl = kol.map { it.length }
    println("15) Длины слов: $dl")
}

// 16. Преобразовать текстовую коллекцию в мапу, где ключи - перевёрнутые слова, а значения - длина слов
fun task16() {
    val kol = listOf("дом", "лес", "река")
    val mapa = kol.associateWith { it.reversed().length }
    println("16) Мапа перевёрнутых слов: $mapa")
}

// 17. Отсортировать список в алфавитном порядке
fun task17() {
    val kol = listOf("арбуз", "дыня", "яблоко", "банан")
    val sort = kol.sorted()
    println("17) Отсортировано: $sort")
}

// 18. Взять первые 3 элемента списка
fun task18() {
    val kol = listOf(10, 20, 30, 40, 50)
    val perv = kol.take(3)
    println("18) Первые 3: $perv")
}

// 19. Распечатать квадраты элементов списка
fun task19() {
    val kol = listOf(2, 3, 4, 5)
    for (ch in kol) {
        println("19) Квадрат $ch = ${ch * ch}")
    }
}

// 20. Группировать список по первой букве слов
fun task20() {
    val kol = listOf("кот", "камень", "дом", "дверь", "дерево")
    val grp = kol.groupBy { it.first() }
    println("20) Группы: $grp")
}

// 21. Очистить список от дублей
fun task21() {
    val kol = listOf("кот", "кот", "пёс", "ёж", "пёс")
    val uniq = kol.distinct()
    println("21) Без дублей: $uniq")
}

// 22. Отсортировать список по убыванию
fun task22() {
    val kol = listOf(5, 2, 8, 1)
    val sort = kol.sortedDescending()
    println("22) По убыванию: $sort")
}

// 23. Взять последние 3 элемента списка
fun task23() {
    val kol = listOf(1, 2, 3, 4, 5, 6)
    val pos = kol.takeLast(3)
    println("23) Последние 3: $pos")
}

// 24. Написать функцию, которая принимает коллекцию чисел и возвращает строку с характеристикой коллекции используя when
// Если коллекция пустая - “Пусто”
// Если количество элементов меньше пяти - “Короткая”
// Если коллекция начинается с 0 - “Стартовая”
// Если сумма всех чисел больше 10000 - “Массивная”
// Если среднее значение равно 10 - “Сбалансированная”
// Если длина строки, образованная склеиванием коллекции в строку, равна 20 - “Клейкая”
// Если максимальное число меньше -10 - “Отрицательная”
// Если минимальное число больше 1000 - “Положительная”
// Если содержит одновременно числа 3 и 14 - “Пи***тая”
// Иначе - “Уникальная”

fun harKol(kol: List<Int>): String {
    val sum = kol.sum()
    val avg = kol.average()
    val txt = kol.joinToString("")
    val max = kol.maxOrNull()
    val min = kol.minOrNull()

    return when {
        kol.isEmpty() -> "Пусто"
        kol.size < 5 -> "Короткая"
        kol.firstOrNull() == 0 -> "Стартовая"
        sum > 10000 -> "Массивная"
        avg == 10.0 -> "Сбалансированная"
        txt.length == 20 -> "Клейкая"
        max != null && max < -10 -> "Отрицательная"
        min != null && min > 1000 -> "Положительная"
        kol.contains(3) && kol.contains(14) -> "Пи***тая"
        else -> "Уникальная"
    }
}

// 25. Написать функцию, которая принимает список чисел и возвращает список чисел.
// Отфильтровать удовлетворительные оценки (>=60), отсортировать по возрастанию и взять первые 3.
// Методы вызвать последовательно один из другого.

fun obrOcenki(spis: List<Int>): List<Int> {
    return spis
        .filter { it >= 60 }
        .sorted()
        .take(3)
}

// 26. Написать функцию, которая принимает список строк и возвращает словарь с ключом - буквой и значением - списком строк.
// Все слова перевести в нижний регистр и сгруппировать по первой букве.

fun grpSlova(spis: List<String>): Map<Char, List<String>> {
    val niz = spis.map { it.lowercase() }
    val grp = niz.groupBy { it.first() }
    return grp
}

// 27. Написать функцию, которая принимает список строк и возвращает строку.
// Перевести все слова в количество букв, подсчитать среднее значение.
// Вернуть форматированный текст с двумя знаками после запятой с помощью функции format.

fun sredDlina(spis: List<String>): String {
    val dl = spis.map { it.length }
    val sr = dl.average()
    val rez = String.format("Средняя длина слов: %.2f", sr)
    return rez
}

// 28. Написать функцию, которая принимает список чисел и возвращает словарь
// с ключами - строками и значениями - список чисел.
// Отобрать уникальные числа, отсортировать по убыванию и сгруппировать по четности ("четные" и "нечетные").

fun grpChisla(spis: List<Int>): Map<String, List<Int>> {
    val un = spis.distinct()
    val sort = un.sortedDescending()
    val grp = sort.groupBy { if (it % 2 == 0) "четные" else "нечетные" }
    return grp
}

// 29. Написать функцию, которая принимает список чисел и число и возвращает nullable число.
// Найти первый возраст в списке, который больше второго аргумента, иначе вернуть null.

fun najtiVozrast(spis: List<Int?>, porog: Int): Int? {
    val bezNull = spis.filterNotNull()
    val perv = bezNull.firstOrNull { it > porog }
    return perv
}


fun main() {

    task1()
    task2()
    task3()
    task4()
    task5()
    task6()
    task7()
    task8()
    task9()
    task10()
    task11()
    task12()
    task13()
    task14()
    task15()
    task16()
    task17()
    task18()
    task19()
    task20()
    task21()
    task22()
    task23()
    // 24
    val kol1 = listOf<Int>()
    val kol2 = listOf(1, 2, 3)
    val kol3 = listOf(0, 5, 10)
    val kol4 = List(2000) { 6 }
    val kol5 = listOf(5, 10, 15)
    val kol6 = listOf(1, 2, 3, 4, 567891011)
    val kol7 = listOf(-11, -12, -13)
    val kol8 = listOf(2001, 3000, 4000)
    val kol9 = listOf(1, 3, 14, 9)
    val kol10 = listOf(7, 77, 777)

    println("1) ${harKol(kol1)}")
    println("2) ${harKol(kol2)}")
    println("3) ${harKol(kol3)}")
    println("4) ${harKol(kol4)}")
    println("5) ${harKol(kol5)}")
    println("6) ${harKol(kol6)}")
    println("7) ${harKol(kol7)}")
    println("8) ${harKol(kol8)}")
    println("9) ${harKol(kol9)}")
    println("10) ${harKol(kol10)}")

    // 25
    val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
    val rez25 = obrOcenki(grades)
    println("26) Первые 3 удовлетворительные оценки: $rez25")

    // 26
    val list = listOf(
        "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра",
        "подушка", "Картина", "столик", "Вазон", "шторы", "Пуф", "книга", "Фоторамка",
        "светильник", "Коврик", "вешалка", "Подставка", "телевизор", "Комод", "полка",
        "Абажур", "диван", "Кресло", "занавеска", "Бра", "пепельница", "Глобус",
        "статуэтка", "Поднос", "фигурка", "Ключница", "плед", "Тумба", "игрушка",
        "Настенные часы", "подсвечник", "Журнальный столик", "сувенир", "Корзина для белья",
        "посуда", "Настольная лампа", "торшер", "Этажерка"
    )

    val rez26 = grpSlova(list)
    println("25) Каталог по буквам:")
    rez26.forEach { (b, sp) ->
        println("$b -> $sp")
    }

    // 27
    val rez27 = sredDlina(list)
    println("27) $rez27")

    // 28
    val numbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)
    val rez28 = grpChisla(numbers)
    println("28) Группировка по четности: $rez28")

    // 29
    val ages = listOf(22, 18, 30, 45, 17, null, 60)
    val porog = 18
    val rez29 = najtiVozrast(ages, porog)
    println("29) Первый возраст больше $porog: $rez29")

}
