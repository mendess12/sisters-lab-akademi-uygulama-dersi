package com.example.sisterslabakademiuygulamadersi.hafta2.soru13

fun main() {

    /*
    *  Bir HashMap'teki en büyük değeri ve anahtarını bulan bir fonksiyon yazın.
    * */

    val hashMap = hashMapOf(
        "A" to 9,
        "E" to 2,
        "F" to 3,
        "G" to 4,
        "D" to 5
    )

    maxKeyValue(hashMap)

}

fun maxKeyValue(hashMap: HashMap<String, Int>) {
    val maxValue = hashMapOf<String, Int>()
    val max = hashMap.values.max()

    for (i in hashMap) {
        if (i.value == max) {
            maxValue.put(i.key, i.value)
        }
    }
    println("max: $maxValue")
}
