package `4 Classes`

/**
 * lateinit var veya by lazy uygulamanın ekranı başladıktan t zaman sonra yapılacak bir işlem varsa kullanılır.
 * değişkeni lateinit veye by lazy yapıp sonra uygulama başladığında çağırmak saçma olur.
 * lateinit var veya by lazy kullanıp uygulamanın ilk ayağa kalktığı yerde çağırırsak gereksiz birkullanım olur.Örneğin onCreate(),onViewCreated() gibi.
 *
 * Lateinit
 * Değerlerimizi tanımlarken initialize etmek istemeyebiliriz, bunun yerine bunları uygulamamızda daha sonra herhangi bir zamanda initialize etmek ve kullanmak isteyebiliriz.
 * Ancak değerimizi kullanmadan önce, değerimizin kullanılabilmesi için önce initialize olması gerektiğini unutmamalıyız.
 *
 *değerimize initialize etmeden erişmeye çalışırsak “UninitializedPropertyAccessException” hatası ile karşılaşırız.
 * Bu hatayı önlemek için Kotlin’in bize sağladığı isInitialized() yöntemini de kullanabiliriz.
 *
 * Kotlin’de lazy, bir sınıf içinde bir nesne oluşturmak istediğimizde, ancak bu nesne oluşturmanın pahalı olduğu ve bu pahalı nesneye bağımlı olan nesnenin oluşturulmasında gecikmeye yol açabileceği bir senaryoda kullanışlıdır.
 * Bu nedenle, nesnenin yalnızca ilk kez erişildiğinde başlatılacağını, aksi takdirde başlatılmayacağını anlamamız gerekir.
 */

private lateinit var myUser5: User5

fun main() {


    myUser5 = User5(name = "recep", surName = "güzel")

    println(myUser5.name)


}

private val myLazyUser: User5 by lazy {
    println("lazy initialization")
    User5(name = "recep", surName = "güzel")
}

data class User5(val name: String, val surName: String)



