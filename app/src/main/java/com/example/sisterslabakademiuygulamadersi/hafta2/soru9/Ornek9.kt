package com.example.sisterslabakademiuygulamadersi.hafta2.soru9

fun main() {

    /*
    * Bir SetOf'taki elemanları diğer bir SetOf'tan çıkaran bir fonksiyon yazın
    * */

    val setOfList = setOf<Int>(5, 9, 4, 1, 2, 3, 6, 9, 4, 2, 56, 3, 5, 4, 98,99,100)
    val setOfList2 = setOf<Int>(9, 6, 5, 4, 1, 2, 3, 65, 89, 5, 4, 2, 36, 5)
    println("İki liste farkı: ${cikar(setOfList, setOfList2)}")
}

fun cikar(liste: Set<Int>, liste2: Set<Int>): Set<Int> {
    val fark = liste - liste2
    return fark
}