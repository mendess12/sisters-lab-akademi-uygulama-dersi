package com.example.sisterslabakademiuygulamadersi.hafta1_2.soru5

class Ogrenci(val isim: String, val yas: Int, val bolum: String, val sinif: Int) {

    fun bilgileriYazdir() {
        println("$isim isimli öğrenicinin yaşı $yas, bölümü $bolum ve sınıfı $sinif")
    }
}