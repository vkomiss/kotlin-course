package lessons.lesson17.homeworks

// Тема: Игровой автомат.
// Опиши схематически класс игрового автомата, правильно расставив объявление полей (val или var) и
// методов (аргументы и возвращаемые значения), включая модификаторы доступа (private для приватных)

class PlayAutomat(
    val cvet: String,
    val model: String,
    var vklyuchen: Boolean,
    var osZagruzhena: Boolean,
    private val spisokIgr: MutableList<String>,
    var estDjoystik: Boolean,
    private var balans: Double,
    val vladelec: String,
    val telPodderjki: String,
    var sessiyaOplachena: Boolean,
    val stoimostSessii: Double,
    private val pinKod: String
) {

    fun vklyuchit() { }

    fun vyklyuchit() { }

    fun zagruzitOS() { }

    fun zavershitOS() { }

    fun pokazatSpisokIgr(): List<String> {
        return spisokIgr
    }

    fun vklyuchitIgru(nazvanie: String) { }

    fun oplatitSessiyu(summa: Double): Boolean {
        return true
    }

    fun zabratNalichnye(vvedennyyPin: Int): Double {
        return 0.0
    }

    private fun otkrytSeifIVydatNalichnye(): Double {
        return 0.0
    }
}
