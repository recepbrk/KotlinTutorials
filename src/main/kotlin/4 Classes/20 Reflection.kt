package `4 Classes`

import java.lang.reflect.Field

/**
 * Reflection mantığı Kotlinde class içindeki değişkenlere erişmek için kulanılan bir yapıdır.
 * Reflection kullanarak bu değerlere erişim sağlayabiliriz.Aşşağıda örneği mevcuttur .
 */
class WallPaper{
    private var imageUrl="www.recepguzel.com"
    private var id=11
    private var type=3
    private var width=1920
    private var height=1080
}

fun main() {
    val wallPaper=WallPaper()
   // wallPaper.imageUrl="www.recepguzel.com"  Erişim sağlanamıyor ! ama reflection ile sağlanabilir.

    val imageUrlField:Field=wallPaper.javaClass.getDeclaredField("imageUrl")
    imageUrlField.isAccessible=true

    val imageUrlString=imageUrlField.get(wallPaper)
    println(imageUrlString)
}