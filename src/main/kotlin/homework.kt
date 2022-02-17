/**
 * Домашнее задание 3. Задача 2
 */
const val VKPAY = "Vk Pay"
const val VISA = "Visa"
const val MASTERCARD = "Mastercard"
const val MAESTRO = "Maestro"
const val MIR = "Mir"

fun main(){
    val amount = 2100000 //в копейках!!!
    val amountInMonth = 7610000 //в копейках
    val cardType = VISA
    val result = countComission(cardType = cardType, amountInMonth = amountInMonth, amount=amount)
    println("$result")
}

fun countComission(cardType: String = VKPAY, amountInMonth: Int, amount: Int, comissionStandart: Double=0.75, comissionMin: Int=3500, comissionFix: Int = 2000): String {
    return when (cardType) {
        VKPAY -> comissionVkPay(amount = amount, amountInMonth= amountInMonth)
        MIR, VISA -> comissionVisa(amount = amount, amountInMonth= amountInMonth, comissionStandart = comissionStandart, comissionMin = comissionMin)
        MASTERCARD, MAESTRO -> comissionMastercard(amount=amount, amountInMonth = amountInMonth, comissionStandart = comissionStandart, comissionFix = comissionFix)
        else ->"Начудили что-то"
    }
}
fun comissionVisa(amount: Int, comissionStandart: Double = 0.0075, comissionMin: Int = 3500, amountInMonth: Int): String{
    return if(amount in 0..15000000 && amountInMonth in 0..60000000){
        val comissionReal = amount* comissionStandart
        val comission  = if(comissionReal <= comissionMin) {
            comissionMin
        }
        else (
                comissionReal
                ).toInt()
        "Размер комиссии в копейках $comission"
    } else {"Максимальная сумма переводов 150000 руб за один раз илил 600000 руб в месяц"}
}
fun comissionMastercard(amount: Int, comissionStandart: Double = 0.006, comissionFix: Int = 2000, amountInMonth: Int): String{
    return if(amount in 0..15000000 && amountInMonth in 0..60000000) {
        if(amount in 0..30000 || amountInMonth > 7500000) {
            val comission: Int = (amount * comissionStandart + comissionFix).toInt()
            "Размер комиссии в копейках $comission"
        }else {"Комиссия не взимается"}
    } else {"Максимальная сумма переводов 150000 руб за один раз илил 600000 руб в месяц"}
}
fun comissionVkPay(amount: Int, amountInMonth: Int): String {
    return if (amount in 0..1500000 && amountInMonth <= 4000000) {
        "Комиссия не взимается"
    } else {
        "Максимальная сумма переводов 15000 руб за один раз илил 40000 руб в месяц"
    }
}