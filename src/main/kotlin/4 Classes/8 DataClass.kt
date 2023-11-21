package `4 Classes`

import javax.print.attribute.standard.Media


/**
 * Data class'lar en azından bir parametre almak zorundadır.
 * Parametreler mutlaka val ya da var ile tanımlanmak zorundadır.
 * Open,abstract,sealed,inner class yapılmaz.
 * Tüm data class'ları final olduğu için final modifier'i reduldant uyarısı verir.
 * Miras alınamazlar ama child class olabilirler.
 *
 * equals,hashCode.toString,copy,companentN fonksiyonları arka planda default olarak oluşturulur. normal classta oluşturulmaz.
 * Yukarıdaki fonksiyonlardan biri override edilirse,oto generate edilen hali yazılmaz.
 * Yukarıdaki fonksiyonlar sadece primary const. içerisindeki değişkenlerde çalışır.
 * companentN fonksiyonları sebebiyle destructturing declaration olarak data class'lar set edilebiliyor.
 * toString gibi fonksiyonlarda primaryconst. değişkenleri kullandığı için val ya da var yazılmak zorundadır.
 * Pair,Triple özelleştirilmiş generic data class'lar mevcut.
 */

data class News(
    val title: String = "Title",
    val desription: String,
    val hasMediaContent: Boolean,
    val mediaList: List<`4 Classes`.Media>
) {
    val relatedNewsList: List<News> = arrayListOf()

    override fun toString(): String {
        return "return super.toString()"
    }

    fun log() {
        println("Title:$title,Description:$desription")
    }
}

class NewsData(
    val title: String = "Title",
    val desription: String,
    val hasMediaContent: Boolean,
    val mediaList: List<`4 Classes`.Media>
) {
    val relatedNewsList: List<News> = arrayListOf()

    override fun toString(): String {
        return "News(title =" + this.title + "description =" + this.desription + "hasMediaContent =" + this.hasMediaContent + "mediaList = " + this.mediaList
    }

    fun copy(): NewsData {
        return NewsData(title, desription, hasMediaContent, mediaList)
    }
}

class Media


fun main() {
    val newsOne = News(
        title = "Yeni bir eğitim dönemi başladı .",
        desription = "Eğititm dönemi yeni bir şekilde başladı.",
        hasMediaContent = true,
        mediaList = arrayListOf()
    )

    val newsTwo = NewsData(
        title = "Yeni bir eğitim dönemi başladı .",
        desription = "Eğititm dönemi yeni bir şekilde başladı.",
        hasMediaContent = true,
        mediaList = arrayListOf()
    )

    // destructturing declaration
 //      companent1  component2   component3        component4
    val (title,      description, hashMediaContent, medialist) = newsOne

    newsOne.mediaList // normal çağırım
    medialist         //  destructturing declaration  çağırımı
    println(newsOne.title)
}