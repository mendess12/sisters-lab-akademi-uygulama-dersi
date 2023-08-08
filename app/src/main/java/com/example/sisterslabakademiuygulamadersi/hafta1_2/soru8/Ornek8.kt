package com.example.sisterslabakademiuygulamadersi.hafta1_2.soru8

fun main() {

    /*
    * "Arac" adlı bir üst sınıf oluşturun ve bu sınıfta araçların hızı ve yakıt tüketimi gibi özellikleri tanımlayın.
    *  Ardından "Otomobil" adlı bir alt sınıf oluşturun ve bu sınıfta otomobil türüne özgü özellikleri ekleyin.
    * "Otomobil" sınıfı "Arac" sınıfından kalıtım almalıdır. Otomobil sınıfında "bagajHacmi" adlı bir özelliği ve "bagajAc" adlı bir metodu ekleyin.
    * */

    val arac = Arac(150, 4.7)
    println("Arac hızı ${arac.hiz} yakıt tüketimi ${arac.yakitTuketimi}")

    val otomobil = Otomobil(120, 5.2, "BMW", 50)
    println("Otomobil hızı ${otomobil.hiz} yakıt tüketimi ${otomobil.yakitTuketimi} modeli ${otomobil.model} bagaj hacmi ${otomobil.bagajHacmi} litredir.")
    otomobil.bagajAc()
}