package com.example.sisterslabakademiuygulamadersi.hafta2.soru8

fun main() {

    /*
    * Verilen bir listeyi SetOf olarak döndüren bir fonksiyon yazın (tekrar eden elemanları çıkarır).
    * */

    val list = listOf<Int>(1, 5, 5, 2, 1, 3, 6, 9, 8, 74, 12, 56, 32, 1, 5, 6, 8)
    println("SetList: ${setOfDonder(list)}")

}

fun setOfDonder(list: List<Int>): Set<Int> {
    return list.toSet()
}