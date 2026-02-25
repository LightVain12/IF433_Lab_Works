package oop_04_Arda.Week4.week4

fun main() {
    println("--- Testing Electric Car ---")
    val myEv = ElectricCar(brand = "Tesla", numberOfDoors = 4, batteryCapacity = 85)

    myEv.accelerate()
    myEv.honk()
    myEv.openTrunk()
}