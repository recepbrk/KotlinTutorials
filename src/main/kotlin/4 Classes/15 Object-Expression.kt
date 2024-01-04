package `4 Classes`

interface Print2 {
    fun onPrint()
}

open class User(val age: Int) {
    open fun getUserFullName() {}
}

val fullName: User = object : Print2, User(23) {
    val firstName = "recep"
    val surName = "güzel"
    override fun onPrint() {
        println("Full Name = $firstName $surName")
    }


}

fun main() {
    fullName.getUserFullName()
}