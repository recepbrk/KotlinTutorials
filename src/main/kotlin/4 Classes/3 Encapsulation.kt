package `4 Classes`

class Bus(brand: String, model: Int, color: String) {
    var brand = brand
        get // get i  private yapmamız saçma olur bunun yerine değişkeni private yaparız ama bu sefer sadece bulunduğu class tan erişim sağlanabilir.
        private set
    var model = model
        get
        private set
    var color = color
        get
        private set
}

/**
 * Encapsulation mantığı değerlere erişilebilsin okunabilsin ama değişiklik yapılamasın .
 * Bunun için encapsulation da get ve set kullanacağız.
 * get -> okumak
 * set -> değiştirmek
 */
fun main() {

    var bus = Bus("man", 2020, "white")
    println(bus.brand)
    println(bus.model)
    println(bus.color)
    //bus.color="yellow" hata verecektir veriye erişebiliyoruz ama değişiklik yapamıyoruz.
}