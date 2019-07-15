package com.runner.alc;

import android.net.http.SslError;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityB  extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        WebView mywebview = findViewById(R.id.aboutWebView);

        mywebview.setWebViewClient(new WebViewClient());
        WebSettings settings = mywebview.getSettings();
        settings.setSupportMultipleWindows(true);
        settings.getJavaScriptEnabled();

        mywebview.getSettings().setJavaScriptEnabled(true);
        mywebview.getSettings().setSupportZoom(true);

mywebview.setWebViewClient(new WebViewClient(){
    @Override
    public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        handler.proceed();
    }
});
        mywebview.loadUrl("https://andela.com/alc");
    }


}

