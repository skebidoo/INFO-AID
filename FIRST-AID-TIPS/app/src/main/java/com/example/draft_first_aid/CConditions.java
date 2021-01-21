package com.example.draft_first_aid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.camera2.params.MandatoryStreamCombination;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CConditions extends AppCompatActivity {

    Button backButton;
    TextView Fever, FSeizures, Seizures, Fainting, SThroat, Croup, BEyes, NBleed, MSickness, HPressure, PAttacks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_conditions);

        Fever = findViewById(R.id.textView11);
        FSeizures = findViewById(R.id.textView12);
        Seizures = findViewById(R.id.textView13);
        Fainting = findViewById(R.id.textView14);
        SThroat = findViewById(R.id.textView15);
        Croup = findViewById(R.id.textView16);
        BEyes = findViewById(R.id.textView17);
        NBleed = findViewById(R.id.textView18);
        MSickness = findViewById(R.id.textView19);
        HPressure = findViewById(R.id.textView20);
        PAttacks = findViewById(R.id.textView21);

        Fever.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFever();
            }
        });

        FSeizures.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFSeizures();
            }
        });

        Seizures.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSeizures();
            }
        });

        Fainting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFainting();
            }
        });

        SThroat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSThroat();
            }
        });

        Croup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCroup();
            }
        });

        BEyes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBEyes();
            }
        });

        NBleed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNBleed();
            }
        });

        MSickness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMSickness();
            }
        });

        HPressure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHPressure();
            }
        });

        PAttacks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPAttacks();
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });
    }

    public void openFever() {
        Intent intent = new Intent (this, CConditions1.class);
        startActivity(intent);
    }

    public void openFSeizures() {
        Intent intent = new Intent (this, CConditions2.class);
        startActivity(intent);
    }

    public void openSeizures() {
        Intent intent = new Intent (this, CConditions3.class);
        startActivity(intent);
    }

    public void openFainting() {
        Intent intent = new Intent (this, CConditions4.class);
        startActivity(intent);
    }

    public void openSThroat() {
        Intent intent = new Intent (this, CConditions5.class);
        startActivity(intent);
    }

    public void openCroup() {
        Intent intent = new Intent (this, CConditions6.class);
        startActivity(intent);
    }

    public void openBEyes() {
        Intent intent = new Intent (this, CConditions7.class);
        startActivity(intent);
    }

    public void openNBleed() {
        Intent intent = new Intent (this, CConditions8.class);
        startActivity(intent);
    }

    public void openMSickness() {
        Intent intent = new Intent (this, CConditions9.class);
        startActivity(intent);
    }

    public void openHPressure() {
        Intent intent = new Intent (this, CConditions10.class);
        startActivity(intent);
    }

    public void openPAttacks() {
        Intent intent = new Intent (this, CConditions11.class);
        startActivity(intent);
    }

    public void openMainActivity() {
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }
}