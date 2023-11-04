package Basics.controlflow

/**
 * Operator overloading öperatörlerin yaptığı işin değiştirilmesidir.Onlara ek özellikler yüklemektir .
 */
data class PairNumber(val numberOne: Int, val numberTwo: Int) {

    operator fun minus(pairNumber: PairNumber): PairNumber { // Burada minus sınıfına ek özellik yazdık .
        val returnPairObject = PairNumber(
            numberOne - pairNumber.numberOne,
            numberTwo - pairNumber.numberTwo
        )
        println("Sonuç : (${returnPairObject.numberOne}, ${returnPairObject.numberTwo})")
        return returnPairObject
    }
}

fun main() {
    val a = 5
    val b = 8

    var result = a + b
    result = a.plus(b)

    val pairNumberOne = PairNumber(2, 4)
    val pairNumberTwo = PairNumber(-8, 11)


    val resultOne = pairNumberOne.numberOne - pairNumberTwo.numberOne
    val resultTwo = pairNumberOne.numberTwo - pairNumberTwo.numberTwo
    println("Sonuç : ($resultOne,$resultTwo)")
}