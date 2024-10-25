data class Bank(
    val fullName: String,
    val shortName: String,
    val interestRate: Double // Процент на текущий счет
) {
    private val accounts = mutableListOf<CurrentAccount>()
    private val creditAccounts = mutableListOf<CreditAccount>()
    private val depositAccounts = mutableListOf<DepositAccount>()

    fun addCurrentAccount(account: CurrentAccount) {
        accounts.add(account)
    }

    fun addCreditAccount(account: CreditAccount) {
        creditAccounts.add(account)
    }

    fun addDepositAccount(account: DepositAccount) {
        depositAccounts.add(account)
    }
}