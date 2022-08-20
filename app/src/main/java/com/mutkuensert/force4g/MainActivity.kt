package com.mutkuensert.force4g

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val androidOS = Build.VERSION.SDK_INT

        try {
            val intent = Intent(Intent.ACTION_MAIN)

            if(androidOS >= 30 ){// https://stackoverflow.com/a/66165805
                intent.setClassName("com.android.phone", "com.android.phone.settings.RadioInfo") //https://stackoverflow.com/a/50409322

            }else{
                intent.setClassName("com.android.settings", "com.android.settings.RadioInfo")
            }

            startActivity(intent)

        } catch (e: Exception) {
            Toast.makeText(applicationContext, " Device not supported", Toast.LENGTH_LONG).show()
        }
    }
}