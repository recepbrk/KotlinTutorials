package `3 Functions`

fun main() {
    /**
     * Fonksiyon herhangi bir sınıfın içerisinde değil de bir dosyanın içerisinde boşlukta tanımlanıyorsa
     * top level fonksiyon adını alır.
     *
     * Bir fonksiyon oluştururken top level tanımlama yapılamıyor,sadece sınıfa ait fonksiyonlar yazılabiliyorsa,
     * bu fonksiyon değil,method denir.Bir fonksiyona fonksiyon diyebilmemiz için top leveltanıımlanabiliyor olması lazımdır.
     */

    calculateAtomPhysics()

}

fun calculateAtomPhysics() {
    val userName = "Codemy"
    println("Initialize Process..")

    fun getValuesFromUserAndPrint() {
        userName.length

    }
}
/**
 * Fonksiyon içerisinde fomksiyon tanımı kotlin'de yapılabilir.Bu foksiyonlara Local Functions denir.
 * Sebebi isse ,yazdığımız fonksiyonun kendi sınıfımızdan dahi çağrılmasını istemyebilirsiniz.
 * Bu fonksiyonun herhangi bir başka fonksiyon yada sınıf için değiştirilmesini istemeyebilirsiniz.
 * Reflection ile fonksiyonlarınız erişilirken gizli kalsın isteyebilirsiniz.
 * Bu gibi durumlarda bu çok önemli fonksiyonumuzu baska bir fonksiyon içerisinde yazabilirsiniz.
 */


/**
 * Bir sınıfın içerisindeki fonksiyonlara ,üye fonksiyonlar denir.
 */
class Car {
    fun setColor(colorCodeId: Int) {

    }
}

/**
 * bir fonksiyon Generic tip alıyorsa ,Generic Function olarak adlandırılır.
 */
fun <T> setColor(colorCodeId: T) {

}