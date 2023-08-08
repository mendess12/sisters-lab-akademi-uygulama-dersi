package com.example.sisterslabakademiuygulamadersi.hafta3.soru16

fun main() {

    /*
    * Bir "Calisan" (Employee) arayüzü oluşturun ve bu arayüzü uygulayan sınıfları (Mudur ve Memur) tanımlayın.
    * Her sınıfın "maasHesapla" metodu olsun
    * */

    val mudur = Mudur()
    mudur.maasHesapla(1000, 28)

    val memur = Memur()
    memur.maasHesapla(800, 30)

}