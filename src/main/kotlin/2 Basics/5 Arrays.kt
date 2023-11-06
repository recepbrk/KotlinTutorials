package `2 Basics`

fun main() {
    /**
     * Dizi tanımlarken kullanılır.
     * arrayOf(ayni tip değerler) şeklinde kullanılabilir.
     * arrayOf<Any>(farklı tip değerler) şeklinde tanımlanabilir.
     * arrayOfNulls<Type>(size) şeklinde ise verilen boyut kadar null değerler içeren dizi tanımlanabilir.
     */

    val studentNumbers = arrayOf(3, 5, 6, 7)
    val studentNames = arrayOf("Ali", "Veli", "Ahmet", "Hasan")
    val firstCharOfNames = arrayOf('A', 'V', 'A', 'H')
    val mixedArray = arrayOf<Any>(13, "Ahmet", 'V', true)
    val arrayOfNulls = arrayOfNulls<String>(4)

    /**
     * Array <Type>(size){higherorder function} şeklinde tanımlanabilir.
     * Bu durumda higher order function içerisinde son satıra denk gelen değerler diziyi oluşturur.
     * Higher order function, içerisindeki dizi boyutu kadar index'i ( it) bir artırarak çalışır.
     *
     */
    // 5 elemanlı ,tüm elemanları 3.14*indexDeğeri olan bir dizi oluşturur.
    val carNamesMini = Array<Double>(5) {
        3.14 * it

    }
    carNamesMini.forEach { println(it) }

    //10 elemanlı 0-9 arasındaki index değerlerinin karesini alan dizi oluşturma.

    val square = Array<Unit>(10) {
        println(it * it).toString()
    }

    /**
     * İsteğimiz türde ve istediğimiz kadar değerli bir dizi oluşturabiliriz ve bu değerleri kendimiz atayabiliriz.

     */
    val firstCharOfCountry = CharArray(4)
    firstCharOfCountry[0] = 'T'
    firstCharOfCountry.set(1, 'İ')     // İki türlü kullanımda aynıdır .
    firstCharOfCountry.set(2, 'K')
    firstCharOfCountry[3] = 'A'

    println(firstCharOfCountry.get(1)) // Veriye erişmek için get fonksiyonu kullanılır. İki türlü kullanımı vardır.
    println(firstCharOfCountry[0])

    /**
     * val ile tanımlanmış bir array in herhangi bir indexindeki değer değştirilebilir.
     * val indexdeki değerlerin değişmesine karışmaz.
     * Ancak ilgili diziyi başka bir dizi ile eşitlemenize izin verilmez.
     * Bunun için tanımlamayı var ile değiştirmek gerekir.
     */
    val awesomeArray = arrayOfNulls<String>(2)

    awesomeArray.set(0, "ALİ")
    awesomeArray[1] = "VELİ"

    //   awesomeArray="ahmet","mehmet" // buna izin verilmez çünkü array i değiştirmek istiyoruz bunun için val yerine var kullanmamız lazımdır.

}