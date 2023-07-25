package com.example.sisterslabakademiuygulamadersi.hafta1.soru2

import java.util.Scanner

fun main() {

    /*
    * Kullanıcının girdiği bir sayının faktöriyelini hesaplayan bir fonksiyonu döngü kullanmadan nasıl yazarsınız?
    * */

    val scanner = Scanner(System.`in`)
    println("Sayı girin")
    val sayi = scanner.nextInt()

    println("$sayi! = ${faktoriyelHesapla(sayi)}")
}

fun faktoriyelHesapla(sayi: Int): Int {

    return if (sayi == 0 || sayi == 1) {
        1
    } else {
        sayi * faktoriyelHesapla(sayi - 1)
    }
}