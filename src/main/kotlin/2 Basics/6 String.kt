package `2 Basics`

fun main() {
    /**
     * Çift tırnak içerisine yazılan karakterler bütünüdür.
     * Bir string ifadenin tüm karakterlerini tek tek alıp Char  bir listeye atabilirsiniz.
     * Ya da ekrana bastırabilirsiniz.
     */

    val name = "Recep"
    val char1 = 'R'
    val char2 = 'e'
    val char3 = 'c'
    val char4 = 'e'
    val char5 = 'p'

    val nameArray = charArrayOf(char1, char2, char3, char4, char5)
    for (char in name) {
        println(char)
    }
    val awesomeKekod = "kekod"
    val firstCharOfSomeKekod = awesomeKekod[awesomeKekod.indices.first] //k
    val lastCharOfSomeKekod = awesomeKekod[awesomeKekod.indices.last]  // d

    /**
     * Farklı tipdeki bir değişkenin onune String bir değişken ya da ifade koyarak toplarsak sonuç string,
     * Ancak String bir değişken ya da ifadenin sonuna + operotörü ile farklı tipte bir değişken koyarsak çalışmaz.
     */

    val numbersValue: String = "value" + (2 + 2) // Çalışır sonuç tipi string olur
    // val numbersValue2:String=(2+2)+"value"   // Çalışmaz

    /**
     * String değer içerisinde değişken vermek için $ işareti kullanılır .Eğer String içerisinde değişkenin özelliğini kullanmak için ${}  işareti kullanılır.
     */
    println("numbersValue $numbersValue")  //değişken
    println("numbersValueLength ${numbersValue.length}") //değişken özelliği

    /**
     * 3 tane çift çırnak kullanarak raw string oluşturulabilir.
     * Row stringler ide ye nasıl yazılıyorsa öyle kullanılır.Hizalama bozulma olmaz.
     * trimIndent() fonksiyonu ile bu raw string in kenar boşluklarını silebilirsiniz.
     * trimMargin() adında başka özellikleride vardır.
     */
    val rawPineTree = """
        
          *
         ***
        *****
    """.trimIndent()

    println(rawPineTree)
}