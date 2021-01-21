package com.example.draft_first_aid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InHome extends AppCompatActivity {

    Button backButton;
    TextView Cuts, PWounds, ICuts, TInjuries, DEmergencies, EInjury, FPoisoning, AReactions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_home);

        backButton = (Button) findViewById(R.id.button4);
        Cuts = findViewById(R.id.textView16);
        PWounds = findViewById(R.id.textView17);
        ICuts = findViewById(R.id.textView18);
        TInjuries = findViewById(R.id.textView19);
        DEmergencies = findViewById(R.id.textView20);
        EInjury = findViewById(R.id.textView21);
        FPoisoning = findViewById(R.id.textView22);
        AReactions = findViewById(R.id.textView23);

        Cuts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCuts();
            }
        });

        PWounds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPWounds();
            }
        });

        ICuts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openICuts();
            }
        });

        TInjuries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTInjuries();
            }
        });

        DEmergencies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDEmergencies();
            }
        });

        EInjury.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEInjury();
            }
        });

        FPoisoning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFPoisoning();
            }
        });

        AReactions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAReactions();
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBackButtonActivity();
            }
        });
    }

    public void openBackButtonActivity() {
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }

    public void openCuts() {
        Intent intent = new Intent (this, IHome1.class);
        startActivity(intent);
    }

    public void openPWounds() {
        Intent intent = new Intent (this, IHome2.class);
        startActivity(intent);
    }

    public void openICuts() {
        Intent intent = new Intent (this, IHome3.class);
        startActivity(intent);
    }

    public void openTInjuries() {
        Intent intent = new Intent (this, IHome4.class);
        startActivity(intent);
    }

    public void openDEmergencies() {
        Intent intent = new Intent (this, IHome5.class);
        startActivity(intent);
    }

    public void openEInjury() {
        Intent intent = new Intent (this, IHome6.class);
        startActivity(intent);
    }

    public void openFPoisoning() {
        Intent intent = new Intent (this, IHome7.class);
        startActivity(intent);
    }

    public void openAReactions() {
        Intent intent = new Intent (this, IHome8.class);
        startActivity(intent);
    }
}