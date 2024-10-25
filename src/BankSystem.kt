class BankSystem {
    private val banks = mutableListOf<Bank>()
    private val individuals = mutableListOf<Individual>()

    fun addBank(bank: Bank) {
        banks.add(bank)
    }

    fun addIndividual(individual: Individual) {
        individuals.add(individual)
    }

    fun findIndividualByName(name: String): Individual? {
        return individuals.find { it.fullName == name }
    }
}
