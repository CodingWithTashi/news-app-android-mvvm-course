package com.codingwithtashi.newzappudemy.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.codingwithtashi.newzappudemy.R

class SplashScreenActivity : AppCompatActivity() {
    var SECOND : Long = 3000;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this,HomeActivity::class.java))
            finish()
        },SECOND);
    }
}