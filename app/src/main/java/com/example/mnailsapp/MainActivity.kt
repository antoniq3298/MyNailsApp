package com.example.mnailsapp

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val webView = WebView(this)
        setContentView(webView)

        // Задължително!
        webView.webViewClient = WebViewClient()
        webView.settings.javaScriptEnabled = true

        // Тук сложи линка към Glide страницата
        val url = "https://bold-bells-7849.glide.page"
        webView.loadUrl(url)
    }
}
