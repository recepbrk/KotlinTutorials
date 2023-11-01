package GettingStarted

fun main() {


    // Tekil yorum satırı

    /*
        Çoklu yorum satırı
     */

    /**
     * Dökümantasyon yorum satırı
     */

// TODO (Recep Güzel) daha sonra yapılacak olan işin bilgilendirilmesi için kullanılı

    
    // var -> varible    mutable -> değişebilir
    //val -> value       immutable -> değişmez
    /**
    Performans olarak var daha performanslıdır .Ama val kullanılmalıdır sebebi ise Threadler arasındaki iletişim maliyetidir.
    var'ın performanslı olmasının sebebi val da değeri sabitlediğimiz için ekstra maliyetin olmasıdır.
     */

    /**
     * const ile val arasındaki farklar ikiside sabittir ama const  derleme sırasında sabitler.
     * diğer fark ise val istediğimiz değişkenleri atarken const a primitive veya string ifadeler atayabiliriz.
     */
    var name: String = "Recep"
    val surName: String = "Güzel"

    println(name)
    println(surName)

    var eyeColor: String
    eyeColor = "Brown"
    println(eyeColor)
}