package com.example.draft_first_aid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SIncidents extends AppCompatActivity {

    Button backButton;
    TextView Bleeding, ITrauma, PTrauma, Stroke, Poisoning, DOverdose, NDrowning, CPoisoning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_incidents);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        Bleeding = findViewById(R.id.textView11);
        ITrauma = findViewById(R.id.textView12);
        PTrauma = findViewById(R.id.textView13);
        Stroke = findViewById(R.id.textView14);
        Poisoning = findViewById(R.id.textView15);
        DOverdose = findViewById(R.id.textView16);
        NDrowning = findViewById(R.id.textView17);
        CPoisoning = findViewById(R.id.textView18);
        backButton = findViewById(R.id.button);

        Bleeding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBleeding();
            }
        });

        ITrauma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openITrauma();
            }
        });

        PTrauma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPTrauma();
            }
        });

        Stroke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStroke();
            }
        });

        Poisoning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPoisoning();
            }
        });

        DOverdose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDOverdose();
            }
        });

        NDrowning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNDrowning();
            }
        });

        CPoisoning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCPoisoning();
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });
    }

    public void openBleeding() {
        Intent intent = new Intent (this, SIncidents1.class);
        startActivity(intent);
    }

    public void openITrauma() {
        Intent intent = new Intent (this, SIncidents2.class);
        startActivity(intent);
    }

    public void openPTrauma() {
        Intent intent = new Intent (this, SIncidents3.class);
        startActivity(intent);
    }

    public void  openStroke() {
        Intent intent = new Intent (this, SIncidents4.class);
        startActivity(intent);
    }

    public void openPoisoning() {
        Intent intent = new Intent (this, SIncidents5.class);
        startActivity(intent);
    }

    public void openDOverdose() {
        Intent intent = new Intent (this, SIncidents6.class);
        startActivity(intent);
    }

    public void openNDrowning() {
        Intent intent = new Intent (this, SIncidents7.class);
        startActivity(intent);
    }

    public void openCPoisoning() {
        Intent intent = new Intent (this, SIncidents8.class);
        startActivity(intent);
    }

    public void openMainActivity() {
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }
}