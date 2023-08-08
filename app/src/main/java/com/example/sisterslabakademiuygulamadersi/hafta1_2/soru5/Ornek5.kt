package com.example.sisterslabakademiuygulamadersi.hafta1_2.soru5


fun main() {

    /*
    * Bir "Öğrenci" adlı sınıf oluşturun ve öğrencilerin adı, soyadı ve sınıfı gibi özellikleri içeren özellikleri tanımlayın.
    * Ardından, bu sınıftan beş öğrenci nesnesi oluşturun ve bu öğrencilerin özelliklerini ekrana yazdıran bir fonksiyon yazın
    * */

    val ogrenci1 = Ogrenci("Yusuf", 22, "Bilgisayar mühendisliği", 4)
    ogrenci1.bilgileriYazdir()
    val ogrenci2 = Ogrenci("Ali", 16, "sAYISAL", 11)
    ogrenci2.bilgileriYazdir()
    val ogrenci3 = Ogrenci("Ece", 17, "Eşit ağırlık", 12)
    ogrenci3.bilgileriYazdir()
    val ogrenci4 = Ogrenci("Ahmet", 18, "İlk öğretim matematik", 1)
    ogrenci4.bilgileriYazdir()
    val ogrenci5 = Ogrenci("Melis", 20, "Biyomedikal mühendisliği", 3)
    ogrenci5.bilgileriYazdir()
}