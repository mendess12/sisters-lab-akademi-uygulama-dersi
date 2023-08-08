package com.example.sisterslabakademiuygulamadersi.hafta3.soru5

fun main() {

    /*
    * Verilen bir listedeki tekrar eden elemanları HashSet olarak döndüren bir fonksiyon yazın.
    * */

    val arrayList = listOf<Int>(1, 5, 7, 9, 1, 5, 8, 7, 2, 2, 1, 5)
    println("Tekrar Edenler: ${hashMapDonder(arrayList)}")

}

fun hashMapDonder(list: List<Int>): HashSet<Int> {
    val tekrarEtmeyen = HashSet<Int>()
    val tekrarEdenler = HashSet<Int>()

    for (i in list) {
        if (!tekrarEtmeyen.add(i)) {
            tekrarEdenler.add(i)
        }
    }
    return tekrarEdenler

}