package `4 Classes`

/**
 * Sınırlı kümede ,gruplanabilir,class'lar yazmamızı sağlar.
 * Kısıtlanmış birclass hiyerarşisi kurabilmenizi sağlar.
 * Bu class'lar arka planda static olarak tutulmazlar.Enum lardan en büyük farkı budur.
 * Enum'lar verileri gruplarken ,sealed class'lar class'ları gruplar.
 *
 * Sealed class'lar abstract class'lardır aynı zamnada.Abstract oldukları için open alamazlar.
 * Sealed class'lar Abstract class oldukları için final olamazlar.Anlamsal olarak zaten saçmadır.
 *
 * Sealed class'larrın nesnesi oluşturulamaz.Constructor'ları protected ve private olarak bulunur.
 *
 * Sealed class'ları miras alan subClass'lar final oldukları için miras alınamazlar.SDK'ler için öenmlidir.
 *
 * Sealed class'ın subClass'larının neler olduğu compiletime'da bilinmektedir.Bundan dolayı when ve if yapılarında
 * else case'kerinin yazımına ihtiyaç duymazlar.
 *
 * Sealed class'ları extends alan subClass2lar eskiden aynı dosya üzerinde bulunma zorunluluğu vardı.
 * Bu zorunluluk esnetilerek aynı package içerisinde olamaya kadar genişletildi.
 * Ancak aynı package dışına çıkıp,bir sub class'a sealed class'ı miras olarak vermek isterseniz buna izin verilmeyecektir.
 * Özellikle sdk yazarken bu kısıtlama önemlidir.
 *
 * Sealed classs'lar içerisinde object tanımlamaları yapılabilir.
 * Sealed class'lar içerisinde sadece object tanımı yapıyorsanız,bu kullanımın enumaration'dan teknik olarak hiçbir farkı yoktur.
 *
 * SEALED VE ENUM CLASS FARKLARI
 * Sealed classın grupladığı şey classtır.Enum classlar ise sabitlerdir.
 * Sealed classların içindeki classlar farklılaşabilirler herhangi bir interface'i implement edebilirler ama enum classlardaki sabitler herhangi bir interface'implement edemezler.
 */


/**
 * Sealed class kullanım örneği
 */
sealed class Response<T> {
    data class Success<T>(val data: T) : Response<T>()
    data object Loading : Response<Nothing>()

    sealed class Error : Response<Nothing>() {
        data object NetworkError : Error()
        data object WritingError : Error()
    }
}