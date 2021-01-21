package com.example.draft_first_aid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ORoad extends AppCompatActivity {

    Button backButton;
    TextView FResponder, KCar, GState, HCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o_road);

        FResponder = findViewById(R.id.textView11);
        KCar = findViewById(R.id.textView12);
        GState = findViewById(R.id.textView13);
        HCar = findViewById(R.id.textView14);
        backButton = findViewById(R.id.button);

        FResponder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFResponder();
            }
        });

        KCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openKCar();
            }
        });

        GState.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGState();
            }
        });

        HCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHCar();
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });
    }

    public void openFResponder() {
        Intent intent = new Intent (this, ORoad1.class);
        startActivity(intent);
    }

    public void openKCar() {
        Intent intent = new Intent (this, ORoad2.class);
        startActivity(intent);
    }

    public void openGState() {
        Intent intent = new Intent (this, ORoad3.class);
        startActivity(intent);
    }

    public void openHCar() {
        Intent intent = new Intent (this, ORoad4.class);
        startActivity(intent);
    }

    public void openMainActivity() {
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }
}