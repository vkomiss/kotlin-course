package lessons.lesson13

// 1. Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах.
// Определите среднее время выполнения теста.
fun task1() {

    val vrem = mapOf("тестА" to 2.5, "тестБ" to 3.0, "тестВ" to 4.0)
    val sred = if (vrem.isNotEmpty()) vrem.values.average() else 0.0
    println("1) Среднее время = $sred")

}

// 2. Имеется словарь с метаданными автоматизированных тестов, где ключи — это имена тестовых
// методов а значения - строка с метаданными. Выведите список всех тестовых методов.
fun task2() {

    val meta = mapOf("тестЛогин" to "мета1", "тестВыход" to "мета2")
    val spisok = meta.keys.toList()
    println("2) Методы: $spisok")

}

// 3. В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.
fun task3() {
    val rez = mutableMapOf("тестА" to "пройден", "тестБ" to "провал")
    rez["тестВ"] = "пройден"
    println("3) После добавления: $rez")
}

// 4. Посчитайте количество успешных тестов в словаре с результатами (ключ - название, значение -
// результат из passed, failed, skipped).
fun task4() {

    val rez = mapOf("т1" to "пройден", "т2" to "провал", "т3" to "пройден", "т4" to "пропущен")
    val kolvo = rez.count { it.value == "пройден" }
    println("4) Кол-во успешных = $kolvo")

}

// 5. Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен (ключ -
// название, значение - статус исправления).
fun task5() {

    val bagi = mutableMapOf("БАГ-1" to "открыт", "БАГ-2" to "исправлен", "БАГ-3" to "в работе")
    bagi.entries.removeIf { it.key == "БАГ-2" }
    println("5) После удаления: $bagi")

}

// 6. Для словаря с результатами тестирования веб-страниц (ключ — URL страницы, значение — статус ответа),
// выведите сообщение о странице и статусе её проверки.
fun task6() {

    val stran = mapOf("https://сайт1" to "200 OK", "https://сайт2" to "404 Not Found")
    stran.forEach { (url, status) ->
        println("6) Страница $url — статус проверки: $status")

    }
}

// 7. Найдите в словаре с названием и временем ответа сервисов только те, время ответа которых превышает заданный порог.
fun task7() {

    val serv = mapOf("сервисА" to 120, "сервисБ" to 80, "сервисВ" to 200)
    val porog = 100
    val medlenn = serv.filterValues { it > porog }
    println("7) Медленные сервисы: $medlenn")

}

// 8. В словаре хранятся результаты тестирования API (ключ — endpoint, значение — статус ответа в виде строки).
// Для указанного endpoint найдите статус ответа, если endpoint отсутствует, предположите, что он не был протестирован.
fun task8() {

    val api = mapOf("/пользователи" to "200", "/заказы" to "500")
    val tochka = "/платежи"
    val status = api.getOrElse(tochka) { "не тестировался" }
    println("8) Точка $tochka — статус: $status")

}

// 9. Из словаря, содержащего конфигурации тестового окружения (ключ — название параметра конфигурации,
// значение - сама конфигурация), получите значение для "browserType". Ответ не может быть null.
fun task9() {

    val konf = mapOf("browserType" to "Chrome", "timeout" to "30s")
    val brauz = konf.getValue("browserType")
    println("9) browserType = $brauz")

}

// 10. Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, добавив новую версию.
fun task10() {

    val versii = mapOf("app" to "1.0", "lib" to "2.3")
    val novVersii = versii + ("app" to "1.1")
    println("10) Новые версии: $novVersii")

}

// 11. Используя словарь с настройками тестирования для различных мобильных устройств (ключ — модель устройства,
// значение - строка с настройками), получите настройки для конкретной модели или верните настройки по умолчанию.
fun task11() {

    val mobNastr = mapOf("Pixel5" to "dpi=440;lang=en", "iPhone12" to "dpi=460;lang=en")
    val model = "GalaxyS21"
    val nastroika = mobNastr.getOrDefault(model, "dpi=420;lang=en")
    println("11) Установки для $model: $nastroika")

}

// 12. Проверьте, содержит ли словарь с ошибками тестирования (ключ - код ошибки, значение - описание ошибки)
// определенный код ошибки.
fun task12() {

    val oshib = mapOf(1001 to "NullPointer", 1002 to "Timeout")
    val kod = 1002
    val est = oshib.containsKey(kod)
    println("12) Error code $kod exists: $est")

}

// 13. Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев в формате "TestID_Version",
// а значения — статусы выполнения этих тестов ("Passed", "Failed", "Skipped"). Отфильтруйте словарь,
// оставив только те сценарии, идентификаторы которых соответствуют определённой версии тестов.
fun task13() {

    val scen = mapOf("T1_v1" to "Passed", "T2_v2" to "Failed", "T3_v1" to "Skipped")
    val vers = "v1"
    val filtr = scen.filterKeys { it.contains("_$vers") }
    println("13) Отфильтровано $vers: $filtr")

}

// 14. У вас есть словарь, где ключи — это названия функциональных модулей приложения, а значения —
// результаты их тестирования. Проверьте, есть ли модули с неудачным тестированием.
fun task14() {

    val mod = mapOf("auth" to "passed", "payments" to "failed", "ui" to "passed")
    val estPoval = mod.any { it.value == "failed" }
    println("14) Неудачные тестирования: $estPoval")

}

// 15. Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.
fun task15() {

    val okr = mutableMapOf("timeout" to "30s")
    val dop = mapOf("retries" to "3", "timeout" to "60s")
    okr.putAll(dop)
    println("15) Результат команды putAll: $okr")

}

// 16. Объедините два неизменяемых словаря с данными о багах.
fun task16() {

    val bagiA = mapOf("BUG-1" to "open")
    val bagiB = mapOf("BUG-2" to "fixed")
    val vse = bagiA + bagiB
    println("16) Объединенные словари: $vse")

}

// 17. Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.
fun task17() {

    val vrem = mutableMapOf("runId" to "123", "duration" to "12m")
    vrem.clear()
    println("17) Очищенное: $vrem")

}

// 18. Исключите из отчета по автоматизированному тестированию те случаи, где тесты были пропущены
// (имеют статус “skipped”). Ключи - название теста, значения - статус.
fun task18() {

    val otchet = mapOf("t1" to "passed", "t2" to "skipped", "t3" to "failed")
    val bezProp = otchet.filterNot { it.value == "skipped" }
    println("18) Результат: $bezProp")

}

// 19. Создайте копию словаря с конфигурациями тестирования удалив из него несколько конфигураций.
fun task19() {

    val konf = mapOf("a" to "1", "b" to "2", "c" to "3")
    val kop = konf - listOf("b", "c")
    println("19) Копия без b,c: $kop")

}

// 20. Создайте отчет о тестировании, преобразовав словарь с результатами тестирования
// (ключ — идентификатор теста, значение — результат) в список строк формата "Test ID: результат".
fun task20() {

    val rez = mapOf("T1" to "Passed", "T2" to "Failed")
    val stroki = rez.map { (k, v) -> "$k: $v" }
    println("20) Список строк:")
    stroki.forEach { println(" - $it") }

}

// 21. Преобразуйте изменяемый словарь с результатами последнего тестирования в неизменяемый для архивации.
fun task21() {

    val lastRez = mutableMapOf("t1" to "passed", "t2" to "failed")
    val arhiv = lastRez.toMap()
    println("21) Неизменяемый: $arhiv")

}

// 22. Преобразуйте словарь, содержащий числовой ID теста и данные о времени выполнения тестов,
// заменив идентификаторы тестов на их строковый аналог (например через toString()).
fun task22() {

    val chis = mapOf(1 to 2.0, 2 to 3.5)
    val strochKeys = chis.mapKeys { it.key.toString() }
    println("22) Строковые ключи: $strochKeys")

}

// 23. Для словаря с оценками производительности различных версий приложения (ключи - строковая версия,
// значения - дробное число времени ответа сервера) увеличьте каждую оценку на 10%,
// чтобы учесть новые условия тестирования.
fun task23() {

    val ocen = mapOf("1.0" to 200.0, "1.1" to 180.0)
    val nov = ocen.mapValues { it.value * 1.10 }
    println("23) Проивзодительность: $nov")

}

// 24. Проверьте, пуст ли словарь с ошибками компиляции тестов.
fun task24() {

    val kompErr = mapOf<Int, String>()
    println("24) Ошибки компиляции пусты: ${kompErr.isEmpty()}")

}

// 25. Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.
fun task25() {

    val nagruz = mapOf("testLoad1" to "ok")
    println("25) Загруженные результаты не пусты: ${nagruz.isNotEmpty()}")

}

// 26. Проверьте, прошли ли успешно все автоматизированные тесты в словаре с результатами.
fun task26() {

    val rez = mapOf("t1" to "passed", "t2" to "passed")
    println("26) All passed: ${rez.all { it.value == "passed" }}")

}

// 27. Определите, содержит ли словарь с результатами тестирования хотя бы один тест с ошибкой.
fun task27() {

    val rez = mapOf("t1" to "passed", "t2" to "error", "t3" to "failed")
    val est = rez.any { it.value.contains("error", ignoreCase = true) || it.value == "failed" }
    println("27) Ошибка: $est")

}

// 28. Отфильтруйте словарь с результатами тестирования сервисов, оставив только те тесты,
// которые не прошли успешно и содержат в названии “optional”.
fun task28() {

    val serv = mapOf("optionalPayment" to "failed", "corePayment" to "failed", "optionalUI" to "passed")

    val filtr = mutableMapOf<String, String>()

    for ((k, v) in serv) {
        if (v != "passed" && k.contains("optional")) {
            filtr[k] = v
        }
    }
    println("28) Filtered optional failures: $filtr")}
}

fun main() {
    task1(); task2(); task3(); task4(); task5(); task6(); task7(); task8();
    task9(); task10(); task11(); task12(); task13(); task14(); task15();
    task16(); task17(); task18(); task19(); task20(); task21(); task22();
    task23(); task24(); task25(); task26(); task27(); task28();
}

