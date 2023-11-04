package Basics.controlflow

fun main() {

    var numberOne = 10
    val numberTwo = 5

    println("NumberOne : $numberOne") //10
    println("NumberOne : ${numberOne++}") //10  Önce yazdırıp sonra değeri arttıracak.
    println("NumberOne : ${numberOne}")   //11
    println("NumberOne : ${++numberOne}")  //12  //önce değeri arttırıp sonra yazdıracak

    print("${numberOne + numberTwo}")
    print(" ")
    println(numberOne.plus(numberTwo))

    print("${numberOne - numberTwo}")
    print(" ")
    println(numberOne.minus(numberTwo))

    print("${numberOne * numberTwo}")
    print(" ")
    println(numberOne.times(numberTwo))

    print("${numberOne / numberTwo}")
    print(" ")
    println(numberOne.div(numberTwo))

    print("${numberOne % numberTwo}")  // Kalanı hesaplar
    print(" ")
    println(numberOne.rem(numberTwo))

    println("-----------------------------------------------")

    print("Final notu giriniz .")
    val grade = readLine()!!.toInt()

    val charNote = if (grade == 100) {
        println("$grade = AA")
    } else if (grade <= 99 && grade >= 80) {
        println("$grade = BB")
    } else if (grade <= 79 && grade >= 50) {
        println("$grade = CC")
    } else if (grade <= 49 && grade >= 20) {
        println("$grade = DD")
    } else if (grade <= 19 && grade >= 0) {
        println("$grade = DD")
    } else {
        "$grade = Bulunamadı !"

    }
    println("------------------------------------------------------")
    // Önce işlemi yap sonra soldaki değişkene eşitle
    var a = 20
    var b = 5
    a += b
    println(a)

    a -= b
    println(a)

    a *= b
    println(a)

    a /= b
    println(a)

    a %= b
    println(a)


    /**
     *  ===  referans tiplerini karşılaştırır.
     *  ==   değer karşılaştırılması yapar .
     *   =  değer ataması yapar.
     *
     */
}