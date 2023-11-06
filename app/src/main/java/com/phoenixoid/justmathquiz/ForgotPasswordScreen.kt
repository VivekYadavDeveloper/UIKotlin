package com.phoenixoid.justmathquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ForgotPasswordScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password_screen)


        /*Navigation Controller*/
        val forgotPasswordScreen = findViewById<Button>(R.id.ForgotPassSubmit)
        forgotPasswordScreen.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}