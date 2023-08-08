package com.example.sisterslabakademiuygulamadersi.hafta1_2.soru11

import java.util.Scanner

fun main() {

    /*
    * Bir String türünde ArrayList oluşturun ve içine "ahmet", "mehmet", "ayşe", "feyza", "emir" gibi isimleri ekleyin.
    *  Kullanıcıdan alınan bir indeks numarasına göre listedeki ismi güncelleyen bir fonksiyon yazın.
    * Yani kullanıcı, "ahmet" isminin indeksini ve yeni ismi (örn. "ali") girerek listedeki "ahmet" ismini "ali" olarak değiştirebilsin.
    * */

    val arrayList = ArrayList<String>()
    arrayList.add("ahmet")
    arrayList.add("mehmet")
    arrayList.add("ayşe")
    arrayList.add("feyza")
    arrayList.add("emir")


    val scanner = Scanner(System.`in`)
    println("0 ile ${arrayList.size} arasında bir index değeri girin(5 girmeyiniz)")
    val index = scanner.nextInt()

    if (index < arrayList.size) {
        arrayList[index] = "ali"
        println(arrayList.joinToString())
    } else {
        println("Girilen sayı listenin boyutundan büyük olamaz.")
    }
}