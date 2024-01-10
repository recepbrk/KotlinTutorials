package `4 Classes`

open class BankAccount2(val balance: Int) {
    val branchCode: Long = 3245
}

interface Print {
    fun printBalance()
}

@JvmInline
value class BankAccount3(val balance: Int) : Print {
    init {
        println("balance$balance")
    }

    val accountNumber: Long
        get() {
            return 1234235
        }

    fun getAccountNumber2(): Long {
        return 1234235
    }

    override fun printBalance() {
        TODO("Not yet implemented")
    }
}

/**
 * value class'lar @JvmInline annotation olmadan henüz kullanılamıyorlar.
 *
 * value class'lar şuan için sadece tek bir değişken kabul etmektedir.Birden fazla değişkene izin verilmemektedir.
 * Ancak value class'ların dökümantasonunda inline classların ileride birden fazla değişken almasına
 * izin verileceği yazmaktadır.
 *
 * inline classlar ile init block'u kullanılabilir.
 *
 * inline class'ların belirtilen constructor'ları java kodunda private olarak bulunurlar.
 * Bundan dolayı istesek de bu constructor'larda nesne oluşturamayız.Ama bunu yapabiliyor gibi
 * görünmemizin sebebi ,gerçekte o nesnenin hiç yaratılamıyor oluşu sebebiyle.
 * Bizim nesne oluştururken gördüğümüz şey aslında const. içindeki değişkenin kendisi.
 *
 * Inline classlar içinde property tanımlamasına izin verilir.Ancak bu property'nin backing field'ı olamaz.
 * Inline classlar herhangi bir interface'i implement edilebilir.bir başka class'ı  miras alamazlar.
 *
 * Inline calsslar miras alınamaz.Çünkü default olarak final'lardır ve değiştirilemezler.
 * Open keywor'üyle beraber kullanılamaz. finalkeyword'ü vermek de reduldant uyarısı verir.
 * abstract ,sealed   keyword'ü ile de kullanılmaz.
 *
 */

interface I

@JvmInline
value class Foo2(val i: Int) {
    fun asInline(f: Foo2) {}
    fun <T> asGeneric(x: T) {}
    fun asInterface(i: I) {}
    fun asNullable(i: Foo2?) {}

    fun <T> id(x: T): T = x
}

fun main() {
    val balance2: BankAccount2 = BankAccount2(25000)
    val balance3: BankAccount3 = BankAccount3(25000)

    /**
     *  bankAccount3       32kb  -> referans(class nesnesi) tiple davranır
     *  25000              4kb   -> primitive tiple davranır (value class kullanım)
     */
    val f = Foo2(42) // f in tipi int -> primitive ->unboxed

    // f.asInline(f) //unboxed
    //f.asGeneric(f)// boxed
    //f.asInterface(f)//boxed
    //f.asNullable(f)//boxed
}