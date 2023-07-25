package com.example.sisterslabakademiuygulamadersi.hafta1.soru6

import java.util.Scanner

fun main() {

    /*
    * Kullanıcıdan bir ay ismi girmesini isteyen ve bu aya göre mevsim bilgisini ekrana yazdıran bir programı nasıl yazarsınız?
    * */

    val scanner = Scanner(System.`in`)
    println("Ay girin")
    val ay = scanner.next().lowercase()

    when (ay) {
        "aralık", "ocak", "şubat" -> println("$ay kış ayıdır.")
        "mart", "nisan", "mayıs" -> println("$ay ilkbahar ayıdır.")
        "haziran", "temmuz", "ağustos" -> println("$ay yaz ayıdır.")
        "eylül", "ekim", "kasım" -> println("$ay sonbahar ayıdır.")
        else -> println("Geçersiz bir ay girdin")
    }
}