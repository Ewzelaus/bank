abstract class Account(
    val owner: Individual,
    val bank: Bank,
    var balance: Double = 0.0
) {
    abstract fun deposit(amount: Double)
    abstract fun withdraw(amount: Double)
}