package com.example.sisterslabakademiuygulamadersi.hafta2.soru16

class Mudur : Employee {
    override fun maasHesapla(gunlukKazanc: Int, calismaGunSayisi: Int) {
        val maas = calismaGunSayisi * gunlukKazanc
        println("Mudur maaşı: $maas")
    }

}