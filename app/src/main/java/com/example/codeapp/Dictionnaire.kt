package com.example.codeapp

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ProgressBar
import android.widget.TextView

class Dictionnaire : AppCompatActivity() {

    lateinit var progressB: ProgressBar;
    lateinit var dico: WebView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dictionnaire)

        progressB = findViewById(R.id.progressB)
        dico = findViewById(R.id.webViewDicto)

        val message:String= intent.getStringExtra("message_key01")
        dico.webViewClient = object :WebViewClient(){
            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                super.onPageStarted(view, url, favicon)
                if (view != null) {
                    view.visibility = View.VISIBLE
                }
                progressB.visibility = View.VISIBLE
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                if (view != null) {
                    view.visibility = View.VISIBLE
                }
                progressB.visibility = View.INVISIBLE
            }
        }
        dico.loadUrl("https://www.larousse.fr/dictionnaires/francais/$message")
        dico.settings.javaScriptEnabled = true
        dico.settings.setSupportZoom(true)


    }
}