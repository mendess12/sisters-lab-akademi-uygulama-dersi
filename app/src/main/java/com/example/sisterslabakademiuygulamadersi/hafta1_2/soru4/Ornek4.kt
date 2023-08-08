package com.example.sisterslabakademiuygulamadersi.hafta1_2.soru4

import java.util.Scanner

fun main() {

    /*
    * Kullanıcıdan bir harf girmesini isteyen ve bu harfin sesli veya sessiz harf olduğunu ekrana yazdıran bir programı nasıl yazarsınız?
    * */

    val scanner = Scanner(System.`in`)
    println("Harf girin")
    val harf = scanner.next()
        .first() // burada direk olarak char bir değer alamadığımız için string ifadenin ilk harfini kontrol edeceğiz
    val sesliHarf = "aeiouAEIOU"

    val sonuc = harf in sesliHarf

    if (sonuc) {
        println("$harf harfi sesli harftir")
    } else {
        println("$harf harfi sessiz harftir")
    }

}