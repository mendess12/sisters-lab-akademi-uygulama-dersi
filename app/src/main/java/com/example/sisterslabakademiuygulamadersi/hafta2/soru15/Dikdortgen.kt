package com.example.sisterslabakademiuygulamadersi.hafta2.soru15

class Dikdortgen : Shape {

    override fun dikdortgenAlan(kisaKenar: Int, uzunKenar: Int) {
        val alan = 2 * (kisaKenar + uzunKenar)
        println("Dikdortgen alan: $alan")
    }

    override fun daireAlan(kenar: Int) {
        TODO("Not yet implemented")
    }
}