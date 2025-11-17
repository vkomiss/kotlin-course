package lessons.lesson19.homeworks

// Напиши интерфейс Validator с дженериком,
// с функцией валидации, которая принимает элемент типа дженерика
// и возвращает булево значение.
interface Validator<T> {
    fun isValid(el: T): Boolean
}