package com.example.sisterslabakademiuygulamadersi.hafta2.soru15

fun main() {

    /*
    * Geometrik şekilleri temsil eden bir arayüz (Shape) ve bu arayüzü uygulayan iki sınıf (Dikdortgen ve Daire) tanımlayın.
    * Her şekil için alanı hesaplayacak bir metot olsun
    * */


    val daire = Daire()
    daire.daireAlan(15)

    val dikdortgen = Dikdortgen()
    dikdortgen.dikdortgenAlan(10, 15)
}