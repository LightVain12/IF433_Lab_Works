package oop_05_Arda.Week5.week5

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}