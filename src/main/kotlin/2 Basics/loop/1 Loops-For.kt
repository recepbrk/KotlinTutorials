package `2 Basics`.loop

fun main() {
    /**
     * 3 farklı şekilde for tanımlayabilirsiniz.
     * value in list             şeklinde value değerini alabilirsiniz.
     * index in list.indices     şeklinde index değerini alabilirsiniz.
     * (index,value) in list.withIndex() şeklinde index ,value değerini alabilirsiniz.
     */
    for (value: Int in 1..10) {
        print("$value")
    }
    println()
    val countryCode = arrayOf("tr", "az", "ru", "fr")

    for (value: String in countryCode) {
        println("$value")
    }
    // Burada value değerini kendimiz ekliyoruz satır 21 deki gibi bunun kolay yolu  27 satırda var.
    for (index in countryCode.indices) {  // indices bize IntRange döner . yukardaki örnek için 0..3
        println("\n$index : değeri ${countryCode[index]}") // burada get ile de çağırabiliriz.  ->  println("\n$index : değeri ${countryCode.get(index)}")
    }

    /**
     * dönecek değer için hem index hemde value değerine ihtiyacımız varsa withIndex() kullanılır.
     */
    for ((index, value) in countryCode.withIndex()) { // bu kullanımın ismi  Destructuring declarations dur.

        println("\n$index : değeri $value")
    }
    /**
     * repeat(size) şeklinde herhangi bir listeye ihtiyaç duymadan tekrarlanan işler yaptırabilirsiniz.
     */

    repeat(10) {
        print("\n$it : Daha çok Kotlin çalışmam lazım :)")
    }

    /**
     * return kullanarak ilgili şart sağlanırsa ,döngüden çıkabilirsiniz.
     * continue kullanarak ilgili şart sağlanırsa ,döngüye o değeri atlayarak devam edebilirsiniz.
     */
    for (value in 1..50) {
        if (value % 2 == 1) {
            continue
        }
        println(value)
    }

    for (value in 1..10) {
        if (value % 2 == 1) {
            break
        }
        println(value)
    }
    /**
     * İç içe fo döngüleri kullanıyorsak bir üstteki for a değil de iki üsteki veya üç üsteki forun dönmesini engellemek için labeling kullanılır.
     * Bunun için labelname@ ilgili forun önüne yazıp , return yada continue bulunduğu yere de @labelname şeklinde yazılmalıdır.
     */
    for (value in 1..50) {
        for (value2 in 0..10) {
            if (value2 == 5) {
                continue
            }
            println("continue1 : $value2")
        }
    }
    println("-----------------------------")

    returnLabel@ for (value in 1..50) { // burada 0,1,2,3,4 değerleri gösterir ama döngünün bir elemanı kırılır yani 2. değere geçer yine 0,1,2,3,4 değeri gösterilir bu 50. değere kadar devam eder.
        for (value2 in 0..10) {
            if (value2 == 5) {
                continue@returnLabel
            }
            println("contiune2 : $value2")
        }
    }

    returnLabel@ for (value in 1..50) {  // Burada 0,1,2,3,4 değerlerini gösterir ve döngü kırılır.
        for (value2 in 0..10) {
            if (value2 == 5) {
                break@returnLabel
            }
            println("contiune2 : $value2")
            //Dipnot :  ctrl+shift+f -> projede arama yapmamızı sağlar .
        }
    }
}