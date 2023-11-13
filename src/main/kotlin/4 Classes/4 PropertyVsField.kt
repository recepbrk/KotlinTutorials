package `4 Classes`
class BankAccount{
    var balance=1_000_000
}
fun main() {
    val bankAccount =BankAccount()
    println(bankAccount.balance)
    bankAccount.balance=500_000
    println(bankAccount.balance)

}