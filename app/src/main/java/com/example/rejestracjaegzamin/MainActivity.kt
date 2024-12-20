package com.example.rejestracjaegzamin

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val editTextEmail: EditText = findViewById(R.id.Email_EditText)
        val editTextPassword: EditText = findViewById(R.id.Password_EditText)
        val editTextRepeatPassword: EditText = findViewById(R.id.Repeat_Password_EditText)
        val buttonZatwierdz: Button = findViewById(R.id.Zatwierdz_Button)
        val showall: TextView = findViewById(R.id.ShowAll_TextView)




        buttonZatwierdz.setOnClickListener {
            val email = editTextEmail.text.toString()
            val password1 = editTextPassword.text.toString()
            val password2 = editTextRepeatPassword.text.toString()
            if (email.contains("@")){
                showall.setText("Witaj! ${editTextEmail.getText()}")
            }
            else if (password1 != password2 || password1.isEmpty()){
                showall.setText("hasla sie roznia")
            }
            else{
                showall.setText("nieprawidlowy adress email")
            }
        }


    }
}