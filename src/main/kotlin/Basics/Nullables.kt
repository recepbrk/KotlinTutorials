package Basics

fun main() {
    /**
     * Bir değişkene null değer ataması yapabilmek için değişken tipinin sonuna ? işaerti konulur.
     * Eger bir değişkene tip verilmez ve direk null değer ataması yapılırsa ,IDE tip çıkarımı yaparken
     * bu değişkenin değerini Nothing? olarak işaretler .Çünkü hangi tipe karşılık geldiğini bilemez.
     */

    val name: String? = null
    val age: Int? = null

    val number = null
    val number3: Nothing? = null //üstteki kodun aynısı

    val number1: Int? = null
    val number2: Int? = null

    var result: Int? = null
    result!!.plus(200)  // result null ise uygulama patlar ve null pointer exeption yersin.
    result?.plus(200)  // result null ise  uygulama patlamaz ama bu fonksiyonda çalışmaz.
}