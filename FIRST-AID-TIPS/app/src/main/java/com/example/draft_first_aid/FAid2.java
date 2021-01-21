package com.example.draft_first_aid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FAid2 extends AppCompatActivity {
     Button backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f_aid2);
        backButton = findViewById(R.id.button8);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbackButton();
            }
        });
    }
    public void openbackButton() {
        Intent intent = new Intent(this, FirstAid.class);
        startActivity(intent);
    }
}