package com.example.materialdesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signIn()
//        setupSimpleSpinner()
    }

    private fun signIn() {
        val email = findViewById<TextInputEditText>(R.id.email_edit_text)
        val password = findViewById<TextInputEditText>(R.id.password_edit_text)
        val signInButton = findViewById<MaterialButton>(R.id.next_button)

        signInButton.setOnClickListener(){
            if(email.text.toString().isNullOrEmpty() || password.text.toString().isNullOrEmpty()){
                Toast.makeText(this, "Email or Password is not provided", Toast.LENGTH_LONG).show()
            } else{
                if(email.text.toString() == "man@gmail.com" && password.text.toString() == "12345"){
                    val intent = Intent(this, ViewActivity::class.java)
                    startActivity(intent)
                }else{
                    Toast.makeText(this, "Wrong email or password", Toast.LENGTH_LONG).show()
                }
            }
        }
    }

//    private fun setupSimpleSpinner() {
//        val spinner = findViewById<Spinner>(R.id.simple_spinner)
//
//        val adapter = ArrayAdapter.createFromResource(this, R.array.currency, android.R.layout.simple_spinner_item)
//        spinner.adapter = adapter
//
//        spinner.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
//            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
//                val selectedItem = parent!!.getItemAtPosition(position)
//                Toast.makeText(this@MainActivity, "$selectedItem", Toast.LENGTH_LONG).show()
//            }
//
//            override fun onNothingSelected(parent: AdapterView<*>?) {
//                Toast.makeText(this@MainActivity, "No item was selected", Toast.LENGTH_LONG).show()
//            }
//
//        }
//    }
}