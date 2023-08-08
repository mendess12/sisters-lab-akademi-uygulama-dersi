package com.example.sisterslabakademiuygulamadersi.hafta3.soru15

fun main() {

    /*
    * Geometrik şekilleri temsil eden bir arayüz (Shape) ve bu arayüzü uygulayan iki sınıf (Dikdortgen ve Daire) tanımlayın.
    * Her şekil için alanı hesaplayacak bir metot olsun
    * */


    val daire = Daire(5)
    daire.alanHesapla()

    val dikdortgen = Dikdortgen(15, 10)
    dikdortgen.alanHesapla()
}