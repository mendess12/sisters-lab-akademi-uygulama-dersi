package com.example.sisterslabakademiuygulamadersi.hafta3.soru16

class Memur  : Employee {
    override fun maasHesapla(gunlukKazanc: Int, calismaGunSayisi: Int) {
        val maas = calismaGunSayisi * gunlukKazanc
        println("Memur maaşı: $maas")
    }

}