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

public class CatalogAccessoriesActivity extends AppCompatActivity {

    private WebView webView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog_accessories);

        // Button for navigation
        button = (Button) findViewById(R.id.backToMainMenuButton3);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                GoToSelectionMenuActivity();
            }
        });

        // Start for the web view of cross reference
        String pdfViewerURL = "https://drive.google.com/viewerng/viewer?embedded=true&url=";
        WebView webview = (WebView) findViewById(R.id.webview);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setSupportZoom(true);
        String pdfURL = "https://www.pemsmotors.com/wp-content/uploads/AccessoryCatalogWeb-2.pdf";
        String url = pdfViewerURL + pdfURL;
        webview.loadUrl(url);
    }

    public void GoToSelectionMenuActivity(){
        Intent intent = new Intent(this,SelectionMenuActivity.class );
        startActivity(intent);
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