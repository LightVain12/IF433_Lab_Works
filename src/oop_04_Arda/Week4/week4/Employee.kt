package oop_04_Arda.Week4.week4

open class Employee(val name: String, val baseSalary: Int) {

    open fun work() {
        println("$name sedang bekerja.")
    }

    open fun calculateBonus(): Int {
        return (baseSalary * 0.1).toInt() // Mengembalikan nilai 10% dari baseSalary
    }
}