package oop_04_Arda.Week4.week4

// Car "Is-A" Vehicle.
open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {
    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }
}