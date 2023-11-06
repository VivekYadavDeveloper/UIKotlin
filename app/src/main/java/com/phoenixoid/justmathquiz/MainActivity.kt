package com.phoenixoid.justmathquiz

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*Get Reference/Controller of All Views */
        val forgotPasswordScreenButton = findViewById<Button>(R.id.ForgotPass)
        forgotPasswordScreenButton.setOnClickListener {
            val intent = Intent(this, ForgotPasswordScreen::class.java)
            startActivity(intent)
        }


        /*Get Reference/Controller of All Views */
        val sigInScreenButton = findViewById<Button>(R.id.sigin_acc)
        sigInScreenButton.setOnClickListener {
            val intent = Intent(this, SignupScreen::class.java)
            startActivity(intent)
        }

        /*Get Reference/Controller of All Views */
        val logInScreenButton = findViewById<Button>(R.id.LoginButton)
        logInScreenButton.setOnClickListener {
            val intent = Intent(this, MainNavigation::class.java)
            startActivity(intent)

        }
    }
}