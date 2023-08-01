package com.example.sisterslabakademiuygulamadersi.hafta2.soru7

fun main() {

    /*
    * Bir HashSet içerisindeki elemanları başka bir HashSet'e ekleyen bir fonksiyon yazın
    * */

    val liste = hashSetOf<Int>(10, 20, 40, 10, 15, 6, 8, 7, 1)
    println("Yeni listeye aktarılan veriler: ${yeniHashSeteEkle(liste)}")

}

fun yeniHashSeteEkle(liste: HashSet<Int>): HashSet<Int> {
    val yeniListe = HashSet<Int>()
    for (i in liste) {
        yeniListe.add(i)
    }
    return yeniListe
}