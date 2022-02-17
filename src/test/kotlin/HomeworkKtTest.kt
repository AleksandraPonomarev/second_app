import org.junit.Assert.*

class HomeworkKtTest {

@org.junit.Test
fun countComissionFirst() {
    val amount = 21000000
    val amountInMonth= 100000
    val cardType = VISA
    val result = countComission(cardType, amount = amount, amountInMonth = amountInMonth)
    assertEquals(result, "Максимальная сумма переводов 150000 руб за один раз илил 600000 руб в месяц")
    println("первый тест размера комиссии прошел успешно")
}
    @org.junit.Test
    fun countComissionSecond() {
        val amount = 21000000
        val amountInMonth= 100000
        val cardType = MIR
        val result = countComission(cardType, amount = amount, amountInMonth = amountInMonth)
        assertEquals(result, "Максимальная сумма переводов 150000 руб за один раз илил 600000 руб в месяц")
        println("второй тест размера комиссии прошел успешно")
    }
    @org.junit.Test
    fun countComissionThird() {
        val amount = 21000000
        val amountInMonth= 100000
        val cardType = MASTERCARD
        val result = countComission(cardType, amount = amount, amountInMonth = amountInMonth)
        assertEquals(result, "Максимальная сумма переводов 150000 руб за один раз илил 600000 руб в месяц")
        println("третий тест размера комиссии прошел успешно")
    }
    @org.junit.Test
    fun countComissionFourth() {
        val amount = 21000000
        val amountInMonth= 100000
        val cardType = MAESTRO
        val result = countComission(cardType, amount = amount, amountInMonth = amountInMonth)
        assertEquals(result, "Максимальная сумма переводов 150000 руб за один раз илил 600000 руб в месяц")
        println("четвертый тест размера комиссии прошел успешно")
    }
    @org.junit.Test
    fun countComissionFifth() {
        val amount = 21000000
        val amountInMonth= 100000
        val cardType = VKPAY
        val result = countComission(cardType, amount = amount, amountInMonth = amountInMonth)
        assertEquals(result, "Максимальная сумма переводов 15000 руб за один раз илил 40000 руб в месяц")
        println("пятый тест размера комиссии прошел успешно")
    }
    @org.junit.Test
    fun countComissionFifthOne() {
        val amount = 10000
        val amountInMonth= 100000
        val cardType = VKPAY
        val result = countComission(cardType, amount = amount, amountInMonth = amountInMonth)
        assertEquals(result, "Комиссия не взимается")
        println("пятый-один тест размера комиссии прошел успешно")
    }
    @org.junit.Test
    fun countComissionSixth() {
        val amount = 21000000
        val amountInMonth= 100000
        val cardType = "KADABRA"
        val result = countComission(cardType, amount = amount, amountInMonth = amountInMonth)
        assertEquals(result, "Начудили что-то")
        println("шестой тест размера комиссии прошел успешно")
    }
    @org.junit.Test
    fun countComissionSeventh() {
        val amount = 21000000
        val amountInMonth= 100000
        val result = countComission(amount = amount, amountInMonth = amountInMonth)
        assertEquals(result, "Максимальная сумма переводов 15000 руб за один раз илил 40000 руб в месяц")
        println("седьмой тест размера комиссии прошел успешно")
    }
    @org.junit.Test
      fun countComissionEight() {
          val amount = 21000000
          val amountInMonth= 100000
          val comissionStandart = 0.0085
          val comissionMin = 2500
          val result = countComission(amount = amount, comissionMin = comissionMin, comissionStandart=comissionStandart, amountInMonth = amountInMonth)
          assertEquals(result, "Максимальная сумма переводов 15000 руб за один раз илил 40000 руб в месяц")
          println("восьмой тест размера комиссии прошел успешно")
      }
/*     @org.junit.Test
      fun countComissionNine() {
          val amount = 21000000
          val amountInMonth= 100000
          val comissionStandart = 0.0085
          val comissionMin = 2500
          val cardType = "KADABRA"
          val result = countComission(cardType = cardType, amount = amount, comissionMin = comissionMin, comissionStandart=comissionStandart, amountInMonth = amountInMonth)
          assertEquals(result, "Начудили что-то")
          println("девятый тест размера комиссии прошел успешно")
      }
      */
      @org.junit.Test
      fun countComissionTen() {
          val amount = 2100000
          val amountInMonth= 100000
          val comissionStandart = 0.0085
          val comissionMin = 2500
          val cardType = VISA
          val result = countComission(cardType = cardType, amount = amount, comissionMin = comissionMin, comissionStandart=comissionStandart, amountInMonth = amountInMonth)
          assertEquals(result, "Размер комиссии в копейках 17850")
          println("десятый тест размера комиссии прошел успешно")
      }
 /*     @org.junit.Test
      fun countComissionEleven() {
          val amount = 21000000
          val amountInMonth= 100000
          val comissionStandart = 0.0085
          val comissionMin = 2500
          val cardType = MASTERCARD
          val result = countComission(cardType = cardType, amount = amount, comissionMin = comissionMin, comissionStandart=comissionStandart, amountInMonth = amountInMonth)
          assertEquals(result, "Максимальная сумма переводов 150000 руб за один раз илил 600000 руб в месяц")
          println("седьмой тест размера комиссии прошел успешно")
      }
  */

    @org.junit.Test
    fun comissionVisaFirst() {
        val amount = 21000000
        val amountInMonth= 100000
        val result = comissionVisa(amount = amount, amountInMonth = amountInMonth)
        assertEquals(result, "Максимальная сумма переводов 150000 руб за один раз илил 600000 руб в месяц")
        println("первый тест комиссии Visa прошел успешно")
    }
    @org.junit.Test
    fun comissionVisaSecond() {
        val amount = 21000000
        val amountInMonth= 100000000
        val result = comissionVisa(amount = amount, amountInMonth = amountInMonth)
        assertEquals(result, "Максимальная сумма переводов 150000 руб за один раз илил 600000 руб в месяц")
        println("второй тест комиссии Visa прошел успешно")
    }
    @org.junit.Test
    fun comissionVisaThird() {
        val amount = 2100
        val amountInMonth= 100000000
        val result = comissionVisa(amount = amount, amountInMonth = amountInMonth)
        assertEquals(result, "Максимальная сумма переводов 150000 руб за один раз илил 600000 руб в месяц")
        println("третий тест комиссии Visa прошел успешно")
    }
    @org.junit.Test
    fun comissionVisaFourth() {
        val amount = 210000
        val amountInMonth= 7610000
        val result = comissionVisa(amount = amount, amountInMonth = amountInMonth)
        assertEquals(result, "Размер комиссии в копейках 3500")
        println("четвертый тест комиссии Visa прошел успешно")
    }
    @org.junit.Test
    fun comissionVisaFifth() {
        val amount = 2100000
        val amountInMonth= 7610000
        val result = comissionVisa(amount = amount, amountInMonth = amountInMonth)
        assertEquals(result, "Размер комиссии в копейках 15750")
        println("пятый тест комиссии Visa прошел успешно")
    }
    @org.junit.Test
    fun comissionVisaSixth() {
        val amount = 2100000
        val amountInMonth= 7610000
        val comissionStandart = 1.0
        val comissionMin = 2500
        val result = comissionVisa(amount = amount, comissionStandart = comissionStandart, comissionMin = comissionMin, amountInMonth = amountInMonth)
        assertEquals(result, "Размер комиссии в копейках 2100000")
        println("шестой тест комиссии Visa прошел успешно")
    }
    @org.junit.Test
    fun comissionVisaSeventh() {
        val amount = 2100000
        val amountInMonth= 7610000
        val comissionStandart = 1.0
        val result = comissionVisa(amount = amount, comissionStandart = comissionStandart, amountInMonth = amountInMonth)
        assertEquals(result, "Размер комиссии в копейках 2100000")
        println("шестой тест комиссии Visa прошел успешно")
    }
    @org.junit.Test
    fun comissionVisaEight() {
        val amount = 2100000
        val amountInMonth= 7610000
        val comissionMin = 2500
        val result = comissionVisa(amount = amount, comissionMin = comissionMin, amountInMonth = amountInMonth)
        assertEquals(result, "Размер комиссии в копейках 15750")
        println("шестой тест комиссии Visa прошел успешно")
    }

    @org.junit.Test
    fun comissionMastercardFirst() {
        val amount = 21000000
        val amountInMonth= 100000
        val result = comissionMastercard(amount = amount, amountInMonth = amountInMonth)
        assertEquals(result, "Максимальная сумма переводов 150000 руб за один раз илил 600000 руб в месяц")
        println("первый тест комиссии Mastercard прошел успешно")
    }
    @org.junit.Test
    fun comissionMastercardSecond() {
        val amount = 21000
        val amountInMonth= 61000000
        val result = comissionMastercard(amount = amount, amountInMonth = amountInMonth)
        assertEquals(result, "Максимальная сумма переводов 150000 руб за один раз илил 600000 руб в месяц")
        println("второй тест комиссии Mastercard прошел успешно")
    }
    @org.junit.Test
    fun comissionMastercardThird() {
        val amount = 2100000
        val amountInMonth= 61000000
        val result = comissionMastercard(amount = amount, amountInMonth = amountInMonth)
        assertEquals(result, "Максимальная сумма переводов 150000 руб за один раз илил 600000 руб в месяц")
        println("третий тест комиссии Mastercard прошел успешно")
    }
    @org.junit.Test
    fun comissionMastercardFourth() {
        val amount = 21000
        val amountInMonth= 610000
        val result = comissionMastercard(amount = amount, amountInMonth = amountInMonth)
        assertEquals(result, "Размер комиссии в копейках 2126")
        println("четвертый тест комиссии Mastercard прошел успешно")
    }
    @org.junit.Test
    fun comissionMastercardFifth() {
        val amount = 21000
        val amountInMonth= 7610000
        val result = comissionMastercard(amount = amount, amountInMonth = amountInMonth)
        assertEquals(result, "Размер комиссии в копейках 2126")
        println("пятый тест комиссии Mastercard прошел успешно")
    }
    @org.junit.Test
    fun comissionMastercardSixth() {
        val amount = 210000
        val amountInMonth= 7610000
        val result = comissionMastercard(amount = amount, amountInMonth = amountInMonth)
        assertEquals(result, "Размер комиссии в копейках 3260")
        println("шестой тест комиссии Mastercard прошел успешно")
    }
    @org.junit.Test
    fun comissionMastercardSeventh() {
        val amount = 210000
        val amountInMonth= 610000
        val result = comissionMastercard(amount = amount, amountInMonth = amountInMonth)
        assertEquals(result, "Комиссия не взимается")
        println("седьмой тест комиссии Mastercard прошел успешно")
    }
    @org.junit.Test
    fun comissionMastercardEight() {
        val amount = 21000
        val amountInMonth= 610000
        val comissionFix = 1000
        val result = comissionMastercard(amount = amount, amountInMonth = amountInMonth, comissionFix = comissionFix)
        assertEquals(result, "Размер комиссии в копейках 1126")
        println("восьмой тест комиссии Mastercard прошел успешно")
    }
    @org.junit.Test
    fun comissionMastercardNine() {
        val amount = 21000
        val amountInMonth= 610000
        val comissionStandart = 0.07
        val result = comissionMastercard(amount = amount, amountInMonth = amountInMonth, comissionStandart = comissionStandart)
        assertEquals(result, "Размер комиссии в копейках 3470")
        println("девятый тест комиссии Mastercard прошел успешно")
    }

    @org.junit.Test
    fun comissionVkPayFirst() {
        val amount = 10000
        val amountInMonth= 100000
        val result = comissionVkPay(amount, amountInMonth)
        assertEquals(result, "Комиссия не взимается")
        println("первый тест комиссии vkpay прошел успешно")
    }
    @org.junit.Test
    fun comissionVkPaySecond() {
        val amount = 10000
        val amountInMonth= 100000000
        val result = comissionVkPay(amount, amountInMonth)
        assertEquals(result, "Максимальная сумма переводов 15000 руб за один раз илил 40000 руб в месяц")
        println("второй тест комиссии vkpay прошел успешно")
    }
    @org.junit.Test
    fun comissionVkPayThird() {
        val amount = 2000000
        val amountInMonth = 10000
        val result = comissionVkPay(amount, amountInMonth)
        assertEquals(result, "Максимальная сумма переводов 15000 руб за один раз илил 40000 руб в месяц")
        println("третий тест комиссии vkpay прошел успешно")
    }
    @org.junit.Test
    fun comissionVkPayFourth() {
        val amount = 2000000
        val amountInMonth = 4100000
        val result = comissionVkPay(amount, amountInMonth)
        assertEquals(result, "Максимальная сумма переводов 15000 руб за один раз илил 40000 руб в месяц")
        println("четвертый тест комиссии vkpay прошел успешно")
    }
}