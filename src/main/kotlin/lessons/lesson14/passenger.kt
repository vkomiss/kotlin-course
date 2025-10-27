package lessons.lesson14

import java.time.LocalDate
import java.time.Period


class Passenger(
    val name: String,
    private val db: String,
    private val phone: String
) {

    private val age: Int = calculateAge()

    private fun calculateAge(): Int {
        return Period.between(LocalDate.parse(db), LocalDate.now()).years

    }

}