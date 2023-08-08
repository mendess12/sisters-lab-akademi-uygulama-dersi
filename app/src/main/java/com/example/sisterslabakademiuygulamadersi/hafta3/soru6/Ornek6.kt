package com.example.sisterslabakademiuygulamadersi.hafta3.soru6

fun main() {

    /*
    * Bir HashSet'in belirli bir elemanı içerip içermediğini kontrol eden bir fonksiyon yazın.
    * */

    val list = HashSet<Int>()
    list.add(5)
    list.add(15)
    list.add(12)
    list.add(3)
    list.add(4)
    list.add(8)
    println("Var mi? : ${iceriyorMu(list)}")
}

fun iceriyorMu(list: HashSet<Int>): Boolean {
    return list.contains(15)
}