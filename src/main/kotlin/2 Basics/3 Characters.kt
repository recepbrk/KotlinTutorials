package `2 Basics`

fun main() {
    /**
     * Tek tırnakların arasına ,harf ,sayı,escape char yada unicode yazarak kullanılır.
     * Çift tırnak içerisine yazılırsa String olur .Char olmaz.
     */

    val firstCharofName: Char = 'A'
    val charNumber: Char = '5'

    /**
     * Number değer alan bir Char değişken Int' e çevrilirken ,gerçek sayısal değerini almaz.
     * Alacağı değer ASCII tablosundaki o sayının karşılığını alacaktır .
     *
     */
    val convertedCharNumber = charNumber.toInt()
    println(convertedCharNumber) // 53 değeri döndürür

    /**
     * Unicode karakterlerini tanımlamak için kullanılır.
     *
     */
    val uniCode = '\uFF00'

    println("uniCode" + uniCode)
}