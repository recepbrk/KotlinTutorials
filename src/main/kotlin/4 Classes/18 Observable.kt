package `4 Classes`

import java.lang.IllegalArgumentException
import kotlin.properties.Delegates

/**
 * Observable Pattern -> Herhangi bir değişkenin değeri değişirken , bunu bir interface yada higher order ile dışarıya bildirmektir.
 *
 * Vetoable 'ın observable dan farkı  ,observable unit tipinde dönerken vetoable boolean tipinde dönüş bildirir.
 */

class User85 {
    var name: String by Delegates.observable("Initialized Value") { property, oldValue, newValue ->
        println("$oldValue -> $newValue")
    }
}

var max: Int by Delegates.vetoable(0) { property, oldValue, newValue ->

    if (newValue > oldValue) true else throw IllegalArgumentException("New value must be larger than old value")
    newValue > oldValue
}

var max2: Int by Delegates.observable(0) { property, oldValue, newValue ->
    true
}
fun main() {

    val user=User85()
    user.name="first"
    user.name="second"


    println(max)

    max = 10

    println(max)

    max=5
    println(max)

    println("max2 $max2")
    max2=10
    println("max2 $max2")

    max2 = 5
    println("max2 $max2")



}
class DenemeObservable(val notify:(Int,Int) -> Unit){
var balance:Int=0
    set(value){
        notify(field,value)
        field=value
    }
}