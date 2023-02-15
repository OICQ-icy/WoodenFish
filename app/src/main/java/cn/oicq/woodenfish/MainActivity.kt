package cn.oicq.woodenfish

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val webView: WebView = findViewById(R.id.web_view)
        webView.settings.javaScriptEnabled = true   // 启用WebView的JS
        webView.loadUrl("file:///android_asset/woodenFish/index.html")  // 加载本地HTML
    }
}