package com.example.mylistfavorite

import android.content.Intent
import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity
import it.sephiroth.android.library.bottomnavigation.BottomNavigation
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_login.*

class HomeActivity() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val myWebView = WebView(application)
        setContentView(myWebView)

        BottomNavigation.setOnClickListener {
            val myWebView: WebView = findViewById(R.id.webview)
            myWebView.loadUrl("https://g.co/kgs/nZs5DM")
        }


    }



}