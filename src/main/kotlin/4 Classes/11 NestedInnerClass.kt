package `4 Classes`


/**
 * Nested class'lar outer(dış) class'ın üye propertylerine yada fonksiyonlarına erişemezler.
 * Nested class'lar static olarak saklanırlar.Bundan dolayı da outer class üzerinden nested class a erişmek
 * istemeniz durumunda Outer.NestedClass() şeklinde erişebilrisiniz.
 *
 * static -> static olan bir değişkenin yada fonksiyonun yada class'ın bellekte sürekli yaşamasıdır ve ölmemesidir.
 *
 * Inner class'lar static olarak tutulmazlar.Bundan dolayı erişim yapmak istediğimizde
 * Outer().InnerClass() şeklinde outer class'ın da instance'ını oluşturmanız gerekmektedir.
 * Bundan dolayı inner class outer class'ın tüm elemanlarına erişebilir.private olsa dahi .
 *
 * Inner class'ın içerisinde yeni bir nested class eklenememektedir.Ancak yine inner class ekleyebilirsiniz.
 *
 * Nested class'ın içerisine ise bir nested ya da inner fark etmeksizin class ekleyebilrsiniz.
 *
 * Nested class arka planda static class olarak tutulur.Outer classın üye değişkenine veya üye fonksiyonuna erişemez.
 * Inner class ise arka planda normal bir class olarak tutulur.Outer classsın üye değişkenlerine (private olsa dahi) veya üye fonk. erişim sağlayabilir.
 *
 * Nested classı çağırırken outer class'ın nesnesini oluşturamayız(oluşturursak bizi memory leak e götürür.) Ama inner classı çağırırken outer classın nesnesini üretmek lazım.
 */
fun main() {
    val outer = Outer()
    outer.getAge()
    outer.surName
    //outer.name
    Outer.NestedClass().printName()


    val outer2 = Outer2()
    outer2.getAge()
    outer2.surName
    outer2.InnerClass().printName()

}

class Outer {
    private val name = "Recep"
    val surName = "Güzel"
    fun getAge(): Int = 21

    class NestedClass {
        fun printName() {
            // name  Erişim sağlanamıyor erişim sağlamak için print name içine outer:Outer ekleyip nesnesini oluşturup erişebiliriz ama bu bizi Memory Leak e götürür Kullanım yanlıştır.
            //  surName
            //  getAge()
        }
    }
}

interface OuterInterface {
    class A
    interface NestedInterface
}

class Outer2 {
    private val name = "Recep"
    val surName = "Güzel"
    fun getAge(): Int = 21
    inner class InnerClass {
        fun printName() {
            name  // Görüldüğü üzere inner class kullanımında outer classın özelliklerine erişim sağlayabiliyoruz.
            surName
            getAge()
        }

    }
}



