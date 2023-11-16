package `4 Classes`


/**
 * Classların dışında biz değişken veya fonksiyon tanımlayabiliyoruz . Buna Top Level denir.
 * Private ,public,internal şeklinde değişken veya fonksiyon tanımlayabiliyoruz ama protected tanımlama yapamıyoruz.
 * Bunun sebebi top level tanımlamaların mirası alınamıyor .Bu yüzden protected tanımlama yapamıyoruz.
 */
private val identityNumber =12345678912 // Bu bir Top-Level tanımlamadır.



open class Foo() {
    private val name = "Recep"  // Sadece bulunduğu class ta kullanılabilir.
    public var surName = "Güzel" // Her yerden erişim sağlanabilir.
    internal var age =   21         //Aynı modül içerisindeki herhangi bir sınıftan erişilebilir.Başka modülden erişilemez.
    protected val email = "recepgzelr@gmail.com"  //  Sadece kendi  içerisinde ve miras alan sınıflarda kullanılır.

    fun printName() {
        println("Merhaba$name")
        println("Surname$surName")
        println("Email$email")
        println("age$age")

        /**
         * -------------------------------Youtube Örneği-------------------------------------------------------
         */
    }

    private fun download(url: String) { //indirme işleminin yapılığı fonksiyon

    }

    private fun startOwnAds() {

    }

    fun downloadVideo(url: String) {
        startOwnAds()
        download(url)
    }
}

class Boo private constructor() :Foo() {
    init {

        // name erişilmez
        surName
        age
        email
    }
}

class Doo() {
    init {
        val foo = Foo()
        //foo.name
        foo.surName
        foo.age
        //foo.email
    }
}


fun main() {
    val foo = Foo()
    //foo.name="akaka"  Erişim sağlanamıyor
    foo.surName = "hello"
    //foo.email="hello"  Erişim sağlanmıyor
    foo.age=5
    foo.downloadVideo("www.youtube.com") // bu fonksiyona erişir ama indirme işlemini yapan ve reklam gösteren fonk. erişemez.
}