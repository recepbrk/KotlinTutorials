package `2 Basics`.loop

fun main() {
    /**
     * Değiken hiçbir şey yok .Diğer dillerde nasıl kullanıyorsak kotlin de de öyle kullanılır.
     * Eğer döngüye ihtiyacınız varsa ve budöngü sırasında if else ile bir sartlı durum varsa
     * bu durumda for+if else kullanmak yerine while kullanabiliriz.
     */

    var number = 0
    while (number < 5) {
        println("${number++}")
        // number++   ++ yı yukarda tanımlamak yerine bir alt satırda da tanımlanabilir.
    }
    /**
     * Aşşağıdaki kod ile yukarıdaki kod aynıdır ama while daha performanslıdır.yoksa while ile yaptığımız her şeyi for ile de yapabiliriz.
     * While forun if ile yazılmış halidir bu yüzden daha performanslıdır.
     */
    for (value in 0..5) {
        if (value < 5) {
            println("$value")
        }
    }
}