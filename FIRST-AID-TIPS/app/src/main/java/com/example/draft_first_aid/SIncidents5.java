package com.example.draft_first_aid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SIncidents5 extends AppCompatActivity {

    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_incidents5);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        backButton = findViewById(R.id.button13);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbackButton();
            }
        });
    }

    public void openbackButton() {
        Intent intent = new Intent(this, SIncidents.class);
        startActivity(intent);
    }
}