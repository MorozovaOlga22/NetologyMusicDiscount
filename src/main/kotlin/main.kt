/**
 * Программа для расчета скидки на покупку.
 * Деньги указаны в копейках
 */
fun main() {
    val standardDiscountAmount = 100_100
    val standardDiscount = 10_000

    val bigDiscountAmount = 1_000_100
    val bigDiscountAmountMultiplier = 0.95

    val regularCustomerDiscountMultiplier = 0.99

    val isRegularCustomer = false
    val previousPurchaseAmount = 10_000_000
    val currentPurchaseAmount = 500_000

    val amountWitDiscountForPurchase = if (previousPurchaseAmount >= bigDiscountAmount) {
        (currentPurchaseAmount * bigDiscountAmountMultiplier).toInt()
    } else if (previousPurchaseAmount >= standardDiscountAmount) {
        //Если текущая покупка меньше 100 руб., доплачиваем любимому покупателю, чтоб уж точно мотивировать!
        currentPurchaseAmount - standardDiscount
    } else {
        currentPurchaseAmount
    }

    val resultAmount: Int =
        if (isRegularCustomer) (amountWitDiscountForPurchase * regularCustomerDiscountMultiplier).toInt() else amountWitDiscountForPurchase

    val rubles = resultAmount / 100
    val penny = resultAmount % 100
    println("Сумма покупки составляет $rubles руб. $penny коп.")
}