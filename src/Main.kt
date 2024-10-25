fun main() {
    val bankSystem = BankSystem()


    val bank = Bank("Сбербанк", "Сбер", 1.5)
    bankSystem.addBank(bank)


    val individual = Individual("Иванов Иван Иванович", "1234567890", "1234", "567890")
    bankSystem.addIndividual(individual)


    val currentAccount = CurrentAccount(bank, 1000.0, "RU123456789")
    individual.currentAccounts.add(currentAccount)


    currentAccount.deposit(500.0)
    println("Баланс текущего счета: ${currentAccount.balance}")

    currentAccount.withdraw(200.0)
    println("Баланс текущего счета после снятия: ${currentAccount.balance}") //iujiudsacsdiucv


}