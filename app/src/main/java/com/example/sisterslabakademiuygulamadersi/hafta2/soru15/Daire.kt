package com.example.sisterslabakademiuygulamadersi.hafta2.soru15

class Daire constructor(val yaricap: Int) : Shape {
    override fun alanHesapla() {
        val pi = 3.14
        val alan = pi * yaricap * yaricap
        println("Daire alanı: $alan")
    }


}