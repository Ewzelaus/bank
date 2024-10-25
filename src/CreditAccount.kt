class CreditAccount(
    owner: Individual,
    bank: Bank,
    val loanAmount: Double,
    val interestRate: Double,
    val months: Int
) : Account(owner, bank) {
    private var remainingDebt = loanAmount

    override fun deposit(amount: Double) {
        // Логика погашения кредита
    }

    override fun withdraw(amount: Double) {
        throw UnsupportedOperationException("Нельзя снимать деньги с кредитного счета")
    }
}