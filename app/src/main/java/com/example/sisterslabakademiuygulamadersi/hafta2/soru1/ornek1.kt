package com.example.sisterslabakademiuygulamadersi.hafta2.soru1

fun main() {

    /*
    * Verilen bir listedeki tüm elemanları toplayan bir fonksiyon yazın.
    * */

    val arrayList = ArrayList<Int>()
    arrayList.add(15)
    arrayList.add(30)
    arrayList.add(50)
    arrayList.add(12)
    arrayList.add(23)
    arrayList.add(18)

    var toplam = 0

    for (i in 0 until arrayList.size) {
        toplam += arrayList[i]
    }

    println("ArrayList toplamı: $toplam")
}