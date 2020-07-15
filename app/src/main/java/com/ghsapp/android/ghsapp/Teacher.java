package com.ghsapp.android.ghsapp;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Teacher extends AppCompatActivity
{
    ImageButton back;
    Button Aeries;
    Button Aesop;
    Button DistrictSite;
    Button AnnouncementRequest;
    Button Schedule;
    Button Calendar;
    Button map;
    Global global;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        global=((Global)getApplicationContext());
        setTheme(global.getThemes());
        setContentView(R.layout.activity_teacher);
        //back button
        back = findViewById(R.id.BackButton1);
        back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                finish();
            }
        });
        //theme

        //Website Links
        //Aeries
        Aeries = findViewById(R.id.AeriesButton2);
        Aeries.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Teacher.this, WebsiteView.class);
                myIntent.putExtra("WEBSITE_NAME", "Aeries");
                myIntent.putExtra("WEBSITE_URL", "https://aeries.glendora.k12.ca.us/Aeries.NET/Login.aspx?page=default.aspx");
                startActivity(myIntent);
            }
        }));

        //Aesop
        Aesop = findViewById(R.id.AesopButton2);
        Aesop.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Teacher.this, WebsiteView.class);
                myIntent.putExtra("WEBSITE_NAME", "AESOP");
                myIntent.putExtra("WEBSITE_URL", "https://login.frontlineeducation.com/login?signin=4edcf725b144bbd9d14f602c3944bfc6&productId=ABSMGMT&clientId=ABSMGMT#/login");
                startActivity(myIntent);
            }
        }));
        //District Site
        DistrictSite = findViewById(R.id.DistrictSiteButton2);
        DistrictSite.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Teacher.this, WebsiteView.class);
                myIntent.putExtra("WEBSITE_NAME", "District Website");
                myIntent.putExtra("WEBSITE_URL", "https://www.glendora.k12.ca.us/");
                startActivity(myIntent);
            }
        }));

        //Announcement Request
        AnnouncementRequest = findViewById(R.id.AnnouncementRequestButton2);
        AnnouncementRequest.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Teacher.this, WebsiteView.class);
                myIntent.putExtra("WEBSITE_NAME", "Announcement Request");
                myIntent.putExtra("WEBSITE_URL", "https://goo.gl/forms/J95VfIr89Lnj2QpY2");
                startActivity(myIntent);
            }
        }));

        //Schedule
        Schedule = findViewById(R.id.ScheduleButton2);
        Schedule.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Teacher.this, ImageView.class);
                myIntent.putExtra("IMAGE_NAME", "Schedule");
                myIntent.putExtra("IMAGE_FILE_NAME", "Schedule_19.pdf");
                startActivity(myIntent);
            }
        }));

        //Calendar
        Calendar = findViewById(R.id.CalendarButton2);
        Calendar.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Teacher.this, ImageView.class);
                myIntent.putExtra("IMAGE_NAME", "Calendar");
                myIntent.putExtra("IMAGE_FILE_NAME", "OddEvenCalendar_2018.pdf");
                startActivity(myIntent);
            }
        }));

        //map
        map = findViewById(R.id.MapButton2);
        map.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Teacher.this, ImageView.class);
                myIntent.putExtra("IMAGE_NAME", "Map");
                myIntent.putExtra("IMAGE_FILE_NAME", "final full site + easter egg.pdf");
                startActivity(myIntent);
            }
        }));

    }
}
