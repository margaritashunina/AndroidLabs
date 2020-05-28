package com.example.lab1

import android.graphics.Color
import android.graphics.PorterDuff
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    fun toastMassage(massage : String) {
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(applicationContext, massage, duration)

        toast.show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toastMassage("Окей, мы создались (onCreate)")
    }

    override fun onStart() {
        super.onStart()
        toastMassage("Окей, мы стартонули (onStart)")
    }

    override fun onResume() {
        super.onResume()
        toastMassage("Окей, мы возобновились (onResume)")
    }

    override fun onPause() {
        super.onPause()
        toastMassage("Окей, мы паузнули (onPause)")
    }

    override fun onStop() {
        super.onStop()
        toastMassage("Окей, мы стопнулись (onStop)")
    }

    override fun onDestroy() {
        super.onDestroy()
        toastMassage("Окей, мы уничтожились (onDestroy)")
    }
}
