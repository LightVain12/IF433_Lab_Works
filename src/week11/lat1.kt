package week11

fun panggil_nama(nama:String):String {
    return "Hai $nama"
}

fun String.panggil_mahasiswa():String {
    var hasil = this.split(" ").joinToString(" ") {
        it.replaceFirstChar {
                c -> c.uppercase()
        }
    }
    return hasil
}

//function Extension - Parameter
fun Int.tentukanLulus(nama:String):String {
    var keputusan = ""
    if (this >= 70) {
        keputusan = "Lulus"
    } else {
        keputusan = "Remedial"    }
    return "Mahasiswa $nama hasil kelulusan adalah $keputusan"
}

//function Extension - cek NULL
fun String?.cekNulldanEmpty():String {
    if(this == null || this.isEmpty()) {
        return "gak boleh null atau kosong bang"
    } else {
        return "username kamu adalah $this"
    }
}

class Mahasiswa() {
    var nim:String = ""
    var nama:String = ""
    var ipk:Int = 0
}

fun main() {
    //cara panggil function Extension - NULL
    var inputUsername:String? = "Wirawan"
    println(inputUsername.cekNulldanEmpty())

    //cara panggil function Extension - Parameter
    println(80.tentukanLulus("Revan"))

    //Cara panggil function biasa
    println(panggil_nama("Toni").uppercase())

    //cara panggil function Extension - BASIC
    println("tonyyy stark iron man".panggil_mahasiswa())

    //SCOPE - LET
    var kampusSaya = "UMN"
    kampusSaya.let {
        if(it == "UMN") {
            println("kampus " + it + " Keren")
        } else {
            println("Amazing $it")
        }
    }

    //SCOPE - RUN
    var alamatSaya = "Gading Serpong"
    alamatSaya.run {
        println(this)
    }

    //SCOPE - WITH
    var gradeSaya = with(90){
        if(this >= 80) {
            "A"
        } else if (this >= 70) {
            "B"
        } else {
            "C"
        }
    }
    println("Grade kamu adalah $gradeSaya")

    //SCOPE - APPLY
    var dataMahasiswa = Mahasiswa().apply {
        nim = "12345"
        nama = "Yudi"
        ipk = 3
    }
    println("Mahasiswa ${dataMahasiswa.nama} dgn nim ${dataMahasiswa.nim} ipk nya ${dataMahasiswa.ipk}")

    //SCOPE - ALSO
    var deretAngka = mutableListOf<Int>(80,70,75,68,85)
    deretAngka.also {
        println("Sebelum $deretAngka")
    }.add(90)
    println("Setelah $deretAngka")

    //unused
    //var coba = "Udin"
    //println(coba.repeat(2))
}