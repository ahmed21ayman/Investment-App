package com.superpay.invest

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.superpay.invest.databinding.ActivitySplashBinding


class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

// make screen for 2 seconds only :
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, SignUp::class.java))
            finish()   // removes splash so Back doesn't return to it
        }, 2000)       // 2000 ms = 2 seconds
    }
}