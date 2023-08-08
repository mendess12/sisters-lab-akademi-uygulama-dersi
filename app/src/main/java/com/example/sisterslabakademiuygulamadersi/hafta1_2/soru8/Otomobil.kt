package com.example.sisterslabakademiuygulamadersi.hafta1_2.soru8

class Otomobil(hiz:Int, yakitTuketimi:Double,val model:String,val bagajHacmi:Int) : Arac(hiz,yakitTuketimi) {

    fun bagajAc(){
        println("Otomobilin bagajı açıldı.")
    }
}