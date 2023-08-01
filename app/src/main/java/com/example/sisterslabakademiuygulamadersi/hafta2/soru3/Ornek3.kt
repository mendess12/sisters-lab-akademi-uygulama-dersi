package com.example.sisterslabakademiuygulamadersi.hafta2.soru3

fun main() {

    /*
    * İki listenin elemanlarını birleştirip sıralayan bir fonksiyon yazın
    * */

    val arrayList1 = listOf<Int>(10, 20, 5, 6, 78, 12)
    val arrayList2 = listOf<Int>(11, 5, 5, 9, 96, 52)

    println("Birleştirme: ${birlestirme(arrayList1, arrayList2)}")
}

fun birlestirme(list1: List<Int>, list2: List<Int>): List<Int> {

    val birlestir = list1 + list2
    return birlestir.sorted()
}