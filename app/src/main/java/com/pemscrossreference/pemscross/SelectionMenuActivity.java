package com.pemscrossreference.pemscross;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectionMenuActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_menu);

        button = (Button) findViewById(R.id.goToCrossButton);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                GoToCrossActivity();
            }
        });

    }

    public void GoToCrossActivity(){
        Intent intent = new Intent(this,CrossReferenceActivity.class );
        startActivity(intent);
    }

}