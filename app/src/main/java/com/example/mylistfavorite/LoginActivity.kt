package com.example.mylistfavorite

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        button.setOnClickListener(){

            goToForgotPass()
        }


    }

    private fun goToForgotPass(){

        val intent= Intent(this@LoginActivity,HomeActivity::class.java)
        startActivity(intent)

    }
}