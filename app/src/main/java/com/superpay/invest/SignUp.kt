package com.superpay.invest

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.superpay.invest.databinding.SignUpBinding

class SignUp : AppCompatActivity() {
    private lateinit var binding: SignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = SignUpBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.signUpButton.setOnClickListener {
            startActivity(Intent(this, SignIn::class.java))
        }
    }
}