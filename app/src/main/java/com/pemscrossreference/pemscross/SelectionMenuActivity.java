package com.pemscrossreference.pemscross;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectionMenuActivity extends AppCompatActivity {

    Button crossButton, catalogButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_menu);

        crossButton = (Button) findViewById(R.id.goToCrossButton);
        catalogButton = (Button) findViewById(R.id.goToCatalogButton);

        crossButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                GoToCrossActivity();
            }
        });

        catalogButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                GoToCatalogActivity();
            }
        });

    }

    public void GoToCrossActivity(){
        Intent intent = new Intent(this,CrossReferenceActivity.class );
        startActivity(intent);
    }

    public void GoToCatalogActivity(){
        Intent intent = new Intent(this, CatalogsSelectionActivity.class );
        startActivity(intent);
    }
}