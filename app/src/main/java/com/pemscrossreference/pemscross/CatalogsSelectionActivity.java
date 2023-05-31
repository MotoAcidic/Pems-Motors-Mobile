package com.pemscrossreference.pemscross;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class CatalogsSelectionActivity extends AppCompatActivity {

    private WebView webView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogs);


        // Button for navigation
        button = (Button) findViewById(R.id.backToMainMenuButton);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                GoToSelectionMenuActivity();
            }
        });

        // Start for the web view of cross reference
        webView=(WebView) findViewById(R.id.webview);
        webView.loadUrl("https://www.pemsmotors.com/cross");
        webView.setWebViewClient(new WebViewClient());
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    public void GoToSelectionMenuActivity(){
        Intent intent = new Intent(this,SelectionMenuActivity.class );
        startActivity(intent);
    }

    private class webClient extends WebViewClient{

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            return super.shouldOverrideUrlLoading(view, request);
        }

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon){
            super.onPageStarted(view,url,favicon);
        }


    }

    @Override
    public void onBackPressed() {
        if(webView.isFocused() && webView.canGoBack())
        {
            webView.goBack();
        }else{
            super.onBackPressed();
        }
    }
    }
}