package com.example.sisterslabakademiuygulamadersi.hafta2.soru2

fun main() {

    /*
    * Bir listedeki tek sayıları filtreleyen bir fonksiyon yazın
    * */

    val arrayList = ArrayList<Int>()
    arrayList.add(15)
    arrayList.add(20)
    arrayList.add(21)
    arrayList.add(19)
    arrayList.add(30)
    arrayList.add(1)
    arrayList.add(3)

    println("Tek değerler: ${tekDegerler(arrayList)}")

}

fun tekDegerler(list: ArrayList<Int>): ArrayList<Int> {

    val tekDegerListesi = ArrayList<Int>()
    for (i in 0 until list.size) {
        if (list[i] % 2 != 0) {
            tekDegerListesi.add(list[i])
        }
    }
    return tekDegerListesi
}