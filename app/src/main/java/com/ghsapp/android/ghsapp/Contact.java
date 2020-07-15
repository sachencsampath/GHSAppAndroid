package com.ghsapp.android.ghsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;



public class Contact extends AppCompatActivity {
    Global global;
    Button absence;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        global=((Global)getApplicationContext());
        setTheme(global.getThemes());
        setContentView(R.layout.activity_contact);
        TextView call = findViewById(R.id.callSchool);
            call.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text = findViewById(R.id.addressGoTo);
             text.setMovementMethod(LinkMovementMethod.getInstance());
             TextView webLink = findViewById(R.id.webLink);
             webLink.setMovementMethod(LinkMovementMethod.getInstance());

        absence = findViewById(R.id.absenceButton);
        absence.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Contact.this, ImageView.class);
                myIntent.putExtra("IMAGE_NAME", "GHS Absence Policy");
                myIntent.putExtra("IMAGE_FILE_NAME", "ghsAbsence.pdf");
                startActivity(myIntent);
            }
        }));

        back = findViewById(R.id.BackButton1);
        back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                finish();
            }
        });
    }
}
