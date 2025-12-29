package lessons.lesson31

//Параметризованными называют тесты, которые могут принимать аргументы для использования в тесте.
// Такой тест может быть выполнен множество раз с разными аргументами, таким образом можно покрыть
// сразу множество тестовых сценариев, которые различаются только входными данными и ожидаемыми значениями.
//
//Для включения возможности использовать параметризацию тестов JUnit5 нужно добавить одну дополнительную
// зависимость в build.gradle:
//
testImplementation("org.junit.jupiter:junit-jupiter-params:5.7.0")
//Для написания параметризованных тестов в JUnit 5 используется аннотация @ParameterizedTest
// вместо @Test а также аннотация с указанием источника тестовых данных.
//
//Для примера рассмотрим тестирование метода валидации email

fun calculateDiscountedPrice(originalPrice: Double, discountPercentage: Int): Double {
    require(originalPrice >= 0) { "Цена должна быть неотрицательной" }
    require(discountPercentage in 0..100) { "Скидка должна быть от 0 до 100%" }
    return originalPrice * (1 - discountPercentage / 100.0)
}

//Напишем несколько позитивных и негативных тестов

class DiscountCalculatorTest {

    @Test
    fun `should return original price when discount is 0`() {
        val originalPrice = 100.0
        val discountPercentage = 0
        val actualPrice = calculateDiscountedPrice(originalPrice, discountPercentage)
        assertEquals(100.0, actualPrice, 0.01, "Цена без скидки рассчитана неверно")
    }

    @Test
    fun `should calculate 50 percent discount`() {
        val originalPrice = 200.0
        val discountPercentage = 50
        val actualPrice = calculateDiscountedPrice(originalPrice, discountPercentage)
        assertEquals(100.0, actualPrice, 0.01, "50% скидка рассчитана неверно")
    }

    @Test
    fun `should return 0 when discount is 100 percent`() {
        val originalPrice = 50.0
        val discountPercentage = 100
        val actualPrice = calculateDiscountedPrice(originalPrice, discountPercentage)
        assertEquals(0.0, actualPrice, 0.01, "Полная скидка рассчитана неверно")
    }

    @Test
    fun `should calculate 25 percent discount`() {
        val originalPrice = 99.99
        val discountPercentage = 25
        val actualPrice = calculateDiscountedPrice(originalPrice, discountPercentage)
        assertEquals(74.99, actualPrice, 0.01, "25% скидка рассчитана неверно")
    }

    @Test
    fun `should throw exception when original price is negative`() {
        val originalPrice = -10.0
        val discountPercentage = 10
        assertThrows(IllegalArgumentException::class.java) {
            calculateDiscountedPrice(originalPrice, discountPercentage)
        }
    }

    @Test
    fun `should throw exception when discount percentage is out of range`() {
        val originalPrice = 100.0
        val discountPercentage = 150
        assertThrows(IllegalArgumentException::class.java) {
            calculateDiscountedPrice(originalPrice, discountPercentage)
        }
    }
}
//Можем заметить, что часть тестов повторяется, отличаясь только используемыми параметрами.
// JUnit5 позволяет создавать наборы параметров и передавать их в один тестовый метод,
// который будет запущен столько раз, сколько есть наборов.

class DiscountCalculatorParameterizedTest {
    @ParameterizedTest
    @MethodSource("provideDiscountData")
    fun `should calculate discounted price correctly`(
        originalPrice: Double,
        discountPercentage: Int,
        expectedPrice: Double
    ) {
        val actualPrice = calculateDiscountedPrice(originalPrice, discountPercentage)
        assertEquals(expectedPrice, actualPrice, 0.01, "Цена после скидки рассчитана неверно")
    }

    @ParameterizedTest
    @MethodSource("provideInvalidPrices")
    fun `should throw exception for invalid original price`(originalPrice: Double, discountPercentage: Int) {
        assertFailsWith<IllegalArgumentException>("Цена должна быть неотрицательной") {
            calculateDiscountedPrice(originalPrice, discountPercentage)
        }
    }

    @ParameterizedTest
    @MethodSource("provideInvalidDiscounts")
    fun `should throw exception for invalid discount percentage`(discountPercentage: Int) {
        assertFailsWith<IllegalArgumentException>("Скидка должна быть от 0 до 100%") {
            calculateDiscountedPrice(100.0, discountPercentage)
        }
    }

    companion object {
        @JvmStatic
        fun provideDiscountData() = listOf(
            arrayOf(100.0, 0, 100.0),   // Без скидки
            arrayOf(200.5, 49, 102.255), // Неровная цена и скидка
            arrayOf(50.0, 100, 0.0),   // Полная скидка
            arrayOf(99.99, 25, 74.99)  // 25% скидка и дробная цена
        )

        @JvmStatic
        fun provideInvalidPrices() = listOf(
            arrayOf(-0.01, 10), // Отрицательная цена
            arrayOf(-1.0, 0),  // Отрицательная цена без скидки
            arrayOf(-0.01, 100), // Отрицательная цена и полная скидка
        )

        @JvmStatic
        fun provideInvalidDiscounts() = listOf(
            arrayOf(-1),  // Скидка меньше 0
            arrayOf(101)   // Скидка больше 100
        )
    }
}
//@JvmStatic - это специальная аннотация для обеспечения совместимости с Java классами.
// JUnit при использовании аннотации @MethodSource будет искать статический метод
// по его названию в тестовом классе. В Java статические методы обозначаются модификатором static.
// Чтобы нужный нам метод правильно скомпилировался, требуется указать эту аннотацию.
//
//Другие источники аргументов:
//@ValueSource позволяет передать список аргументов для их проверки в тесте,
//     если для теста требуется только один аргумент.
//@CsvSource позволяет указать входные данные в формате CSV.
//@EnumSource позволяет указать тестовые данные в виде enum.
//@CsvFileSource позволяет передать путь до csv файла с данными