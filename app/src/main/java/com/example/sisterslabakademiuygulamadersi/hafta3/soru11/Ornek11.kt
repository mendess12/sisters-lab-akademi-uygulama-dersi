package com.example.sisterslabakademiuygulamadersi.hafta3.soru11

fun main() {

    /*
    *  Verilen bir liste içerisindeki elemanların sayısını bir HashMap olarak döndüren bir fonksiyon yazın.
    * */

    val liste = listOf<Int>(10, 2, 4, 6, 2, 45, 8, 7, 4, 2, 3, 10, 2, 5, 8, 7)
    val hashMapListe = HashMap<Int, Int>()
    for (i in liste) {
        if (!hashMapListe.keys.contains(i)) {
            hashMapListe.put(i, liste.filter { it == i }.count())
        }
    }
    println(hashMapListe)
}
