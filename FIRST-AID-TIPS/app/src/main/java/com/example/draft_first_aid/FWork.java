package com.example.draft_first_aid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.TestLooperManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FWork extends AppCompatActivity {

    Button backButton;
    TextView HWorkplace, PWorkplace, SWorkplace, WStation, KKit, CWork;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f_work);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        HWorkplace = findViewById(R.id.textView11);
        PWorkplace = findViewById(R.id.textView12);
        SWorkplace = findViewById(R.id.textView13);
        WStation = findViewById(R.id.textView14);
        KKit = findViewById(R.id.textView15);
        CWork = findViewById(R.id.textView16);
        backButton = findViewById(R.id.button);

        HWorkplace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHWork();
            }
        });

        PWorkplace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPWork();
            }
        });

        SWorkplace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSWork();
            }
        });

        WStation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWStation();
            }
        });

        KKit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openKKit();
            }
        });

        CWork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCWork();
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });
    }

    public void openHWork() {
        Intent intent = new Intent (this, FWork1.class);
        startActivity(intent);
    }

    public void openPWork() {
        Intent intent = new Intent (this, FWork2.class);
        startActivity(intent);
    }

    public void openSWork() {
        Intent intent = new Intent (this, FWork3.class);
        startActivity(intent);
    }

    public void openWStation() {
        Intent intent = new Intent (this, FWork4.class);
        startActivity(intent);
    }

    public void openKKit(){
        Intent intent = new Intent (this, FWork5.class);
        startActivity(intent);
    }

    public void openCWork() {
        Intent intent = new Intent (this, FWork6.class);
        startActivity(intent);
    }

    public void openMainActivity() {
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }
}