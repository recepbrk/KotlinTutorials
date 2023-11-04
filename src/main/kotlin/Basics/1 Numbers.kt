package Basics

fun main() {

    /**
     * Byte -> 8 bit
     * Short -> 16bit
     * Int -> 32 bit
     * Long ->64 bit      Tanımlamanın sonuna L harfi konulur.
     * Float -> 32 bit   Tanımlamanın sonuna F yada f harfi konulur.
     * Double -> 64 bit
     *
     * Tip çıkarımlarını (Type İnference ) sırasında eğer sayı Int ifadeden büyük değilse tipi default olarak Int set edilir.
     *
     *Tip çıkarımlarını (Type İnference ) sırasında eğer sayı Int ifadeden büyükse tipi default olarak Long set edilir.
     *
     *
     * Boxed -> Değişkenin obje referansı olarak tutulmasıdır.
     * Unboxed -> Değişkenin primitive olarak tutulmasıdır.
     *
     * == -> değer karşılaştırıken kullanılır.
     * === -> referans karşılaştırırken kullanılır.
     *
     *
     */

    val number: Int = 100
    println(number == number) // True değeri döner

    val boxedNumber: Int? = number
    val anotherBoxedNumber: Int? = number

    println(boxedNumber === anotherBoxedNumber)  // False değeri döndürür çünkü  referans karşılaştırması yapacağı için bunun sebebi Null olduğu içindir.

}