package com.example.sisterslabakademiuygulamadersi.hafta2.soru12

fun main() {

    /*
    * Bir HashMap'teki tüm değerleri toplayan bir fonksiyon yazın.
    * */


    val hashMap = hashMapOf("bir" to 1, "iki" to 2, "üç" to 3, "dört" to 4, "beş" to 5)

    println("Total sum of values: ${hashToplam(hashMap)}")

}

fun hashToplam(hashMap: HashMap<*, Int>): Int {

    var toplam = 0
    for (value in hashMap.values) {
        toplam += value
    }
    return toplam
}