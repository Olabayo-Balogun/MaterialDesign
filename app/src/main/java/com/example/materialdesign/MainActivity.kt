package com.example.materialdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupSimpleSpinner()
    }

    private fun setupSimpleSpinner() {
        val spinner = findViewById<Spinner>(R.id.simple_spinner)
    }
}