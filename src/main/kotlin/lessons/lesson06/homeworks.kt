package lessons.lesson06

fun main() {
    println("1. Определение сезона 13 и 7")
    println(getSeason(13))
    println(getSeason(7))

    println("2. Расчет возраста питомца 1.5, 3 и 8")
    println(getAnimaleAge(1.5) ?: "Не верно указан возраст")
    println(getAnimaleAge(3.0) ?: "Не верно указан возраст")
    println(getAnimaleAge(8.0) ?: "Не верно указан возраст")

    println("3. Определение способа перемещения 0.8, 4.5, 24")
    println(getTransport(0.8))
    println(getTransport(4.5))
    println(getTransport(24.0))

    println("4. Расчет бонусных баллов 980.0, 1000.0, 1200.0")
    println(getBonus(980.0))
    println(getBonus(1000.0))
    println(getBonus(1200.0))

    println("5. Определение типа документа txt, jpg, xlsx")
    println(getTypeDocument("txt"))
    println(getTypeDocument("jpg"))
    println(getTypeDocument("xlsx"))

    println("6. Конвертация температуры К: 22; С 305; D 120")
    println(getConvertTemp(22.0, "K") ?: "Не верная шкала")
    println(getConvertTemp(305.0, "C") ?: "Не верная шкала")
    println(getConvertTemp(120.0, "D") ?: "Не верная шкала")

    println("7. Подбор одежды по погоде -30, 18")
    println(getClothes(-38.0))
    println(getClothes(18.0))

    println("8. Выбор фильма по возрасту -40, 18")
    println(getFilm(-40))
    println(getFilm(18))
}

// 1. Определение сезона
fun getSeason(nomMontht: Byte): String {
    if (nomMontht < 1 || nomMontht > 12) {
        return "Не верно указан номер месяца: $nomMontht"
    }
    return when(nomMontht) {
        in 3..5 -> "Весна"
        in 6..8 -> "Лето"
        in 9..1 -> "Осень"
        else -> "Зима"
    }
}
// 2. Расчет возраста питомца
fun getAnimaleAge(age: Double): Double? {
    var constTo2 = 10.5
    var constAfter2 = 4.0
    return if (age < 0) {
        null
    } else if (age <= 2) {
        age * constTo2
    } else {
        2 * constTo2 + ((age - 2) * constAfter2)
    }
}
// 3. Определение вида транспорта
fun getTransport(distanse: Double): String {
    return if (distanse < 1) {
        "Пешком"
    } else if (distanse < 5) {
        "Велосипед"
    } else {
        "Авто"
    }
}
// 4. Бонусные баллы
fun getBonus(sum: Double): Double {
    var sumLimit = 1000.0
    var constTo = 2
    var constAfter = 5
    return if (sum < 0) {
        0.0
    } else if (sum == sumLimit) {
        sumLimit / 100 * constTo
    } else if (sum < sumLimit) {
        (sum - (sum % 100)) / 100 * constTo
    } else {
        val sumOst = sum - sumLimit
        (sumLimit / 100 * constTo) + (sumOst - (sumOst % 100)) / 100 * constAfter
    }
}
// 5. Тип документа
fun getTypeDocument(ext: String): String {
    return when(ext) {
        "txt" -> "Текстовый документ"
        "jpg" -> "Изображение"
        "xls" -> "Таблица"
        else -> "Неизвестный тип: $ext"
    }
}
// 6. Конвертация температуры
fun getConvertTemp(temp: Double, sys: String): Double? {
    return if (sys == "K") {
        temp + 273.15
    } else if (sys == "C") {
        temp - 273.15
    } else {
        null
    }
}
// 7. Одежда по погоде
fun getClothes(temp: Double): String {
    return if (temp < -30 || temp > 35) {
        "Оставайтесь дома"
    } else if (temp < 10) {
        "куртка и шапка"
    } else if (temp < 18) {
        "ветровка"
    } else {
        "шорты и футболка"
    }
}
// 8. Фильм по возрасту
fun getFilm(age: Int): String {
    return if (age < 0 || age > 150) {
        "Ошибка возраста: $age"
    } else {
        if (age in 1 until 9) {
            "Детский"
        } else if (age in 10 until 18) {
            "Подростковый"
        } else {
            "Взрослый"
        }
    }
}