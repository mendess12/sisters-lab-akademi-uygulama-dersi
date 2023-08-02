package com.example.sisterslabakademiuygulamadersi.hafta2.soru16

class Memur constructor(val gunlukKazanc: Int) : Employee {
    override fun maasHesapla() {
        val maas = 30 * gunlukKazanc
        println("Memur maaşı: $maas")
    }
}