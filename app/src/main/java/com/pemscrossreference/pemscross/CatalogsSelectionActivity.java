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
    Button mainMenuButton, accessoriesButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogs);

        // Button for navigation
        mainMenuButton = (Button) findViewById(R.id.backToMainMenuButton2);
        accessoriesButton = (Button) findViewById(R.id.accessoriesButton);

        mainMenuButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                GoToSelectionMenuActivity();
            }
        });

        accessoriesButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                GoToCatalogAccessoriesActivity();
            }
        });

    }

    public void GoToSelectionMenuActivity(){
        Intent intent = new Intent(this,SelectionMenuActivity.class );
        startActivity(intent);
    }

    public void GoToCatalogAccessoriesActivity(){
        Intent intent = new Intent(this, CatalogAccessoriesActivity.class );
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
