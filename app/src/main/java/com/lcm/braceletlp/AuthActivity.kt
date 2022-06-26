package com.lcm.braceletlp

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button

class AuthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        // Splash
        Thread.sleep(1000)
        setTheme(R.style.Theme_BraceletLP)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        val btnInciar = findViewById<Button>(R.id.btnIniciar)

        btnInciar.setOnClickListener{
            val lanzar = Intent(this, LoginActivity::class.java)
            startActivity(lanzar)
        }

        val btnCrear = findViewById<Button>(R.id.btnCrear)

        btnCrear.setOnClickListener{
            val lanzar = Intent(this, SignupActivity::class.java)
            startActivity(lanzar)
        }

        /*
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT){
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
        */
    }
}