package com.example.sisterslabakademiuygulamadersi.hafta2.soru4

fun main() {

    /*
    * Bir listedeki elemanları tersine çeviren bir fonksiyon yazın.
    * */

    val arrayList = listOf<Int>(10, 20, 12, 50, 60, 7, 8, 9, 63, 1, 2, 3)
    println("Listenin Tersi: ${tersCevirme(arrayList)}")
}

private fun tersCevirme(list: List<Int>): List<Int> {
    return list.reversed()
}