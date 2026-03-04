package buat_latihanweek5

fun main() {
    val listMatkul : List<MataKuliah> = listOf(
    Wajib(),
    Elective()
    );
    println("banyak tipe matkul: $listMatkul");

    //panggil method anak - anak -> so set_matkul()

    for(mku in listMatkul) {
        mku.set_matkul(3)

        if (mku is Wajib){
            mku.ada_seminar();
        } else if(mku is Elective){
            mku.ada_praktek();
        }
        when (mku) {
            is Wajib -> {
                println("Wajib dari When : ")
                mku.ada_seminar();
            }
                is Elective -> {
                    println("Elective dari When : ")
                    mku.ada_praktek();
                }


        }
    }
}

