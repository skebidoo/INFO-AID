package com.example.draft_first_aid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AEvents extends AppCompatActivity {

    Button backButton;
    TextView Burns, SBurn, EInjury, HTrauma, HPain, APain, NVomiting, AAttack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_events);

        Burns = findViewById(R.id.textView11);
        SBurn = findViewById(R.id.textView12);
        EInjury = findViewById(R.id.textView13);
        HTrauma = findViewById(R.id.textView14);
        HPain = findViewById(R.id.textView15);
        APain = findViewById(R.id.textView16);
        NVomiting = findViewById(R.id.textView17);
        AAttack = findViewById(R.id.textView18);
        backButton = findViewById(R.id.button);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });

        Burns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBurnsActivity();
            }
        });

        SBurn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSBurnActivity();
            }
        });

        EInjury.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEInjuryActivity();
            }
        });

        HTrauma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHTraumaActivity();
            }
        });

        HPain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHPainActivity();
            }
        });

        APain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAPainActivity();
            }
        });

        NVomiting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNVomitingActivity();
            }
        });

        AAttack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAAttackActivity();
            }
        });
    }

    public void openBurnsActivity() {
        Intent intent = new Intent (this, AEvents1.class);
        startActivity(intent);
    }

    public void openSBurnActivity() {
        Intent intent = new Intent (this, AEvents2.class);
        startActivity(intent);
    }

    public void openEInjuryActivity() {
        Intent intent = new Intent (this, AEvents3.class);
        startActivity(intent);
    }

    public void openHTraumaActivity() {
        Intent intent = new Intent (this, AEvents4.class);
        startActivity(intent);
    }

    public void openHPainActivity() {
        Intent intent = new Intent (this, AEvents5.class);
        startActivity(intent);
    }

    public void openAPainActivity() {
        Intent intent = new Intent (this, AEvents6.class);
        startActivity(intent);
    }

    public void openNVomitingActivity() {
        Intent intent = new Intent (this, AEvents7.class);
        startActivity(intent);
    }

    public void openAAttackActivity() {
        Intent intent = new Intent (this, AEvents8.class);
        startActivity(intent);
    }

    public void openMainActivity() {
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }
}