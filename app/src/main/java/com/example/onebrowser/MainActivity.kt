package com.example.onebrowser

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button : ImageView = findViewById(R.id.imgSearch)
        var SString : EditText = findViewById(R.id.etString)

//        var btngoogle : ImageView = findViewById(R.id.imgGoogle)
        var btnFB : ImageView = findViewById(R.id.imgFB)
        var btnInsta : ImageView = findViewById(R.id.imgInsta)
        var btnYT : ImageView = findViewById(R.id.imgYT)
        var btnGit : ImageView = findViewById(R.id.imgGit)
        var btnAmazon : ImageView = findViewById(R.id.imgAmazon)


        button.setOnClickListener()
        {
            var page2 : Intent = Intent(this , webActi::class.java)
             page2.putExtra("myUrl",SString.text.toString())
            startActivity(page2)
        }
        btnGit.setOnClickListener()
        {
            var page2 : Intent = Intent(this , webActi::class.java)
            page2.putExtra("myUrl","https://github.com")
            startActivity(page2)
        }
        btnFB.setOnClickListener()
        {
            var page2 : Intent = Intent(this , webActi::class.java)
            page2.putExtra("myUrl","https://facebook.com")
            startActivity(page2)
        }
        btnInsta.setOnClickListener()
        {
            var page2 : Intent = Intent(this , webActi::class.java)
            page2.putExtra("myUrl","https://Instagram.com")
            startActivity(page2)
        }
        btnYT.setOnClickListener()
        {
            var page2 : Intent = Intent(this , webActi::class.java)
            page2.putExtra("myUrl","https://YouTube.com")
            startActivity(page2)
        }
//        btngoogle.setOnClickListener()
//        {
//            var page2 : Intent = Intent(this , webActi::class.java)
//            page2.putExtra("myUrl","https://google.com")
//            startActivity(page2)
//        }
        btnAmazon.setOnClickListener()
        {
            var page2 : Intent = Intent(this , webActi::class.java)
            page2.putExtra("myUrl","https://Amazon.com")
            startActivity(page2)
        }


        var web2 : WebView = findViewById(R.id.wether)

        web2.webViewClient = WebViewClient()
        web2.settings.javaScriptEnabled = true

        web2.loadUrl("https://weather.com/en-IN/weather/today/l/21.12,79.07?par=google")


    }

}