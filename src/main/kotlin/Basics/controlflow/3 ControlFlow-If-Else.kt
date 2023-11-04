package Basics.controlflow

fun main() {
    print("Öğrenci misin ?")

    val answer = readLine()!!


    //STATE KULLANIMI -> NORMAL KULLANIM
    if (answer.contains(
            "Evet", ignoreCase = true
        )
    ) {  // contains içeriyor mu anlamına gelir biz cevap olarak evets de yazsak ÖĞRENCİ çıktısını verecektir.
        println("ÖĞRENCİ")
    } else {
        println("ÖĞRENCİ DEĞİL")
    }


    //EXPRESSİON KULLANIMI  -> KOŞULU BİR DEĞİŞKENE ATAMAK DURUMUDUR.
    val result: String = if (answer == "Evet") {
        ("Öğrenci")
    } else {
        ("Öğrenci Değil")
    }
    println(result)

    print("Final notu giriniz .")
    val grade = readLine()!!.toInt()
    //Bu kod bloğunu sadece if kullanarak da yazabiliriz ama performans olarak kötüdür çünkü burada bir değer aralığı bulunduysa
    //diğer şartlı ifadeler kontrol edilmez ama if lerle yazmış olsaydık bulunsa bile diğer şart koşulları kontrol edilecekti .
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
    /**
     * iki farklı tipteki number değerler karşılaştırılırken equals fonksionu önce tiplerini karşılaştıracağı için
     * eğer tipler uyuşmuyorsa ,ide hata verecektir.
     */
    //   if (10 == 10L){ } // ÇALIŞMAZ
    //  if (10 == 10L.toInt()){} // ÇALIŞIR

}
