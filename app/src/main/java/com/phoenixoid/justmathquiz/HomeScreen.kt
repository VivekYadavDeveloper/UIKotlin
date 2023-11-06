package com.phoenixoid.justmathquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast


import com.google.android.material.appbar.MaterialToolbar

class HomeScreen : AppCompatActivity() {
    lateinit var topAppBar: MaterialToolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen);

        topAppBar = findViewById(R.id.appbar)
        topAppBar.setNavigationOnClickListener {
            Toast.makeText(
                this,
                "Navigation Icon Click",
                Toast.LENGTH_SHORT
            ).show()
        }
        topAppBar.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.searchIcon -> {
                    Toast.makeText(
                        this,
                        "Search Icon Click",
                        Toast.LENGTH_SHORT
                    ).show()
                    true
                }

                R.id.notificationIcon -> {
                    Toast.makeText(
                        this,
                        "Notification Icon Click",
                        Toast.LENGTH_SHORT
                    ).show()
                    true
                }

                R.id.shareIcon -> {
                    Toast.makeText(
                        this,
                        "Share Icon Click",
                        Toast.LENGTH_SHORT
                    ).show()
                    true
                }

                else -> {
                    false
                }
            }
        }
    }


}