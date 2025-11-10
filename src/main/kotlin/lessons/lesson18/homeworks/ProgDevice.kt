package lessons.lesson18.homeworks

// Cоздай абстрактный класс для программируемого оборудования (с имплементацией соответствующего интерфейса
// и реализацией методов) и наследуй его от абстрактного класса включаемого оборудования
abstract class ProgDevice : VklDevice(), Programmable {

    // Последняя запрограммированная команда
    protected var lastProgrammedAction: String? = null

    // Загрузка программы устройства
    override fun programAction(action: String) {
        if (isPoweredOn) {
            lastProgrammedAction = action
            println("Программа загружена: $action")
        } else {
            println("Устройство выключено...")
        }
    }

    // Само выполнение программы
    override fun execute() {
        if (isPoweredOn) {
            if (lastProgrammedAction != null) {
                println("Выполняю программу...")
            } else {
                println("Нет загруженной программы.")
            }
        } else {
            println("Устройство выключено...")
        }
    }
}
