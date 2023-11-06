package `3 Functions`

fun main() {

    // ctrl + d seçilen satırı kopyalar alta yazar.
    /**
     * fun keyword'u ile fonksiyonlar başlar.
     * fonksiyon ismi verilir.
     * parametre parantezleri açılır ve parametreler girilir.
     * : operatörü ile geri dönüş değeri yazılır.
     * fonksiyon body'si acılır ve kapatılır.
     * Geri dönüş tipi verilmeyen fonksiyonların dönüş tipi Unit 'tir.
     */

    //Fonksiyon çağırılırken ismi ve parametreleri kullanılır.
    //Eğer geri dönüşü varsa bir değişkene atabilir.
    val squareValue = takeSquare(10)
    println(squareValue)

    val userInfo = getUserInfo("recep", "güzel", "istanbul", "turkey", key = 5)


    /**
     * Bir class 'ın fonksiyonu çağrılırken nokta işareti kullanılır.
     */

    val value = Math.pow(2.0, 3.0) // pow üs alma işlemidir
    println(value)


}

/**
 * = ile fonksiyonlara default değer verilebilir .(Default Argument)
 * Default değer ataması yapmak fuction overload işlemi yapmamızı sağlar.
 * Tekrar tekrar aynı fonksiyonun farklı versiyonlarını yazmak durumunda kalmayız.
 */

/**
 * Default degeri olan parametrele sahip bir fonksiyon çağrılırken,default değeri olan parametrelere değer atamak şart değildir.
 * Default degeri olan bu parametreler opsiyonel parametrelerdir.
 * Defaultdegeri olan parametrelere değer atamadan fonksiyon çağrılacksa bu durumda parametre sırası değişir.
 * Ide 'ye hangi parametreye değer atadığınızı söylemek için Name Arguments'leri kullanmamız gerekir.
 */
fun reformatMessage(message: String, isUpperCase: Boolean = true, size: Int, lang: String = "tr") {}
val value2 =
    reformatMessage("recep", size = 3) // mavi olanlar name argumenttir  burada çıktı recep ,true,3 ,tr olacaktır.


/**
 * Çok uzun sayıda parametreniz olacaksa "varible number of arguments" vararg tanımlanabilir.
 * Bu sayede tek bir parametre alıyor gibi gözükürken kendisine çok miktardadeğişken atanabilir.
 * Bu değişkenlere array'e erişir gibi erişebiliriz.[index] yada .get(index) şeklinde
 */

/**
 * vararg tek yada son parametre olarak yazılırsa ,JVM ' e hazırlanırken ,Java'daki "String..." gibi aynı kod derlenir
 * Ancak vararg param birden fazla tanımlanırken ortada yada basta yer alıyorsa JVM'e hazırlanırken Array' e dönüşür.
 * Bu da performans farkı oluşturur demektir.
 */
//fun getUserInfo(name:String,surname:String,city:String,country:String,key:Int){} // vararg kullanmasak fonksiyonu böyle tanımlamamız gerekirdi .
fun getUserInfo(vararg userInfo: String, key: Int) {
    userInfo[3]
    userInfo.get(3)
}
/**
 * Aynı fonksiyon içerisinde birden fazla vararg tanımı yapılmasına izin verilmez.
 * Çalışmaz .
 */
// fun getUserInfo(vararg  userInfo :String,vararg userInfo2 :String){}

/**
 * Bir fonsiyona = konularak da return edeceği değer yazılabilir (Single Exression Kullanımmı )
 */
val userList = arrayOfNulls<String>(5)
fun getListCount(): Int = userList.size


fun takeSquare(number: Int): Int {
    return number * number


    /**
     * Fonksiyon ile metot farkı nedir ?
     * Fonksiyon, belirli bir görevi gerçekleştirmek için bir dizi talimat veya prosedürdür.
     * Metot ise bir nesneyle ilişkili bir dizi talimattır.
     * Bir fonksiyon herhangi bir nesneye ihtiyaç duymaz ve bağımsızdır, metot ise herhangi bir nesneyle bağlantılı bir işlevdir.
     */


}


