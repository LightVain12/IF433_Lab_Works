package week12

fun pembagian(pembilang:Int, penyebut:Int) {
    try {
        val hasilBagi = pembilang / penyebut;
        println("Hasil bagi: $hasilBagi");
    } catch (e: Exception) {
        println("Error diPembagian: ${e.message}");
    } finally {
        println("Selesai Pembagian");
    }
}

fun cek_tipe_data() {
    var angka:Int = try {
        Integer.parseInt("10");
    } catch (e:Exception) {
        println("ada err di CekTipeData: ${e.message}")
        123123
    }
    println("Angka kamu adalah ${angka}");
}

//Throw
fun cek_saldo(saldoSaya: Int) {
    if(saldoSaya<1000) {
        throw IllegalArgumentException("Saldo ${saldoSaya} tidak perlu bayar pajak")
    } else {
        println("Selamat kamu orang kaya");
    }
}

//custom Exception
class CekNilaiKKM(val kkm:Int, val nilai:Int): Exception("Nilai $nilai berada dibawah kkm $kkm")

class nilai_siswa(val kkm:Int) {
    fun input_nilai(nilaiKamu:Int) {
        if(nilaiKamu < kkm) {
            throw CekNilaiKKM(kkm, nilaiKamu)
        } else {
            println("Kamu lulus, dengan nilai $nilaiKamu")
        }
    }
}

//multiple catch
fun contoh_multiple_catch(nilai:String) {
    try {
        val angka = Integer.parseInt(nilai);
        val hasil = angka/2
        println("Hasil nilainya: $hasil")
        cek_saldo(100)
    } catch (e: NumberFormatException) {
        println("Error salah format ${e.message}")
    } catch (e: ArithmeticException) {
        println("Error kesalahan Aritmatika ${e.message}")
    } catch (e: Exception) {
        println("Error program :  ${e.message}")
    }
}

sealed class ATMException(pesan: String): Exception(pesan)

class saldo_dibawak_nol(val saldoKamu:Int):
    ATMException("Masa saldo $saldoKamu minus")
class cek_jumlah_saldo(val saldoAwal:Int, val jajan:Int):
    ATMException("Saldo tinggal $saldoAwal, kamu jajan $jajan, ga cukup bang")

fun mulai_jajan(saldoAwalKamu:Int, jajanKamu:Int):Int {
    if(jajanKamu > saldoAwalKamu) {
        throw cek_jumlah_saldo(saldoAwalKamu, jajanKamu)
    } else if (saldoAwalKamu<0) {
        throw saldo_dibawak_nol(saldoAwalKamu)
    } else {
        println("Transaksi berhasil!!!!, saldo sisa: ")
    }
    return saldoAwalKamu - jajanKamu;
}

fun main() {
    runCatching { mulai_jajan(1000, 900) }
        .onSuccess{ println("Transaksi Sukses: $it")}
        .onFailure{ println("Transaksi Gagal $it")}

    contoh_multiple_catch("50")

    //panggil class custom Exception
    val nsiswa = nilai_siswa(70);
    try {
        nsiswa.input_nilai(71);
    } catch (e:Exception) {
        println("Ada error saat input nilai ${e.message}");
    }
    //Coba Throw
    try {
        cek_saldo(1200)
    } catch (e: Exception) {
        println("Error diThrow: ${e.message}")
    }
    //Exception - Expression
    cek_tipe_data()

    //Exception basic
    pembagian(10,0)
}