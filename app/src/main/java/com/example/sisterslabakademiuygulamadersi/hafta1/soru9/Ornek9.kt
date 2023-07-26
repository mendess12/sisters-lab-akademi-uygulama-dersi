package com.example.sisterslabakademiuygulamadersi.hafta1.soru9

import java.util.Scanner

fun main() {

    /*
    * Bir string içindeki tüm sesli harfleri kaldıran bir fonksiyon yazın.
    * Fonksiyon, kullanıcıdan alınan bir string içindeki tüm sesli harfleri kaldırarak yeni bir string döndürmelidir.
    *
    * */

    print("Bir metin girin: ")
    val scanner = Scanner(System.`in`)
    val metin = scanner.next().lowercase()
    val sonuc = sesliHarfleriKaldir(metin)
    println("Sonuç: $sonuc")
}

fun sesliHarfleriKaldir(metin: String): String {
    val sessizHarfler = "qwrtypsdfghjklzxcvbnm"
    return metin.filter {
        it in sessizHarfler
    }
}