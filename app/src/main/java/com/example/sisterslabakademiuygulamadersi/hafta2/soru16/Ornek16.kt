package com.example.sisterslabakademiuygulamadersi.hafta2.soru16

fun main() {

    /*
    * Bir "Calisan" (Employee) arayüzü oluşturun ve bu arayüzü uygulayan sınıfları (Mudur ve Memur) tanımlayın.
    * Her sınıfın "maasHesapla" metodu olsun
    * */

    val mudur = Mudur(1000)
    mudur.maasHesapla()

    val memur = Memur(800)
    memur.maasHesapla()

}