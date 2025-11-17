package lessons.lesson19.homeworks

// Создай класс ListValidator с дженериком, ограниченным типом Number,
// имплементируй интерфейс Validator,
// типизированный по типу List с nullable типом дженерика класса.
//
// Реализуй проверку:
// 1) ни один элемент списка не является null
// 2) ни один элемент, приведённый к типу Double, не равен 0.0
class ListValidator<T : Number> : Validator<List<T?>> {
    override fun isValid(el: List<T?>): Boolean {
        for (item in el) {
            if (item == null) return false
            if (item.toDouble() == 0.0) return false
        }
        return true
    }
}