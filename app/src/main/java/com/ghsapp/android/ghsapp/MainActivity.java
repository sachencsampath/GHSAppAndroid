package com.ghsapp.android.ghsapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    Global global;
    ImageButton ghs;
    Button student;
    Button teacher;
    Button tartanEvents;
    Button contact;
    Button other;
    AlertDialog.Builder alertDialog;

    @Override
    public void onBackPressed() {
        finishAffinity();
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        global=((Global)getApplicationContext());
        setTheme(global.getThemes());
        setContentView(R.layout.activity_main);
//
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
        ghs = findViewById(R.id.ghs);
        ghs = findViewById(R.id.ghs);

        ghs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                global = ((Global) getApplicationContext());
                global.increase();

                SharedPreferences.Editor editor = getSharedPreferences("AppPrefs", MODE_PRIVATE).edit();
                editor.putInt("AppTheme", global.getCounter());
                editor.apply();

                finish();
                overridePendingTransition(0, 0);
                startActivity(getIntent());
                overridePendingTransition(0, 0);
            }
        });

        student = findViewById(R.id.StudentsButton);
        student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, Student.class);
                startActivity(myIntent);
            }
        });

        teacher = findViewById(R.id.TeacherButton);
        teacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, Teacher.class);
                startActivity(myIntent);
            }
        });

        tartanEvents = findViewById(R.id.TartanEvents);
        tartanEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, Calender.class);
                startActivity(myIntent);
            }
        });
        contact = findViewById(R.id.ContactButton);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, Contact.class);
                startActivity(myIntent);
            }
        });
        other = findViewById(R.id.OtherButton);
        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, other.class);
                startActivity(myIntent);
            }
        });
    }
}

