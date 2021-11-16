package com.example.news;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.webkit.WebView;

public class webview extends AppCompatActivity {
   private Toolbar toolbar;
   private WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        toolbar_method();
        web_method();

    }
    private void toolbar_method()
    {
        toolbar=findViewById(R.id.webview_toolbar);
        setSupportActionBar(toolbar);
    }
    private void web_method()
    {
        webview=findViewById(R.id.webview);
        String url=getIntent().getStringExtra("url");
        webview.loadUrl(url);
    }
}