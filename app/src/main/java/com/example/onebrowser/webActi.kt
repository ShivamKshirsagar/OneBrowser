package com.example.onebrowser

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.URLUtil
import android.webkit.WebView
import android.webkit.WebViewClient

class webActi : AppCompatActivity() {
    lateinit var Web :WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)

        val theUrl : String = intent.getStringExtra("myUrl").toString()
        Web = findViewById(R.id.webView1)

        Web.settings.javaScriptEnabled = true
        Web.webViewClient = WebViewClient()

        if(URLUtil.isValidUrl(theUrl))
        {
            Web.loadUrl(theUrl)
        }
        else {
            val myUrl : String = "https://www.google.com/search?q=$theUrl"
            Web.loadUrl(myUrl)
        }
    }

    override fun onBackPressed() {
        if(Web.canGoBack())
        {
            Web.goBack()
        }

        else{
            super.onBackPressed()
        }

    }
}