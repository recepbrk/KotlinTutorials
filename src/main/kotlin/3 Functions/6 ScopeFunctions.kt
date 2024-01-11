package `3 Functions`

import `4 Classes`.BankAccount
import java.math.BigDecimal

fun main() {
    var bankAccount: BankAccountA? = null
    bankAccount = BankAccountA(123.11.toBigDecimal(),"Recep")

    if (bankAccount != null && bankAccount.accountName != null){
        println(bankAccount.accountName)
    }

}

data class BankAccountA(
    val accountBalance: BigDecimal?,
    val accountName: String?
)