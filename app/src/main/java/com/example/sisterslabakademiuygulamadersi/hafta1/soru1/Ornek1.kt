package com.example.sisterslabakademiuygulamadersi.hafta1.soru1

import java.util.Scanner

fun main() {

    /*
    * Kullanıcıya belirli bir sayı kadar tahmin yapma hakkı veren bir sayı tahmin oyununu nasıl oluşturursunuz?
    * */

    val scanner = Scanner(System.`in`)

    println("Sayı tahmini için kaç hakkı olsun")
    val tahminSayisi = scanner.nextInt()
    val randomSayi = (1..50).random()

    for (i in 1..tahminSayisi) {
        println("Sayıyı tahmin et")
        val tahmin = scanner.nextInt()
        if (randomSayi == tahmin) {
            println("Sayıyı $i. hakkında doğru bildin")
        } else {
            println("Yanlış tahmin ettin.Tekrar tahmin et")
        }
    }

}