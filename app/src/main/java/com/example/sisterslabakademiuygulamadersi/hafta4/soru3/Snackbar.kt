package com.example.sisterslabakademiuygulamadersi.hafta4.soru3

import android.view.View
import com.google.android.material.snackbar.Snackbar

fun View.snackbar(message: String) {
    Snackbar.make(this, message, Snackbar.LENGTH_LONG).show()
}