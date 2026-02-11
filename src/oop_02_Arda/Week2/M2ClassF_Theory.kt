package oop_02_Arda.Week2

class Pemain {
    var nama: String = "Tidak Terdaftar"
    var speed: Int = 9
    val shoot: Int = 8


    init {
        nama = "messi";
        print("ini adalah constructor");
    }

    constructor(alias:String="Budi", kecepatan: Int=2) {
        nama = alias;
        speed = kecepatan;
        println("ini adalah contstrutor2");
    }

    fun bawa_bola() {
        println("si $nama sedang bawa bola")
    }
}

fun main() {
    val player = Pemain()
    player.bawa_bola()
    println("nama pemain: ${player.nama}")
    println("speed: ${player.speed}")

    val player2 = Pemain(alias = "Ronaldo", kecepatan = 99)
    println("pemain popular: ${player2.nama}")
    println("kecepatan: ${player2.speed}")
}

