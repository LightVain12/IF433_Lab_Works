package week8

class Alamat (val nomor : Int, val kota : String);
class Mahasiswa (val nim : String, val addr: Alamat?);


fun main(){
    val almt = Alamat ( nomor = 47, kota = "Tangerang");
    val mhs = Mahasiswa (nim = "12345" , addr = almt );

    val defaultAlamat = mhs.addr?.let { alamatAsli ->
        "sini nih ..... ${alamatAsli.kota} nomornya ${alamatAsli.nomor}"
    } ?: "Gak jelas, ga tau dimana"

    println("Nim-nya ${mhs.nim} tinggalnya di ${defaultAlamat}");
}