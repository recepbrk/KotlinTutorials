package `2 Basics`

fun main() {
    /**
     * Sonlu sayılı liste oluşturmaya yarar.
     */

    /**
     * Küçükten büyüğe liste oluşturmak için .. operatorünü ,ya da rangeTo() fonksiyonu kullanılır.
     */
    val numbers = 1..100
    val numbers2 = 1.rangeTo(100)

    /**
     * Char'lardan olusan bir liste tanımlanabilir .Turkce karakterleri icermez.
     */
    val alphabet = 'A'..'Z'

    /**
     * Büyükten küçüğe .. operatörü ile liste oluşturamayız.Ide hata verecektir.
     * Büyükten küçüğe liste oluşturmak için downTo() fonksiyonunu kullanabiliriz.
     */
    // val reversedNumbers=100 ..1 // Çalışmaz
    val reversedNumbers = 100.downTo(1)

    /**
     * until fonksiyonu kullanarak dda range tanımlanabilir.Ancak bu durumda bitis değeri dahil olmaz.
     */
    val gradeNumbers = 10.until(100) // [10,100)
    val gradeNumbers1 = 10.rangeTo(99) // üstteki kod ile aynıdır.
    gradeNumbers.forEach {
        println(it)
    }

    /**
     * step fonksiyonu kullanarak liste olustururken belli sayıda atlmalar yapabilirsiniz.
     */
    val stepedNumbers = 1..100 step (2)
    stepedNumbers.forEach {
        print(it)
    }

    val reservedStepedNumbers = 100 downTo 1 step 3
    reservedStepedNumbers.forEach {
        println(it)
    }

    /**
     * CharRange ,IntRange gibi primitive tiplerle de range tanımı yapılabilir.
     * Bu durumda ,first ,last ,step ,count gibi ek bilgiler alabilir.
     */

    val numberList: IntRange = 10 until 90
    numberList.first
    numberList.last
    numberList.step

    when (10) {
        in numberList -> {
            println("10 sayısı numburlist içerisinde vardır ")
        }

        !in numberList -> {
            println("10 sayısı numburlist içerisinde yoktur")
        }
    }

    val countBiggerThan50 = numberList.count() { it > 50 }
    println(countBiggerThan50)


}