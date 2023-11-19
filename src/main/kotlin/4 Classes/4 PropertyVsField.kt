package `4 Classes`

/**
 * Java’da her şey default olarak private iken Kotlin’de neden public?
 * Ve bu durum encapsulation’a bir problem teşkil etmiyor mu?
 * Her şey public iken Kotlin encapsulation’ı nasıl sağlıyor?
 */
/**
 * Kotlinde default olarak her şey public tir.Public olan bir değişken arka tarafata private dır ve get set metotları vardır.
 * Bu sebeple Kotlin’de tanımladığımız asset, field değil bir property’dir.
 * Ayrıca değişkeni val yaptığımızda ise arkaplanda yalnızca get metodu oluşturulur ek bilgisini de vermek isterim.
 *
 * Kotlin’de public tanımlanan değişkenler encapsulation’a bir sorun teşkil etmez.
 * Eğer değişkenimiz private ise arka tarafta da private dir ve get ,set metotları yoktur.
 */
class BankAccount{
    var balance=1_000_000
}
fun main() {
    val bankAccount =BankAccount()
    println(bankAccount.balance)
    bankAccount.balance=500_000
    println(bankAccount.balance)

    /**
     * gizlilik olarak
     * private>protected>internal>public
     */

}