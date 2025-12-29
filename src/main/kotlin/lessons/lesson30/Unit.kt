package lessons.lesson30

fun main() {

//    Подключение JUnit
//
//            Для использования JUnit в проекте, необходимо добавить зависимость в файл build.gradle для Gradle:

    dependencies {
        // Добавление зависимости JUnit Jupiter API для написания тестов
        testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.0")
        // Добавление движка JUnit Jupiter для запуска тестов
        testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.0")
    }
    tasks.test {
        // Включение использования JUnit Platform для запуска тестов
        useJUnitPlatform()
    }

//    Используемые аннотации JUnit
//    @Test – указывает, что метод является тестовым.
//    @BeforeEach / @AfterEach – методы, помеченные этими аннотациями, выполняются до или после каждого теста соответственно.
//    @BeforeAll / @AfterAll – методы, помеченные этими аннотациями, выполняются один раз до начала всех тестов и после завершения всех тестов класса.
//    Примеры
//    Давайте рассмотрим абстрактный пример юнит теста для метода сложения двух чисел:

    @Test
    fun additionTest() {
        // Предположим, есть класс Calculator с методом add()
        val calc = Calculator();

        assertEquals(5, calc.add(2, 3), "2 + 3 должно быть равно 5");
    }


//    Использование аннотаций @BeforeEach / @AfterEach

    class SimpleTest {

        private lateinit var testList: MutableList<String>

        @BeforeEach
        fun setUp() {
            // Инициализация перед каждым тестом
            testList = mutableListOf("one", "two", "three")
            println("Список инициализирован перед тестом")
        }

        @AfterEach
        fun tearDown() {
            // Очистка после каждого теста
            testList.clear()
            println("Список очищен после теста")
        }

        @Test
        fun testAddElement() {
            // Добавляем элемент и проверяем размер списка
            testList.add("four")
            assertEquals(4, testList.size, "Размер списка должен быть 4")
        }

        @Test
        fun testRemoveElement() {
            // Удаляем элемент и проверяем размер списка
            testList.remove("one")
            assertEquals(2, testList.size, "Размер списка должен быть 2")
        }
    }

//    Использование аннотаций @BeforeAll / @AfterAll

    class CounterTests {

        companion object {
            var counter: Counter? = null
            var initialValue: Int = 0
            @JvmStatic
            @BeforeAll
            fun setup() {
                initialValue = Random.nextInt(0, 100)
                println("Инициализация Counter с начальным значением $initialValue.")
                counter = Counter(initialValue)
            }
            @JvmStatic
            @AfterAll
            fun tearDown() {
                println("Очищаем ресурсы после тестов.")
                counter = null
            }
        }

        @Test
        fun testInitialState() {
            println("Проверка начального состояния счетчика.")
            assertEquals(initialValue, counter?.value, "Начальное состояние счетчика должно быть $initialValue.")
        }

        @Test
        fun testIncrement() {
            println("Тестирование инкремента.")
            counter?.increment()
            assertEquals(initialValue + 1, counter?.value, "После инкремента значение счетчика должно быть ${initialValue + 1}.")
        }

        @Test
        fun testDecrement() {
            println("Тестирование декремента.")
            counter?.decrement()
            assertEquals(initialValue - 1, counter?.value, "После декремента значение счетчика должно быть ${initialValue - 1}.")
        }
    }

    class Counter(var value: Int) {
        fun increment() { value++ }
        fun decrement() { value-- }
    }

}