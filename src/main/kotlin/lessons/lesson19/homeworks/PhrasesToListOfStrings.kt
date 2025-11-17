package lessons.lesson19.homeworks

// Создай класс PhrasesToListOfStrings и имплементируй интерфейс Mapper
// с типами String и List<String>.
// Метод преобразования должен разбивать входящую строку по символу пробела
// и возвращать список из полученных слов.
// Метод преобразования списков — с аналогичной механикой.
class PhrasesToListOfStrings : Mapper<String, List<String>> {
    override fun mapOne(el: String): List<String> {
        return el.split(" ")
    }
    override fun mapList(lst: List<String>): List<List<String>> {
        return lst.map { it.split(" ") }
    }
}