package com.example.doublescreen


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
//import com.example.doublescreen.databinding.ActivityMainBinding

//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.firstpage)

        val studentbutton = findViewById<Button>(R.id.student_button)
        studentbutton.setOnClickListener {
            Toast.makeText(this, "Student Button was clicked!", Toast.LENGTH_SHORT).show()
//            val intent = Intent(this, Options::class.java) // This will take us to the screen/activity 'Options'
//            startActivity(intent)
        }

    }
}