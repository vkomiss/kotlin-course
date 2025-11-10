package lessons.lesson18.homeworks

// Создай абстрактный класс для включаемого оборудования и имплементируй соответствующий интерфейс
// с реализацией методов (достаточно println с выполняемым действием).
abstract class VklDevice : Powerable {

    // Поле для хранения состояния питания
    protected var isPoweredOn: Boolean = false

    override fun powerOn() {
        if (!isPoweredOn) {
            isPoweredOn = true
            println("Устройство включено.")
        } else {
            println("Устройство уже включено.")
        }
    }

    override fun powerOff() {
        if (isPoweredOn) {
            isPoweredOn = false
            println("Устройство выключено.")
        } else {
            println("Устройство уже выключено.")
        }
    }
}
