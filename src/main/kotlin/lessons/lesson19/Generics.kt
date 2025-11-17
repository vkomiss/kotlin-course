package lessons.lesson19

class BoxAny(val item: Any)
class Box2<T>(val item: T)

fun <S> secondOrNull(list: List<S>): S? {
    return list.getOrNull(1)
}

fun main() {
    val appleBoxAny = BoxAny("Apple")
    val intBoxAny = BoxAny(42)

    val appleBox = Box2("Apple")
    val intBox = Box2(42)

    val appleBoxAnyItem: Any = appleBoxAny.item // Any вместо строки
    val intBoxAnyItem: Any = intBoxAny.item // Any вместо числа

    val secondElementLength: Int? = secondOrNull(listOf("a", "b", "c"))?.length

}

