package com.example.sisterslabakademiuygulamadersi.hafta1_2.soru10

import java.util.Scanner

fun main() {

    /*
    * Bir Integer türünde ArrayList oluşturun ve kullanıcıdan alınan 5 adet sayıyı bu listeye ekleyin.
    * Ardından, listedeki sayıları toplayan bir fonksiyon yazın ve sonucu ekrana yazdırın
    * */

    val arrayList: ArrayList<Int> = arrayListOf()
    val scanner = Scanner(System.`in`)
    for (i in 1..5) {
        println("Sayı girin")
        val sayi = scanner.nextInt()
        arrayList.add(sayi)
    }

    println("Array listesindeki değerler : ${arrayList.joinToString()}")

    arrayListTopla(arrayList)

}

fun arrayListTopla(arrayList: ArrayList<Int>) {
    var toplam = 0
    for (i in 0 until arrayList.size) {
        toplam += arrayList[i]
    }

    println("Array list toplamı: $toplam")
}