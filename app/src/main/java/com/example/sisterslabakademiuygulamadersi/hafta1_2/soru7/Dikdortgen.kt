package com.example.sisterslabakademiuygulamadersi.hafta1_2.soru7

class Dikdortgen(val uzunluk: Int, val genislik: Int) {

    fun alanHesapla() {
        val alan = uzunluk * genislik
        println("Dikdortgenin alanı: $alan")
    }

    fun cevraHesapla() {
        val cevre = 2 * (uzunluk + genislik)
        println("Dikdortgenin çevresi: $cevre")
    }
}