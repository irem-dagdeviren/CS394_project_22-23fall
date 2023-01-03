package com.example.project.model

import android.text.Editable
import java.io.Serializable

class Drug(
    val name: Editable,
    val day: String,
    val time: Editable,
    val dose: Editable,
    val doseType: String
) : Serializable {
}