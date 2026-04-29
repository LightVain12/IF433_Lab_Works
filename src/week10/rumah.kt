package Week10
//code Non-Generic
class rumah(val alamat:Any)

//code Generic
class kampus<T>(val alamat:T)

//code Generic - Multi Parameter
class Komputer<T, V>(val merk:T, val barcode:V)

//code Generic - Function
fun <T> Password(isiPass:T):T {
    return isiPass;
}

fun main() {
    println("===== GENERIC - Function =====")
    println("Password kamu: " + Password("12345"))

    println("===== GENERIC - MULTI PARAM =====")
    val komp = Komputer("Dell", 12345)
    println("Merk komputer : " + komp.merk)
    println("Barcode komputer : ${komp.barcode}")

    println("===== SAMPLE NON-GENERIC =====");
    val rmh = rumah(alamat = 200)
    val angkaRumah = rmh.alamat as Int
    println(rmh.alamat + 50)

    println("===== SAMPLE GENERIC =====")
    val kmps = kampus(alamat = 300)
    println(kmps.alamat + 50)
}