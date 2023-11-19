package `4 Classes`

/**
 * Access modifiers(erişim değiştiricileri) OPEN ve FİNAL dır.
 * Java da classlar default olarak open classtır.
 * Kotlin de ise final dır .Extends edebilmemeiz için classın önüne open keyword 'ü eklenmelidir.
 *Java da miras almak için extends keyword'ü kullanılır.Kotlinde ise : işareti kullanılır.
 */
/**
 * Polimorfizm -> Üst class da yapılan fonksiyon işleminin diğer alt classlarda override(değiştirip) edip anlamını ve görevini değiştirip yeni anlam yeni görev kazandırma işlemidir. .
 * Override üzerine yaz demektir.Eğer üsst class ın yaptığı işi yapıp üstüne de farklı işlemler yapmak istiyorsak child classta super keyword ü kullanılır. satır 49 daki gibi .
 * super kelimesi üst classın seçili yeri çalışır örenğin super.drawShape() üst classın drawShape fonk. çalışır.
 * this kelimesi ise bulunduğu class ı işaret eder .
 *
 * super type -> ya üst classtır ya da interfacedir.
 * fonksiyon overload -> aynı isimde ve türde olan farklı fonksiyonlara denir farklı olan ise parametreleridir. constructor da olabilr .
 * fun example(){
 *
 * }
 * fun example(name: String){
 *
 * }
 */

open class Shape(val name: String) {
    var mColor: String = ""
    var mEdgeCount: Int = 0

    constructor(name: String, color: String) : this(name) {
        mColor = color
    }

    constructor(name: String, color: String, edgeCount: Int) : this(name) {
        mColor = color
        mEdgeCount = edgeCount
    }

    open fun drawShape() {
        println("Name :$name")
        println("Color :$mColor")
        println("EdgeCount :$mEdgeCount")
    }

    fun calculateArea(): Int = if (mEdgeCount != 0) {
        mEdgeCount * mEdgeCount
    } else {
        0
    }
}

class Regtangle(name: String) : Shape(name) {
    fun main() {
        mColor
        mEdgeCount
        drawShape()
        calculateArea()
    }

    override fun drawShape() {
        super.drawShape()

        val rectangle = """
                ******************
                *                *
                *                *
                *                *
                ******************
            """.trimIndent()
        println(rectangle)
    }
}

class Circle(name: String, color: String) : Shape(name, color) {
    override fun drawShape() {
        super.drawShape()

        val circle = """
            * * *
           *      *
          *        *
           *       *
            *      *
             *    *
               *
           
        """.trimIndent()
        println(circle)
    }
}

final class Square(name: String, color: String, edgeCount: Int) : Shape(name, color, edgeCount) {

    override fun drawShape() {
        super.drawShape()

        val square = """
            **********
            *        *
            *        *
            *        *
            **********

        """.trimIndent()
        println(square)
    }
}
//class OneMeterSquare:Square("OneMeterSquare","Blue",4){
//override fun drawShape() {// burada kalıtım alınmamasının sebebi Square classının başında open kelimesi olmamasıdır.
//  super.drawShape()
//   }

// üst classtaki drawShape final olursa ,alt class'da bu fonksiyon override edilemez.0 dan yazılması gerekir.
fun drawShape() {

}


fun main() {
    val shape = Shape("Shape")
    val rectange = Regtangle("Regtangle")
    val circle = Circle("Circle", "megenta")
    val square = Square("Square", "Cyan", 4)
    shape.drawShape()
    rectange.drawShape()
    circle.drawShape()
    square.drawShape()

}