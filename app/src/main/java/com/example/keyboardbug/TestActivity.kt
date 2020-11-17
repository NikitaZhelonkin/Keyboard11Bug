package com.example.keyboardbug

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val editText = findViewById<EditText>(R.id.input)
        editText.requestFocus()

    }

}