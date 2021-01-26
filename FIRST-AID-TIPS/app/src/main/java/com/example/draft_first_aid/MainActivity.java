package com.example.draft_first_aid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView firstAidButton, inHomeButton, EResponseButton, AEventsButton, ORoadButton, FWorkButton, SIncidentsButton, CConditionsButton, ATipsButton;
    Button exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        firstAidButton = (ImageView) findViewById(R.id.imageView4);
        inHomeButton = (ImageView) findViewById(R.id.imageView5);
        EResponseButton = (ImageView) findViewById(R.id.imageView6);
        AEventsButton = (ImageView) findViewById(R.id.imageView7);
        ORoadButton = (ImageView) findViewById(R.id.imageView8);
        FWorkButton = (ImageView) findViewById(R.id.imageView9);
        SIncidentsButton = (ImageView) findViewById(R.id.imageView10);
        CConditionsButton = (ImageView) findViewById(R.id.imageView11);
        ATipsButton = (ImageView) findViewById(R.id.imageView12);
        exit = (Button) findViewById(R.id.button3);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                finishAffinity();
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

        AEventsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAEventsActivity();
            }
        });

        ORoadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openORoadActivity();
            }
        });

        FWorkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFWorkActivity();
            }
        });

        SIncidentsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSIncidentsActivity();
            }
        });

        CConditionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCConditionActivity();
            }
        });

        ATipsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openATipsactivity();
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

    public void openAEventsActivity() {
        Intent intent = new Intent (this, AEvents.class);
        startActivity(intent);
    }

    public void openORoadActivity() {
        Intent intent = new Intent (this, ORoad.class);
        startActivity(intent);
    }

    public void openFWorkActivity() {
        Intent intent = new Intent (this, FWork.class);
        startActivity(intent);
    }

    public void openSIncidentsActivity() {
        Intent intent = new Intent (this, SIncidents.class);
        startActivity(intent);
    }

    public void openCConditionActivity() {
        Intent intent = new Intent (this, CCondition.class);
        startActivity(intent);
    }

    public void openATipsactivity() {
        Intent intent = new Intent (this, ATips.class);
        startActivity(intent);
    }
}