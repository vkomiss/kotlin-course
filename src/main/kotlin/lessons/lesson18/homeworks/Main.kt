package lessons.lesson18.homeworks

class SmartFridge(maxTemp: Int) : TempDevice(maxTemp) {
    fun coolDown() {
        println("Холодильник охлаждает продукты...")
    }
}

class Oven(maxTemp: Int) : TempDevice(maxTemp) {
    fun bake() {
        println("Духовка готовит вкусные блюда...")
    }
}

class CoffeeMachine(maxTemp: Int) : TempDevice(maxTemp) {
    fun brewCoffee() {
        println("Кофемашина варит кофе...")
    }
}

fun main() {
    val fridge = SmartFridge(maxTemp = 10)
    val oven = Oven(maxTemp = 250)
    val coffee = CoffeeMachine(maxTemp = 100)

    println("ХОЛОДИЛЬНИК ===")
    fridge.powerOn()
    fridge.open()
    fridge.setTemperature(5)
    fridge.programAction("Автоохлаждение")
    fridge.execute()
    fridge.coolDown()
    fridge.showStatus()
    fridge.close()
    fridge.powerOff()

    println("ДУХОВКА")
    oven.powerOn()
    oven.setTemperature(200)
    oven.programAction("Выпекание хлеба")
    oven.execute()
    oven.bake()
    oven.showStatus()
    oven.powerOff()

    println("КОФЕМАШИНА")
    coffee.powerOn()
    coffee.open()
    coffee.setTemperature(90)
    coffee.programAction("Приготовить капучино")
    coffee.execute()
    coffee.brewCoffee()
    coffee.showStatus()
    coffee.close()
    coffee.powerOff()
}