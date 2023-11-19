package `4 Classes`

interface McDonaltService {
    fun motoCarrier()
}

/**
 * Abstract classlar şablon classlardır. -> sözleşme
 *
 * Final ve open modifier'ları kullanmak anlamsız ve yanlıştır.
 * Çünkü abstact keyword'ü miras alabilir.Final alamasının sebebi ise miras alınamayacaksa neden sözleşme yazılsın ?
 *
 * Abstract değişkenlere değer ataması yapılmaz çünkü sözleşme olmaz .Belirli bir değer veremeyiz.
 *
 * Abstract class lara değer tanımlanabilir yani state tutarlar.
 *
 * Eğer abstract class'ınıza eklemek istediğimiz opsiyonel yapılar varsa,bunları child class'ların tamamında override
 * etmek zorunda olmayalım diye ,open keyword 'ü ile tanımlayabiliriz.
 *
 * Abstract bir class ,abstract bir class'ı miras alırsa ,abstract yapıları override etmek zorunda değildir.
 * Ancak normal bir class abstract classı miras alıyorsa bütün değişkenleri ve fonksiyonları override etmek zorundadır.
 *
 * Abstract fonksiyonun body'si olmaz.Property'lerin de default değeri olmaz.
 *
 * Abstract class 'ın nesnesi oluşturulamaz.Open classın oluşturulur farkları budur.
 *
 * Abstract class'lar aynı zamanda instance'i oluşturulamayan class'lardır.Bu sebeple singelton gibi pattern'ler
 * için de kullanılabiliyorlar.
 */
abstract class McDonalds {
    abstract val fridge: McDonaldsMaltepe.Fridge
    abstract val superVisor: McDonaldsMaltepe.SuperVisor
    abstract val employeeOne: McDonaldsMaltepe.Employee
    abstract val employeeTwo: McDonaldsMaltepe.Employee
    abstract val employeeThree: McDonaldsMaltepe.Employee
    abstract val menuList: List<McDonaldsMaltepe.McHamburger>

    val name: String = "recep" // abstract classlar içinde state tutuyoruz.
    abstract fun clean(clock: Int)

    open val policeOfficer: McDonaldsMaltepe.Police = McDonaldsMaltepe.Police()

    //  open fun makeCoffee(){} süslü parantez kullanmak istersek


}

abstract class McDonaldsExpress : McDonalds() {
    abstract fun sellCoffee(): McDonaldsMaltepe.McCoffee

    override fun clean(clock: Int) {
        println("Clean time :$clock")
    }

    /**
     *  Abstract classlarda abstract class tarafında miras alıyorsa fonksiyonları ve değişkenleri override edebiliriz.Tercihe bağlıdır override etmeyedebilir.
     *  Ama normal bir class abstract classı miras alacaksa üst classın değişkenlerini ve fonksiyonlarını override etmek ZORUNDADIR.
     */
    override val fridge: McDonaldsMaltepe.Fridge
        get() = TODO("Not yet implemented")
}

class McDonaldsMaltepe : McDonalds(), McDonaltService {
    override fun motoCarrier() {
        TODO("Not yet implemented")
    }

    override val fridge: Fridge
        get() = TODO("Not yet implemented")
    override val superVisor: SuperVisor
        get() = TODO("Not yet implemented")
    override val employeeOne: Employee
        get() = TODO("Not yet implemented")
    override val employeeTwo: Employee
        get() = TODO("Not yet implemented")
    override val employeeThree: Employee
        get() = TODO("Not yet implemented")
    override val menuList: List<McHamburger>
        get() = TODO("Not yet implemented")

    override fun clean(clock: Int) {
        TODO("Not yet implemented")
    }

    class McDonaldsKadikoy : McDonalds() {
        override val fridge: Fridge
            get() = TODO("Not yet implemented")
        override val superVisor: SuperVisor
            get() = TODO("Not yet implemented")
        override val employeeOne: Employee
            get() = TODO("Not yet implemented")
        override val employeeTwo: Employee
            get() = TODO("Not yet implemented")
        override val employeeThree: Employee
            get() = TODO("Not yet implemented")
        override val menuList: List<McHamburger>
            get() = TODO("Not yet implemented")

        override fun clean(clock: Int) {
            TODO("Not yet implemented")
        }

        override val policeOfficer: Police
            get() = Police()

    }

    class McDonaldsMaltepeExpress : McDonaldsExpress() {
        override fun sellCoffee(): McCoffee {
            TODO("Not yet implemented")
        }

        override val fridge: Fridge
            get() = TODO("Not yet implemented")
        override val superVisor: SuperVisor
            get() = TODO("Not yet implemented")
        override val employeeOne: Employee
            get() = TODO("Not yet implemented")
        override val employeeTwo: Employee
            get() = TODO("Not yet implemented")
        override val employeeThree: Employee
            get() = TODO("Not yet implemented")
        override val menuList: List<McHamburger>
            get() = TODO("Not yet implemented")

        override fun clean(clock: Int) {
            super.clean(clock)
        }
    }

    fun main() {

    }

    class Fridge
    class SuperVisor
    class Employee
    class McHamburger
    class McCoffee
    class Police

}
