package `4 Classes`

/**
 * Interface'lerin Abstract classlardan en büyük farkı STATE tutamıyor olmasıdır.
 * State tutmak için değerini değiştirmemiz gerekir.
 * Diğer fark ise İnteface fonksiyonları herhangi bir yapıya ihtiyaç duymuyorken ,
 * Abstract classların içindeki open fonksiyonları abstract class içerisindeki bir değşkene veya değere ihtiyaç duyar.
 *
 *
 * Interface içerisindeki initial değeri olmayan bir property ya da body'si olmayan bir fonksiyon
 * abstract olarak da tanımlanabilir.
 *
 * İnterfaceleri anlamı gereği final yapamazsınız.Open yazılması da gereksizdir.(redundant)
 *
 * Classlar miras alınır interfaceler ise implement edilir.
 *
 * Gerçek hayata uyumlayacak olursak abstract class doğustan gelen özellikler ise interfaceler sonradan kazanılmış becerilerdir.
 *
 * Abstract classın içindeki open fonksiyonu ile interface arasındaki fark eğer abstract değişkenlerinden değer kullanıyorsak
 * open fonksiyon kullanırız. Ama bir değişken veya değer kullanmayıp ek bir özellik ekleyeceksek interface kullanırız.
 * Örnek abstract class ın ilk satırı
 *
 *
 *
 * Abstract classlar bir kere extends edilebilir ama birden fazla interface o class 'a implement edilebilir.
 * MultiImplementation -> +
 * MultiInheritance -> -
 *
 * Abstract classlar ve Interfacelerde body'si olmayan fonksiyonlar override edilmek zorundadır.
 */


interface MyInterface {

    val prop: Int

    //Örnekte görüldüğü gibi değişkene değer atayıp değiştirebiliyoruz .Hani interfaceler state tutmazdı ?
    //Aslında biz bir değişken oluşturmadık bir property oluşturduk .Bir fonksiyon oluşturduk .
    val propertyWithImplemantation: String
        get() = "foo"


    // Görüldüğü gibi yukarda tanımlanan yapının aynısı yukardaki yapı bir property dir aslında değişken değil .
    fun propertyWithImplementation(): String {
        return "foo"
    }

    //Görüldüğü gibi değişken tanımlayıp değer atamamıza izin vermiyor. İnterfaceler state tutamaz.
    //val propertyWithImplemantation:String = "foo"

    /**
     * Interface'lerde tanımlanan property'lerde initial deger alma zorunluluğu yoktur.
     */
    interface Named {
        val fullName: String?
    }

    interface Person : Named {
        val firstName: String
        val lastName: String

        override val fullName: String?
            get() = "$firstName+$lastName"
    }

    /**
     * Eğer implement edilen interface ,başka bir interface'i implement ediyorsa
     * ve buinterface'in üyeleri child interface'de override edilmiş ise ,
     * Child interface'i implement eden class'da bu property'nin override edilme zorunluluğu yoktur.
     *
     *
     * Eğer bir abstract class bir interface i implement ediyorsa , o interface'sin override edilmesi
     * zorunlu fonksiyonlarını override etmeyebilir.Abstract class'lar için bu opsiyoneldir.
     */

    // abstract class Employee:Person{}


    class Employee : Person {
        override val firstName: String
            get() = TODO("Not yet implemented")
        override val lastName: String
            get() = TODO("Not yet implemented")

        override val fullName: String?
            get() = super.fullName

        // Person sınıfında fullName override edildiği için Employee sınıfında override edilmedi.

    }

    /**
     * Bir interface içerisindeki fonksiyonlardan body 'si olanlar override edilmek zorunda degildir.
     * Body'si olmayan tüm fonksiyonlar ise class'a implement edildiğinde override edilmek zorundadır.
     *
     * Property'ler de interfacelerde tanımlanabilirler.
     *
     * Property'lerden de değer ataması yapılmamış olanlar zorunlu olarak override edilirler,
     * eger property initial değeri aldıysa(initial değeri alamaz sadece get fonksiyonuna geri dönüş değeri veririz),override etme zorunluluğu kalkar.
     *
     * Interface içerisinde tanımlı ve override edilme zorunluluğu olan olan propertyler
     * primary constructor içerisinde de override edilebilir.
     *
     * Body'si olan (override edilme zorunluluğu olmayan) bir interface fonksiyonu override edilirse,
     * override edildiği yerde bod'si içerisinden super'i çağırabilir.(çağırmak zorunda değilsiniz.)
     */


    /**
     * Birden fazla interface bir class'a tanımlanabilir.
     *
     * Birden fazla interfaceclass a tanımlarken aralarına virgül koyulur.
     *
     *  : işaretinden sonra eklenen yapıların hangilerinin class(inheritance)
     *  hangileririnin interface (implementation) olduğunu karıştırmamak için
     *  bu yapıların sonuna bakmamız gerekir.Sonunda () parantezleri görüyorsanız :'dan sonra
     *  gelen yapı class'tır(inheritance) miras alma işlemi yapılıyordur. () yoksa interfacedir(implementation)
     *  işelmi yapılıyordur.
     */


    /**
     * 2 farklı interface'in aynı fonksiyonları olması durumunda ,bu fonksiyonların override edilmesi sırasında aynı fonksiyonu 2 kere override edemeyiz.
     *
     * Eğer implement ettiğimiz interfacelerin aynı isimde fonksiyonları bulunuyorsa ,tek bir fonksiyon
     * override işlemi yapılır.Bunun içerisinden hangisinin body'sine erişmek istiyorsak
     * o interface'nin ismini <> işaretleri arasına yazmak gerekir.
     *
     * Eğer implement edilen 2 interface de aynı fonksiyonlar varsa bu duruma body leri olsa da override edilme zorundadır .
     *
     *  Bu açıklma bloğunun örneği aşşağıdadır.
     */


    /**
     * ************************İNTERFACE ÖRNEK**************************
     */

    interface A {
        fun f() = 1
        fun g() = "A.g"
        val n: Double
            get() = 1.1
    }

    interface B {
        fun f() = 2
        fun g() = "B.g"
        val n: Double
            get() = 2.1
    }

    class C : A, B {
        override fun f() = 0
        override fun g(): String {
            return super<A>.g()
        }

        override val n: Double
            get() = super<A>.n + super<B>.n

    }

    fun main() {
        val c = C()
        c.f()  // 0
        c.g()  //"A.g"
        c.n    //3.3
    }
}