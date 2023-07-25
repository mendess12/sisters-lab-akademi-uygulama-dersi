package com.example.sisterslabakademiuygulamadersi.hafta1.soru3

import java.util.Scanner

fun main() {

    /*
    * Bir kullanıcının sınav notuna göre, eğer notu 70 ve üzeriyse "Geçtiniz", aksi halde "Kaldınız" mesajını veren bir programı nasıl yazarsınız?
    * */

    val scanner = Scanner(System.`in`)
    println("Notunuzu giriniz")
    val not = scanner.nextInt()

    if (not >= 70) {
        println("Geçtiniz")
    } else {
        println("Kaldınız")
    }
}