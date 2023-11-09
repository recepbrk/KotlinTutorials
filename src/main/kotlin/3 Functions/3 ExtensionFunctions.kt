package `3 Functions`

import kotlin.math.log2

fun main() {
    /**
     * Üzerinde değişiklik yapamadığımız (readOnly) sınıflara ,ya da yapmak istemediğimiz sınıflara ,bu sınıfların
     * içerisinde yazmadan fonksiyon tanımlayabilmemizi sağlar. Böylece o sınıfa üye bir fonksiyon kazandırabiliriz.
     * Bunu yaparken unutmamız gerek ; yazdığınız extension fonksiyon aslında o sınıfın gerçek bir fonksiyonu olmayacaktır.
     *
     * Receiver diye adlandıracağımız bir sınıfa ihtiyac duyar. Receiver -> Extensions yazacağımız sınıfı ifade eder.
     *
     * Yapısal olarak
     * fun String.extPrint(handsomeValue :HandsomeOne):Unit{ // Normal fonksiyon gibi yaz sadece fonksiyon isminin önüne extends etmek isteğin sınıfın adını yaz !!
     *
     */

    // normalde değişkenlere değer atayıp ,print islemini aşşağıdakiler gibi yaparız.
    val pi: Double = 3.14
    println(pi)

    val schoolNumber: Int = 1907
    println(schoolNumber)
    val myString = "hello"
    val result = myString.removeFirstLastChar()
    println(result)

    // yukarıdaki kullanımların yerine normal bir log2 fonksiyonu yazılabilir ve assağıdakigibi kullanılabilir.

    log2(pi)
    log2(schoolNumber)
    3 log "hello"
}

fun log2(number: Int) {
    println(number)
}

fun String.removeFirstLastChar(): String {   //Extension kullanım örnek
    return this.substring(1, this.length - 1)
}

/**
 * Number (receiver) sınıfına extensions olarak yazılmış log fonksiyonu .Aynı zamanda infix yapılmıştır.
 * this ifadesi ,extension yapılan degeri verir. 3 log 4 yaparsak
 * assagıdaki kod size emtyParam = 4 this = 3 olarak verir.
 */
infix fun Number.log(emtyParam: String) {
    println(emtyParam + this)
}

open class Shape {
    var intNumber = 0
    fun setNumber(intNumber: Int) {
        this.intNumber = intNumber
    }

    fun main() {
        intNumber.extToString()
        intNumber.log("")
    }


    /**
     *  Bir sınıfın içinde ,farklı bir sınıfa ait extension fonksiyon yazılırsa ,bu sınıfın içinde aynı isimde normal
     *  bir fonksiyon olsa bile ,extension fonksiyonun içerisinde ,aynı isme sahip fonksiyon çağrılırsa ,bu extension
     *  fonksiyona isaret eder demektir.Sınıfın aynı ismindeki üye fonksiyonunu extension fonksiyoniçerisinde çağırmak içinn
     *  this@sınıfismi.üyefonksiyon() şeklinde çağırım yapılabilir.
     */

    open fun Int.extToString() {
        println("")

        //Int.extToString() metodunuisaret eder.
        extToString()


        // Shape e ait assağıdaki üyemetodu isaret eder.
        this@Shape.extToString()
        println("awesome class print")

    }

    fun extToString() {
        println("keko class print")

    }


}