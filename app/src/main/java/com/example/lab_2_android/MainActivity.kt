package com.example.lab_2_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(applicationContext, R.string.toast_msg, Toast.LENGTH_LONG).show()

        btn_procesar.setOnClickListener{
            val intent = Intent(this, ResultActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}

