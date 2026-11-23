package com.superpay.invest

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.superpay.invest.databinding.SignInBinding
import com.superpay.invest.ui.home.HomeFragment

class SignIn : AppCompatActivity() {
    private lateinit var binding: SignInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = SignInBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.signInButton.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}