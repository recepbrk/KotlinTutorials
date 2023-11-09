package `3 Functions`

fun main() {
    /**
     * Daha okunaklı kodlar yazmak için kullanılır.
     * . (nokta) kullanımını kaldırır.
     *
     * true or false kullanıcı diline daha yatkındır.
     * true.or(false)
     * 1. infix keywordu ile başlar.
     * 2. fonksiyon bir üye fonksiyon olmalıdır.(bir sınıfa ait olmalıdır.)
     * 3. ya da bir extensions fonksiyon olmalıdır.
     * 4. sadece bir parametre almalıdır.Bu parametre vararg olamaz.
     * 5. infix method'unparametresi default deger alamaz.
     *
     * Yapısal olarak ;
     *
     * infix fun infixMethod(justOneParam:AwesomeParam):Whatever{
     *
     * }
     *
     */

    val isStudent = false
    val isMale = true

    /**
     * and ,or,xor,gibi onlarca infix fonksiyon vardır.
     *
     */
    if (!isStudent and isMale) {
        println("öğrenci olamayan erkek")
    }

    // infix kullanımı
    isStudent and isMale
    isStudent.and(isMale)
}

  //  val awesomeInstance = AwesomeClass()
    //infix kullanımı

   // awesomeInstance downloadImage "www.google.com"

class AwesomeClass {
    //  infix fun downloadImage(imageUrl:String = "www.google.com"){} Çalışmaz çünkü default değeri var

    // infix fun <T> downloadImage(vararg imageUrl:T){}   Çalışmaz çünkü vararg parametre olarak alınmaz.

    infix fun downloadImage(imageUrl: String) {

    }

    infix fun specialPlus(number: Int): Int {
        return 4
    }

    //Bir sınıfın içindeyken this kullanımı size bulunduğu sınıfı işaret eder.
    //Aşşağıdaki kullanımda AwesomeClass().downloadImage(imageUrl)kullanımı oluşturur aslında .(implicit)
    fun logWhenImageDownloaded(imageUrl: String) {
        downloadImage(imageUrl)
        this downloadImage imageUrl
    }
}
// Bir sınıfın dışındayken infix method çağrımı yapılırsa this kullanılmaz.
/*  fun logWhenImageDownloaded(imageUrl: String) {

      this downloadImage imageUrl
  }*/

