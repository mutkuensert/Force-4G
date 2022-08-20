package com.mutkuensert.force4g

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        try {
            val intent = Intent(Intent.ACTION_MAIN)
            intent.setClassName("com.android.phone", "com.android.phone.settings.RadioInfo")
            startActivity(intent)
        } catch (e: Exception) {
            Toast.makeText(applicationContext, " Device not supported", Toast.LENGTH_LONG).show()
        }
    }
}