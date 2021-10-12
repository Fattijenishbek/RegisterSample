package com.example.registerneo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        buttonLog.setOnClickListener {
//            supportFragmentManager.beginTransaction().add(R.id.main_fragment, RegistrationEmptyFragment()).commit()
//        }

        supportActionBar?.hide()

        Handler().postDelayed({
            supportFragmentManager.beginTransaction().replace(R.id.main_activity, MainScreenFragment()).commit()
        }, 2000)
    }
}