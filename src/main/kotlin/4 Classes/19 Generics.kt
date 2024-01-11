package `4 Classes`

/**
 * Elimizde bir fonksiyon veya bir class var diyelim VE parametreye ihtiyaç duyuyoruz ama bu parametrenin tipini ne olacağını bilmiyoruz,kestiremiyoruz.
 * Bizde herhangi bir T anında kullanacağımız fonksiyon veya classın parametresinin ne olacağını bilmiyorsak bu durumlarda generic kullanılır.
 * Android te BaseFragment gibi base yapılarda karşımıza çıkar.
 *
 * out -> kendi ve alt classları yani çocukları tarafından erişim sağlanabilir.
 * in -> kendi ve üst classları tarafında erişim sağlanabilir.
 *
 * Auto -> MiniCooper -> John ->JohnCabrio
 *      -> Beetle
 *
 * Bycle -> Bisan -> BlackBisan
 *       ->Corelli
 */
interface TransportationFunctions {
    fun run()
}


open class Auto : TransportationFunctions {
    open val name: String = ""
    open val color: String = ""
    override fun run() {
        println("run boy run")
    }
}

open class Bycle {
    open val name: String = ""
    open val color: String = ""

}

open class MiniCooper(
    override val name: String = "Mini Cooper",
    override val color: String = "Red"
) : Auto() {
    override fun toString(): String {
        return super.toString()
    }

    init {
        super.run()
    }
}

open class John : MiniCooper() {
    init {
        super.run()
    }
}

class JohnCabrio : John() {
    init {
        super.run()
    }
}

class Beetle(
    override val name: String = "Beetle",
    override val color: String = "Yellow"
) : Auto() {
    override fun toString(): String {
        return super.toString()
    }

    init {
        super.run()
    }
}

open class Bisan(
    override val name: String = "Bisan",
    override val color: String = "Blue"
) : Bycle(), TransportationFunctions {
    override fun run() {
        println("run boy run")
    }

    override fun toString(): String {
        return "name $name , color$color"
    }
}

class BlackBisan() : Bisan()

class Corelli(
    override val name: String = "Corelli",
    override val color: String = "Gray"
) : Bycle() {

    override fun toString(): String {
        return "name $name , color$color"
    }

}

class TransportFactory< in T : Bycle>(transportationVehicle: T) {
    init {
        println(transportationVehicle.toString())
    }
}

fun main() {
    val miniCooper: MiniCooper = MiniCooper()
    val john: John = John()
    val johnCabrio: JohnCabrio = JohnCabrio()
    val beetle: Beetle = Beetle()

    val bycle: Bycle = Bycle()
    val bisan: Bisan = Bisan()
    val blackBisan: BlackBisan = BlackBisan()
    val corelli: Corelli = Corelli()


    //val miniCooperFactory:TransportFactory<MiniCooper> = TransportFactory<MiniCooper>(miniCooper)
   // val johnFactory: TransportFactory<John> = TransportFactory<John>(john)
   // val johnCabrioFactory: TransportFactory<JohnCabrio> = TransportFactory<JohnCabrio>(johnCabrio)
   // val beetleFactory: TransportFactory<Beetle> = TransportFactory<Beetle>(beetle)
   // val johnFactory2:TransportFactory<JohnCabrio> =TransportFactory<JohnCabrio>(johnCabrio)


    //val bisanFactory: TransportFactory<Bisan> = TransportFactory<Bisan>(bisan)
   // val bisanFactory2: TransportFactory<Bisan> = TransportFactory<Bisan>(blackBisan)
   // val bisanFactory3: TransportFactory<Bisan> = TransportFactory<BlackBisan>(bisan)
   // val bisanFactory4: TransportFactory<BlackBisan> = TransportFactory<BlackBisan>(blackBisan)
}

inline fun <reified T> calculate(numberOne:Int,numberTwo:Int):T{
    return when(T::class.java){
        String::class.java ->{
            (numberOne+numberTwo) as T
        }
        else -> {
            (numberOne+numberTwo) as T
        }
    }
}