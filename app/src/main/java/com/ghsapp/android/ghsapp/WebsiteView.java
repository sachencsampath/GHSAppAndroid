package com.ghsapp.android.ghsapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.TextView;

public class WebsiteView extends AppCompatActivity {
    ImageButton back;
    TextView header;
    Global global;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //theme
        global=((Global)getApplicationContext());
        setTheme(global.getThemes());
        setContentView(R.layout.activity_website_view);

        //back button
        back = findViewById(R.id.BackButton1);
        back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                finish();
            }
        });

        //header
        String websiteName = getIntent().getStringExtra("WEBSITE_NAME");
        header = findViewById(R.id.WebsiteHeader);
        header.setText(websiteName);

        //web view code
        String url = getIntent().getStringExtra("WEBSITE_URL");
        WebView myWebView = findViewById(R.id.webview);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl(url);
        myWebView.getSettings().setJavaScriptEnabled(true);
        CookieManager.getInstance().setAcceptCookie(true);
    }
}

