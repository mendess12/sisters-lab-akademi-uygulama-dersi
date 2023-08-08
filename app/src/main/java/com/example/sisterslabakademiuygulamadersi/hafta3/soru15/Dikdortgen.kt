package com.example.sisterslabakademiuygulamadersi.hafta3.soru15

class Dikdortgen constructor(val uzunKenar: Int, val kisaKenar: Int) : Shape {
    override fun alanHesapla() {
        val alan = 2 * (uzunKenar + kisaKenar)
        println("Dikdörtgen Alam: $alan")
    }


}