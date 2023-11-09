package `3 Functions`

fun main() {
    /**
     * Fonksiyonlar Kotlinde "first class sitizen'dır.Yani değişkenlere değer olarak atanabilir,başka fonksiyonlara
     * parametre olarak verilebilir ya da bir fonksiyonun geri dönüş değeri olabilir demektir.
     *
     * Higher Order Function'lar basitçe bir fonksiyona parametre olarak verilen fonksiyonlardır.Parametre olarak
     * verimekten kasıt ,fonksiyonun çağırımının parametre kısmında yapılması değil , fonksiyonun gövdesinin (body)
     * yani süslü parantezler arasında kalan görev alanının baska bir fonksiyona parametre olarak verilmesidir.
     *
     * Yapısal olarak ;
     *
     * fun foo(higherOrderFunction:(message :String) ->Unit{
     * higherOrderFunction("Codemy")
     * }
     *
     * Çağrılırken ;
     *
     * fun main(){
     *
     * foo({message ->
     * println("Message: $message")
     * })
     * }
     */


    /**
     * Higer Order Functions tanımlamanın 3 yolu vardır.
     */
    //Bir değişkene atayarak Higher Order Function tanımlayabiliriz.
    // Bu durumda süslü parantezler yanına higher order function'ın aldığı parametreler lambda okundan önce aralarına virgül
    //koyularak yazılır.Higher Order Function tek parametre alıyorsa , bu parametreleri yazmak zorunda değilsiniz.
    //Bu durumda higher order function size "it" kelimesi ile higher order function'in parametresi tipinde bir değişken verecek

    val higherOrderFunction = { surName: String ->
        println("surname : $surName")
    }

    // İsmi olmayan "anonymous function" tanımlamaları da Higher Order Function olarak , normal bir fonksiyon parametre olarak verilebilir.

    val anonymousFunction = fun(surName: String): String {
        return "surname : $surName"
    }
    // Anonymous Function'in expression kullanımını da yine Higher OrderFunction olarak normal bir fonksiyon olarak verilir.

    val anonymousFunction2 = fun(surName: String): String = "surname:$surName"

    // Higher Order Function'la aynı parametre sayısına sahip ve bu parametrelerin hepsinin tipleri Higher Order Function'in
    //parametre tipleri ile aynı ise ,bu normal fonksiyon da Higher OrderFunction olarak normal bir fonksiyona parametre
    //olarak verilebilir.Bunu yapmak için sadece :: işareti koymak gerekir.

    fun logPrint(message: String): String {
        return "message:$message"
    }

    fun foo(higherOrderFunction: (message: String) -> String) {
        println(higherOrderFunction("codemy"))

    }
    foo(::logPrint)


}