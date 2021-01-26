package com.example.draft_first_aid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EResponse extends AppCompatActivity {

    Button backButton;
    TextView HCpr, TAid, BAed, RPosition, SAttack, Choking, SObjects, MShocks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e_response);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        backButton = (Button) findViewById(R.id.button);
        HCpr = findViewById(R.id.textView11);
        TAid = findViewById(R.id.textView12);
        BAed = findViewById(R.id.textView13);
        RPosition = findViewById(R.id.textView14);
        SAttack = findViewById(R.id.textView15);
        Choking = findViewById(R.id.textView16);
        SObjects = findViewById(R.id.textView17);
        MShocks = findViewById(R.id.textView18);

        HCpr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             openHCpr();
            }
        });

        TAid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTAid();
            }
        });

        BAed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBAed();
            }
        });

        RPosition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRPosition();
            }
        });

        SAttack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSAttack();
            }
        });

        Choking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChoking();
            }
        });

        SObjects.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSObjects();
            }
        });

        MShocks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMShocks();
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBackButtonActivity();
                }
        });
    }

    public void openHCpr() {
        Intent intent = new Intent (this, EResponse1.class);
        startActivity(intent);
    }

    public void openTAid() {
        Intent intent = new Intent (this, EResponse2.class);
        startActivity(intent);
    }

    public void openBAed() {
        Intent intent = new Intent (this, EResponse3.class);
        startActivity(intent);
    }

    public void openRPosition() {
        Intent intent = new Intent (this, EResponse4.class);
        startActivity(intent);
    }

    public void openSAttack() {
        Intent intent = new Intent (this, EResponse5.class);
        startActivity(intent);
    }

    public void openChoking() {
        Intent intent = new Intent (this, EResponse6.class);
        startActivity(intent);
    }

    public void openSObjects() {
        Intent intent = new Intent (this, EResponse7.class);
        startActivity(intent);
    }

    public void openMShocks() {
        Intent intent = new Intent (this, EResponse8.class);
        startActivity(intent);
    }

    public void openBackButtonActivity() {
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }
}