package com.example.mylistfavorite

import android.content.Intent
import android.content.pm.ApplicationInfo
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.webkit.JavascriptInterface
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.ButtonBarLayout
import it.sephiroth.android.library.bottomnavigation.BottomNavigation
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_login.*

class HomeActivity() : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.KITKAT)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val mWebView = findViewById<WebView>(R.id.my_web_view)

        val webSettings = mWebView.settings
        webSettings.javaScriptEnabled = true
        mWebView.loadUrl(getString(R.string.website_url))
        mWebView.webViewClient = HelloWebViewClient()
        WebView.setWebContentsDebuggingEnabled(false)
    }

    private inner class HelloWebViewClient : WebViewClient() {

        override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
            if (Uri.parse(url).host == getString(R.string.website_domain)) {
                return false
            }
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
            return true
        }

        override fun onPageFinished(view: WebView, url: String) {
            // TODO Auto-generated method stub
            super.onPageFinished(view, url)
        }

    }

//    override fun onKeyDown(keyCode: Int, event: KeyEvent): Boolean {
//        if (keyCode == KeyEvent.KEYCODE_BACK && webview.canGoBack()) {
//            webview.goBack()
//            return true
//        }
//        return super.onKeyDown(keyCode, event)
//    }

}



