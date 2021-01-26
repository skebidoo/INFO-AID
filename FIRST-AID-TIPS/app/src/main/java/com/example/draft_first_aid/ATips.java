package com.example.draft_first_aid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ATips extends AppCompatActivity {

    Button backButton;
    TextView WSafety, Bicycling, HaSafety, HoSafety;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_tips);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        WSafety = findViewById(R.id.textView11);
        Bicycling = findViewById(R.id.textView12);
        HaSafety = findViewById(R.id.textView13);
        HoSafety = findViewById(R.id.textView14);
        backButton = findViewById(R.id.button);

        WSafety.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWSafetyAct();
            }
        });

        Bicycling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBicyclingAct();
            }
        });

        HaSafety.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHaSafetyAct();
            }
        });

        HoSafety.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHoSafetyAct();
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();

            }
        });
    }

    public void openWSafetyAct() {
        Intent intent = new Intent (this, ATips1.class);
        startActivity(intent);
    }

    public void openBicyclingAct() {
        Intent intent = new Intent (this, ATips2.class);
        startActivity(intent);
    }

    public void openHaSafetyAct() {
        Intent intent = new Intent (this, ATips3.class);
        startActivity(intent);
    }

    public void openHoSafetyAct() {
        Intent intent = new Intent (this, ATips4.class);
        startActivity(intent);
    }

    public void openMainActivity() {
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }
}