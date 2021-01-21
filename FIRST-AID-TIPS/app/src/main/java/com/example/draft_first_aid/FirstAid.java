package com.example.draft_first_aid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstAid extends AppCompatActivity {

    Button backButton;
    TextView dontpanic, proper, gathering, calling, universal, training;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_aid);

        dontpanic = findViewById(R.id.textView11);
        proper = findViewById(R.id.textView12);
        gathering = findViewById(R.id.textView14);
        calling = findViewById(R.id.textView13);
        universal = findViewById(R.id.textView15);
        training = findViewById(R.id.textView16);
        backButton = (Button) findViewById(R.id.button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBackButtonActivity();
            }
        });
        dontpanic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFAid1();
            }
        });
        proper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFAid2();
            }
        });
        gathering.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFAid3();
            }
        });
        calling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFAid4();
            }
        });
        universal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFAid5();
            }
        });
        training.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFAid6();
            }
        });

    }

    public void openBackButtonActivity() {
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }
    public void openFAid1() {
        Intent intent = new Intent (this, FAid1.class);
        startActivity(intent);
    }
    public void openFAid2() {
        Intent intent = new Intent (this, FAid2.class);
        startActivity(intent);
    }
    public void openFAid3() {
        Intent intent = new Intent (this, FAid3.class);
        startActivity(intent);
    }
    public void openFAid4() {
        Intent intent = new Intent (this, FAid4.class);
        startActivity(intent);
    }
    public void openFAid5() {
        Intent intent = new Intent (this, FAid5.class);
        startActivity(intent);
    }
    public void openFAid6() {
        Intent intent = new Intent (this, faid6.class);
        startActivity(intent);
    }


}