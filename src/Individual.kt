data class Individual(
    val fullName: String,
    val inn: String,
    val passportNumber: String,
    val passportSeries: String
) {
    private val currentAccounts = mutableListOf<CurrentAccount>()
    private val creditAccounts = mutableListOf<CreditAccount>()
    private val depositAccounts = mutableListOf<DepositAccount>()

    fun openCurrentAccount(bank: Bank) {
        val account = CurrentAccount(this, bank)
        currentAccounts.add(account)
        bank.addCurrentAccount(account)
    }


}