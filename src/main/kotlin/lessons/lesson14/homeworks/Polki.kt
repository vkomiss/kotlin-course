package lessons.lesson14.homeworks

fun main() {
    val pol1 = shelf(20)
    val pol2 = shelf(15)
    val stell = rack(3)

    stell.addShelf(pol1)
    stell.addShelf(pol2)

    stell.addItem("Чайник")
    stell.addItem("Кружка")
    stell.addItem("Тарелка")

    stell.printContents()

    println("Удаляем предмет: ${stell.removeItem("Кружка")}")
    stell.printContents()

    println("Добавляем новую полку и предметы")
    val pol3 = shelf(10)
    stell.addShelf(pol3)
    stell.addItem("Ложка")
    stell.addItem("Вилка")
    stell.printContents()

}