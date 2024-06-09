package com.example.doublescreen

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat

class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_menu)

        val student_button = findViewById<Button>(R.id.student_button)
        student_button.setOnClickListener {
            Toast.makeText(this, "Student Button was clicked!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Options::class.java) // This will take us to the screen/activity 'Options'
            startActivity(intent)
        }

        val portal_back_button = findViewById<Button>(R.id.portalscreen_back_button)
        portal_back_button.setOnClickListener {
            Toast.makeText(this, "Back button was clicked!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}