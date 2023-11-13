package `4 Classes`

class Car(whellCount: Int, color: String = "red") {

    private val mWheelCount: Int
    private val mColor = color

    init {  // secondary constructorların süslü parantez bloğu var istediğimiz kodu yazabiliyoruz ama primary constructor süslü parantez
        //bloğu yok bu işte init bloğu oluyor. init bloğu primary constructor 'ın süslü parantez bloğudur.
        mWheelCount = whellCount
        "primary const.created ".printLog()
        "WheelCount :$mWheelCount,Color:$mColor".printLog()
    }


    constructor(whellCount: Int, color: String = "Red", name: String) : this(4) {
        "1.secondary cons.. created".printLog()
    }

    constructor(wheelCount: Int, color: String = "Red", name: String? = null, madeOf: String? = null) : this(4) {
        "2.secondary const. created".printLog()
    }
    /**
     * Her zaman ilk önce init bloğuna girmesinin sebebi 2.constructorda olsa this ile  işaretlediği için init bloğuna girer.
     * İlk önce init bloğu çalışır sonra secondry ler çalışır varsa .
     */

}

fun main() {

    val car0 = Car(4)
    val car1 = Car(5, "blue")
    val car2 = Car(4, "blue", name = "mini cooper")
    val car3 = Car(4, "blue", "mini cooper", "metal")


}

fun String.printLog() {
    println(this)
}