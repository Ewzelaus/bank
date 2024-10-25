class CurrentAccount(owner: Individual, bank: Bank) : Account(owner, bank) {
    override fun deposit(amount: Double) {
        balance += amount
    }

    override fun withdraw(amount: Double) {
        if (amount <= balance) {
            balance -= amount
        } else {
            throw IllegalArgumentException("Недостаточно средств")
        }
    }

}
