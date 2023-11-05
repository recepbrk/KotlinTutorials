package Basics.controlflow

fun main() {
    /**
     * switch case'lerin yerine gelmiştir.
     * when(karşılaştırılacak_ifade)
     * value -> {}
     * value -> {}
     * else -> {}
     * formatıyla kullanılır.
     *
     * Yine {} arasına tek satır kod yazılacaksa bu durumda {}'leri kullanmayabilirsiniz.
     * "tr","az" gibi aynı kodu çalıştıracak case'ler varsa araya virgül koyarak kullanabiliriz.
     * Bu "veya" kullanımı yapmayı sağlar. "tr veya az" gibi.
     */
    println("Lütfen ülke kodunu giriniz.")
    val contryCode = readLine()!!
    when (contryCode.lowercase()) { //LowerCase ,UpperCase küçük büyük harf uyumudur.
        "tr", "az" -> println("türk") // burada virgül veya anlamına gelir.
        "ar" -> println("arap")
        "fr" -> println("fransız")
        "ru" -> println("rus")
    }
    /**
     * when'in yanına karşılaştırma ifadesi eklemeden ,bucase'lerin yanına da ekleyebilirsiniz.
     * Bunun artısı && || and or xor gibi ifadeleri de kullanabilmemizi sağlar.
     */
    when {
        contryCode.lowercase() == "tr" || contryCode.lowercase() == "az" -> println("türk vatandaşı")
        contryCode.lowercase() == "uk" -> println("ingiliz vatandaşı")
        contryCode.lowercase() == "ru" -> println("rus vatandaşı")


    }
    // if else ile kullanım
    if (contryCode.lowercase() == "tr" || contryCode.lowercase() == "az")
        println("türk vatandaşı")
    else if (contryCode.lowercase() == "uk")
        println("ingiliz vatandaşı")
    else if (contryCode.lowercase() == "ru")
        println("rus vatandaşı")
    else
        println(" türk ,ingiliz,rus vatandaşı değilsin!")


    /**
     * whenleri de expression olarak kullanabiliriz.
     */

    val contrycode2 = when (contryCode.lowercase()) { //LowerCase ,UpperCase küçük büyük harf uyumudur.
        "tr", "az" -> println("türk") // burada virgül veya anlamına gelir.
        "ar" -> println("arap")
        "fr" -> println("fransız")
        "ru" -> println("rus")
        else -> {
            "türk arap fransız rus vatandaşı değilsin."
        }
    }
    println(contrycode2)

    /**
     * is  !is bir class'ın referansı olunup olamadığı konrolu yapacaktır.
     */

    val phoneNumber = 123456523698
    when (phoneNumber) {
        is Long -> {
            println("long")
        }

        !is Long -> {
            println("not long")
        }
    }
    /**
     * range'leri in !in şeklinde kontrolu yapılacaktır. Range kullacaksak in kullanmak zorundayız.
     */

    val number = 7

    when (number) {
        in 0..10 -> {
            println("$number : 0-10 arasındadır.")
        }

        in 11..20 -> {
            println("$number : 11-20 arasındadır.")
        }

        !in 20..100 -> {
            println("$number : 20 den büyük bir sayıdır.")
        }
    }

    // Kullanıcıdan vize1 ,vize2 , final notunu alıp ve ağırlık değerlerini alan buna göre not hesaplayıp notlandıran program .
    println("------------------------------")
    println("Vize Final Notu Hesaplama")
    println("Lütfen Vize1 ,Vize2 ve Final notunuzu giriniz.")

    val grade1 = readLine()!!.toInt()
    val grade2 = readLine()!!.toInt()
    val grade3 = readLine()!!.toInt()

    println("Lütfen Vize1 ,Vize2 ve Final notunuzun ağırlık değerlerini giriniz.")
    val weight1 = readLine()!!.toInt()
    val weight2 = readLine()!!.toInt()
    val weight3 = readLine()!!.toInt()

    val examGrade1: Int = (grade1 * weight1) / 100
    val examGrade2: Int = (grade2 * weight2) / 100
    val examGrade3: Int = (grade3 * weight3) / 100

    val totalPoint = examGrade1 + examGrade2 + examGrade3

    when (totalPoint) {
        in 80..100 -> {
            println("$totalPoint : AA")
        }

        in 50..79 -> {
            println("$totalPoint :BB")
        }

        !in 49..0 -> {
            println("$totalPoint :CC")
        }
    }


}