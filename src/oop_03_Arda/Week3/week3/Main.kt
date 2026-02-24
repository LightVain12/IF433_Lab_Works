package oop_03_Arda.Week3.week3

fun main() {
    val e = Employee("Budi")


    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()


    println("Pajak yang harus dibayar: ${e.tax}")
}