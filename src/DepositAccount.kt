class DepositAccount(
    owner: Individual,
    bank: Bank,
    val termMonths: Int,
    val minBalance: Double,
    val isWithdrawable: Boolean,
    var currentBalance: Double = 0.0
) : Account(owner, bank) {
    override fun deposit(amount: Double) {
        currentBalance += amount
    }

    override fun withdraw(amount: Double) {
        if (isWithdrawable && currentBalance - amount >= minBalance) {
            currentBalance -= amount
        } else {
            throw IllegalArgumentException("Нельзя снять деньги с депозитного счета")
        }
    }
}