package `4 Classes`

import java.util.*

/**
 * Tip güvenliği(type-safety) sağlar.
 * Kullanım amacı aynı veri kümelerinin gruplanabilir olmasını sağlar.
 * Opsiyonların tamamının neler olduğunu rahatça görebilmemizi sağlar.
 *
 * abstract,open,inner ,sealed olamazlar.
 * Yapısı gereği zaten final'dırlar.Final keyword'ü kullanmak redundant uyarısı verir.
 *
 * Özünde class olduklar için ,constructor kullanabilirler ve bu constructor içerisinde veri tutabilirler.
 * Java karşılığında bu enum sabitleri static final class'lar seklinde tutulurlar.
 * Bu sayede ,kullanırken bu sabitlerin nesnesini oluşturmak zorunda kalmayız.
 *
 * Enum classların nesnesi oluşturulamaz .
 *
 * Her enum sabiti final name:String  ve final ordinal:Int şeklinde default değişkenlere sahiptirler.
 * name ifadesi ,enum'ın kendisinin string halini verir.
 * ordinal ifadesi ,enum'daki sabitin index'ini verir ve 'dan başlar.
 * bu değişkenler final oldukları için ,enmsabitleri içerisinde override edilemezler.
 *
 * Enum class'lar herhangi bir başka sınıfı miras alamazlar.
 * Enum class'lar herhangi bir interface'i implement edebilirler.
 *
 * Enum class'lar abstract property'ler ya da abstract fonksiyonlar alabilirler.
 * Bunları aldıklarında tüm sabitler bu abstract yapıları override etmek zorundadır.
 *
 * Bir open fonksiyon da yazılabilirler.Open almasından dolayı override etme zorunluluğu yoktur.
 * Ancak open olarak belirlenen fonksiyonlar'ın body 'si olmak zorundadır.
 *
 * Enum sabitleri arka tarafta class olarak tutulurlar.
 *
 * HER CLASS ANY CLASSINI MİRAS ALIR .SINIFLARIN EN ÜSTÜDÜR. İÇERİSİNDE TOSTRİNG,HASHCODE,EQUALS GİBİ FONKSİYONLAR VARDIR.
 * ENUM CLASSLARDA SADECE TOSTRİNG OVERRİDE ETMEYE İZİN VERİR.
 */

interface TeamsFunctionality {
    fun practice()
}

enum class TeamsType(val starCount: Int) {
    FENERBAHÇE(3),
    GALATASARAY(4),
    BAŞİKTAŞ(3),
    TRABZONSPOR(2)
}

enum class Teams(val starCount: Int) : TeamsFunctionality {
    FENERBAHÇE(3) {
        override fun practice() {
            TODO("Not yet implemented")
        }


    },
    GALATASARAY(4) {
        override fun practice() {
            TODO("Not yet implemented")
        }

    },
    BEŞİKTAŞ(3) {
        override fun practice() {
            TODO("Not yet implemented")
        }

    },
    TRABZONSPOR(2) {
        override fun practice() {
            TODO("Not yet implemented")
        }

    };

    enum class DaysOfWeek(val dayNumber: Int) {
        PAZARTESİ(1) {
            override fun toString(): String {
                return "PAZARTESİ"
            }
        },
        SALI(2) {
            override fun toString(): String {
                return "SALI"
            }
        },
        ÇARŞAMBA(3) {
            override fun toString(): String {
                return "ÇARŞAMBA"
            }
        },
        PERŞEMBE(4) {
            override fun toString(): String {
                return PERŞEMBE.name // name ve ordinal default olarak gelir.
            }
        },
        CUMA(5) {
            override fun toString(): String {
                return "CUMA"
            }
        },
        CUMARTESİ(6) {
            override fun toString(): String {
                return "CUMARTESİ"
            }
        },
        PAZAR(7) {
            override fun toString(): String {
                return "PAZAR"
            }
        };
    }

    enum class Sex {
        Male {
            override val typeCount: Int
                get() = TODO("Not yet implemented")

            override fun isOptional() {
                TODO("Not yet implemented")
            }

            override fun log() {
                super.log()
                println("child log started.")
            }

        },
        Female {
            override val typeCount: Int
                get() = TODO("Not yet implemented")

            override fun isOptional() {
                TODO("Not yet implemented")
            }

        };

        abstract val typeCount: Int
        abstract fun isOptional()
        open fun log() {
            println("main log started")
        }
    }


}

fun main() {
    val fb = "FENERBAHÇE"
    val gs = "GALATASARAY"
    val bjk = "BEŞİKTAŞ"
    val ts = "TRABZONSPOR"

    println("4 büyük takımdan birini yazınız.")
    val team: String = readLine()!!

    val starCount = when {
        team == fb -> {
            3
        }

        team == gs -> {
            4
        }

        team == bjk -> {
            3
        }

        team == ts -> {
            2
        }

        else -> {
            -1
        }
    }

    val starCount2 = when (team) {
        Teams.FENERBAHÇE.name.uppercase(Locale.getDefault()) -> { //182.satır ile aynı işlemi yapar.
            Teams.FENERBAHÇE.starCount

        }

        Teams.FENERBAHÇE.toString() -> {
            Teams.FENERBAHÇE.starCount
        }

        Teams.GALATASARAY.toString() -> {
            Teams.GALATASARAY.starCount
        }

        Teams.BEŞİKTAŞ.toString() -> {
            Teams.BEŞİKTAŞ.starCount
        }

        Teams.TRABZONSPOR.toString() -> {
            Teams.TRABZONSPOR.starCount
        }

        else -> {
            -1
        }
    }
}

