package lessons.lesson18.homeworks

// Создай абстрактный класс оборудования с возможностью устанавливать температуру
// и открываться и с наследованием от программируемого оборудования. Также имплементируй интерфейсы.
abstract class TempDevice(
    override val maxTemperature: Int
) : ProgDevice(), TemperatureRegulatable, Openable {

    // Текущее состояние температуры
    private var currentTemperature: Int = 0

    // Состояние открытости устройства
    private var isOpen: Boolean = false

    override fun setTemperature(temp: Int) {
        if (!isPoweredOn) {
            println("Устройство выключено — невозможно установить температуру.")
            return
        }

        if (temp in 0..maxTemperature) {
            currentTemperature = temp
            println("Температура установлена: $temp")
        } else {
            println("Ошибка: допустимая температура от 0 до $maxTemperature")
        }
    }

    // Реализация интерфейса Openable
    override fun open() {
        if (!isPoweredOn) {
            println("Устройство выключено — невозможно открыть.")
            return
        }

        if (!isOpen) {
            isOpen = true
            println("Устройство открыто.")
        } else {
            println("Уже открыто.")
        }
    }

    override fun close() {
        if (isOpen) {
            isOpen = false
            println("Устройство закрыто.")
        } else {
            println("Уже закрыто.")
        }
    }

    fun showStatus() {
        println(
            """
            Состояние устройства:
            • Включено: $isPoweredOn
            • Открыто: $isOpen
            • Температура: $currentTemperature°C
            """.trimIndent()
        )
    }
}
