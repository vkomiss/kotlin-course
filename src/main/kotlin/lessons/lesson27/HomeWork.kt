package lessons.lesson27

//Задание 1.

//Создай Enum со статусами прохождения теста (passed, broken, failed).
enum class TestStatus {
    PASSED,
    BROKEN,
    FAILED
}

//Создай Enum с типами жилой недвижимости для сайта аренды,
//включая человекопонятные названия этих типов.
enum class HousingType(val displayName: String) {
    APARTMENT("Квартира"),
    HOUSE("Частный дом"),
    STUDIO("Студия"),
    ROOM("Комната"),
    COTTAGE("Коттедж")
}

//Создай Enum с планетами солнечной системы,
//включая расстояние до солнца в астрономических единицах
//и вес планеты.
// Данные планет собраны ИИ
enum class Planet(
    val distanceFromSun: Double,
    val mass: Double
) {
    MERCURY(0.39, 3.30e23),
    VENUS(0.72, 4.87e24),
    EARTH(1.0, 5.97e24),
    MARS(1.52, 6.42e23),
    JUPITER(5.20, 1.90e27),
    SATURN(9.58, 5.68e26),
    URANUS(19.20, 8.68e25),
    NEPTUNE(30.05, 1.02e26)
}

// Задание 2.

//Создай функцию, которая выводит на печать человекочитаемые названия
//типов недвижимости в порядке возрастания длины названия enum.

fun printHousingTypesByEnumNameLength() {
    HousingType.values()
        .sortedBy { it.name.length }
        .forEach { println(it.displayName) }
}


// Задание 3.

//Создай функцию, которая принимает лямбду без аргументов и без возвращаемого значения
//и возвращает Enum со статусом прохождения теста в зависимости от того,
//как выполнится принятая лямбда:
//
//если без исключений — PASSED
//если будет AssertionError — FAILED
//прочие исключения — BROKEN

fun runTest(block: () -> Unit): TestStatus {
    return try {
        block()
        TestStatus.PASSED
    } catch (e: AssertionError) {
        TestStatus.FAILED
    } catch (e: Throwable) {
        TestStatus.BROKEN
    }
}


//Задание 4.

//Создай функцию, которая принимает лямбду и возвращает enum планеты.
//Лямбда должна принимать планету и возвращать булево значение.
//Лямбда выступает в качестве фильтра, который должен отфильтровать список
//всех планет по какому-либо признаку (расстояние или вес).
//Вернуть нужно первый элемент из отфильтрованного списка
//или выбросить исключение, если список пустой.

fun findPlanet(filter: (Planet) -> Boolean): Planet {
    val res = Planet.values().filter { filter(it) }
    if (res.isEmpty()) {
        throw NoSuchElementException("Подходящая планета не найдена")
    }
    return res.first()
}


fun main() {
    //1
    println(TestStatus.PASSED)
    println(HousingType.APARTMENT.displayName)
    println(Planet.EARTH.distanceFromSun)
    println(Planet.EARTH.mass)
    //2
    printHousingTypesByEnumNameLength()
    //3

}
