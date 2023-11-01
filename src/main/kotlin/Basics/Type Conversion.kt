package Basics

fun main() {
    /**
     * Implicit Type Conversion -> Örtülü (Kapalı)  belirgin olmayan tip dönüşümüdür.
     *
     *Emplicit Tpe Conversion -> Acık belirgin tip dönüşümüdür.
     *
     * Kotlinde Implicit tip dönüşümü yoktur .
     * val number :Int =(Int) 3L  Kotlinde böyle bir şey yoktur java da ismine casting denir .
     *
     */

    /**
     * Tip Dönüşümü için Kulllanabileceğimiz Fonksiyonlar
     *
     * toByte(),toShort(),toInt(),toLong(),toDouble(),toFloat(),toChar(),toString(),toUByte(),toUShort() ...

     */


    /**
     * Tip dönüşümü yapılırken değer dönüşümlerine dikkat edilmelidir.
     *
     */
    val schoolNumber = 126.toByte()
    val convertedValue: Short = schoolNumber.toShort()

    println("schoolNumber" + schoolNumber)
    println("convertedValue" + convertedValue)


    /**
     * Daha büyük bir değeri daha küçük bir değere dönüştüremeyiz.
     */
    val tcIdentityNumber = 12345678912 // Int den büyük olduğu için otomatik Long olarak tutulur.
    val convertedInt = tcIdentityNumber.toInt()

    println("convertedInt" + convertedInt) //Dönüşüm yapar ama hatalı olur Çıktı -> -539222976 alakasız bir sayı çıktı .
}