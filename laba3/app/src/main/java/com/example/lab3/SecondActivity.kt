package com.example.lab3

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    override fun onResume() {
        super.onResume()
        my_image.setImageBitmap(intent.getParcelableExtra("Bitmap"))
        get_text.setText(intent.getStringExtra("Name"))
    }

    override fun onStart() {
        super.onStart()
        my_image.setImageBitmap(intent.getParcelableExtra("Bitmap"))
        get_text.setText(intent.getStringExtra("Name"))
    }
}
