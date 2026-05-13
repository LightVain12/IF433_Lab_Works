package week12

//basic Exception - TryCatch
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

//Exception -Expression - Tipe data
fun cek_tipe_data() {
    var angka:Int = try {
        Integer.parseInt("10");
    } catch (e:Exception) {
        println("ada err di CekTipeData: ${e.message}")
        123123
    }
    println("Angka kamu adalah ${angka}");
}


fun main() {
    //Exception - Expression
    cek_tipe_data()
    pembagian(10,0)
}