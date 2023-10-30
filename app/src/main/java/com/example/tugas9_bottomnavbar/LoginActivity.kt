package com.example.tugas9_bottomnavbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugas9_bottomnavbar.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    companion object {
        const val EXTRA_UNAME = "EXT_UNAME"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            login.setOnClickListener {
                val intent = Intent(this@LoginActivity, MainActivity::class.java)
                intent.putExtra(EXTRA_UNAME, UnameLogin.text.toString())
                startActivity(intent)
            }
        }
    }
}