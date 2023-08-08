package com.example.sisterslabakademiuygulamadersi.hafta3.soru10

fun main() {
    /*
    * Verilen iki HashMap'in kesişimini bulan bir fonksiyon yazın.
    * */

    val hashMap1 = hashMapOf(1 to "Bir", 2 to "İki", 3 to "Üç",4 to "Dört")
    val hashMap2 = hashMapOf(3 to "Üç", 4 to "Dört", 5 to "Beş")

    println("Kesisen HashMap : ${kesisenDegerler(hashMap1, hashMap2)}")
}

fun <K, V> kesisenDegerler(map1: HashMap<K, V>, map2: HashMap<K, V>): HashMap<K, V> {

    val kesisenHashMap = HashMap<K, V>()

    for ((key, value) in map1) {
        if (map2.containsKey(key) && map2[key] == value) {
            kesisenHashMap[key] = value
        }
    }
    return kesisenHashMap
}