data class Loan(
    val amount: Double,
    val interestRate: Double,
    val termMonths: Int,
    val startDate: String // Формат даты
) {
    fun calculateMonthlyPayment(): Double {
        // Логика расчета ежемесячного платежа
        return 0.0 // Вернуть рассчитанную сумму
    }
}