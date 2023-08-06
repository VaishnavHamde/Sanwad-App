package com.example.sanwad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.sanwad.databinding.ActivityLogInBinding
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import kotlin.math.log

class LogInActivity : AppCompatActivity() {

    lateinit var logInBinding : ActivityLogInBinding

    val database = FirebaseDatabase.getInstance()
    val databaseReference = database.reference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        logInBinding = ActivityLogInBinding.inflate(layoutInflater)
        val view = logInBinding.root
        setContentView(view)

        logInBinding.buttonLogIn.setOnClickListener {

        }

        logInBinding.textViewSignUp.setOnClickListener {
            val intent = Intent(this@LogInActivity, SignUpActivity::class.java)
            startActivity(intent)
        }
        logInBinding.textViewForgotPassword.setOnClickListener {

        }
    }
}