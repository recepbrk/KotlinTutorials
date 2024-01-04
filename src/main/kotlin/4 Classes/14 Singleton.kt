package `4 Classes`

object ProfileKotlin {
    var nickName: String? = null
    var counter: Int = 0
}

/**
 * Burada object olarak tanımlama yaptığımız için Singleton bir yapı oluşturduk .
 * Counter değeri singleton bir değer olduğu için nesnesini  birden fazla çağırdığımızda aynı nesne çağrıldı .Buyüzden counter değerimiz 4 oldu.
 * Eğer yapımız singleton olmasaydı her seferinde başka bir nesene üretilecekti ve değerimiz 1 olurdu.
 *
 * Bir class ı singleton yapmamız için
 * 1-Class'ın nesnesinin dışardan oluşturulmasını engelle -> constructor private yap veya abstract class yap
 * 2- Sınıfın private static instance’nın oluşturulması
 * 3-Oluşturulan instance’ı dönen static metodun oluşturulması
 *
 *
 *
 *
 *
 */
fun main() {
    ProfileKotlin.nickName = "Arkhu"
    ProfileKotlin.counter++
    ProfileKotlin.counter++
    ProfileKotlin.counter++
    ProfileKotlin.counter++

    println(ProfileKotlin.counter)
}