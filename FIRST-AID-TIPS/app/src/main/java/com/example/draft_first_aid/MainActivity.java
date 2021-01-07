package com.example.draft_first_aid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView firstAidButton, inHomeButton, EResponseButton;
    Button exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstAidButton = (ImageView) findViewById(R.id.imageView4);
        inHomeButton = (ImageView) findViewById(R.id.imageView5);
        EResponseButton = (ImageView) findViewById(R.id.imageView6);
        exit = (Button) findViewById(R.id.button3);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               System.exit(100);
            }
        });

        firstAidButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFirstAidActivity();
            }
        });

        inHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInHomeActivity();
            }
        });

        EResponseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEResponseActivity();
            }
        });

    }

    public void  openFirstAidActivity() {
        Intent intent = new Intent (this, FirstAid.class);
        startActivity(intent);
    }

    public  void openInHomeActivity() {
        Intent intent = new Intent (this, InHome.class);
        startActivity(intent);
    }

    public void openEResponseActivity() {
        Intent intent = new Intent (this, EResponse.class);
        startActivity(intent);

    }
}