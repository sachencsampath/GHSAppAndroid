package com.ghsapp.android.ghsapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Student extends AppCompatActivity
{
    Global global;

    ImageButton back;

    Button Aeries;
    Button AnnouncementRequest;
    Button SocialMedia;
    Button APTesting;
    Button Calendar;
    Button Schedule;
    Button Map;
    Button Classroom;
    Button Naviance;
    Button Athletics;
    Button CollegeBoard;
    Button Tutorcom;
    Button BandAndPag;
    Button StudentStore;
    Button TeacherSearch;
    Button Turnitin;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        global=((Global)getApplicationContext());
        setTheme(global.getThemes());
        setContentView(R.layout.activity_student);
        back = findViewById(R.id.BackButton1);
        back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                finish();
            }
        });

        //Website Links
        //Aeries
        Aeries = findViewById(R.id.AeriesButton);
        Aeries.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Student.this, WebsiteView.class);
                myIntent.putExtra("WEBSITE_NAME", "Aeries");
                myIntent.putExtra("WEBSITE_URL", "https://aeries.glendora.k12.ca.us/ParentPortal/LoginParent.aspx?page=default.aspx");
                startActivity(myIntent);
            }
        }));

         //tartan daily

        //announcement request
        AnnouncementRequest = findViewById(R.id.AnnouncementRequest);
        AnnouncementRequest.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Student.this, WebsiteView.class);
                myIntent.putExtra("WEBSITE_NAME", "Announcement Request");
                myIntent.putExtra("WEBSITE_URL", "https://goo.gl/forms/J95VfIr89Lnj2QpY2");
                startActivity(myIntent);
            }
        }));

        //social media
        SocialMedia = findViewById(R.id.SocialMedia);
        SocialMedia.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Student.this, SocialMedia.class);
                startActivity(myIntent);
            }
        }));

        //AP Testing
        APTesting = findViewById(R.id.ApTestingButton);
        APTesting.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Student.this, APTesting.class);
                startActivity(myIntent);
            }
        }));

        //calendar
        Calendar = findViewById(R.id.CalendarButton);
        Calendar.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Student.this, ImageView.class);
                myIntent.putExtra("IMAGE_NAME", "Calendar");
                myIntent.putExtra("IMAGE_FILE_NAME", "OddEvenCalendar_2018.pdf");
                startActivity(myIntent);
            }
        }));

        //schedule
        Schedule = findViewById(R.id.ScheduleButton);
        Schedule.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Student.this, ImageView.class);
                myIntent.putExtra("IMAGE_NAME", "Schedule");
                myIntent.putExtra("IMAGE_FILE_NAME", "Schedule_19.pdf");
                startActivity(myIntent);
            }
        }));

        //map
        Map = findViewById(R.id.MapButton);
        Map.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Student.this, ImageView.class);
                myIntent.putExtra("IMAGE_NAME", "Map");
                myIntent.putExtra("IMAGE_FILE_NAME", "final full site + easter egg.pdf");
                startActivity(myIntent);
            }
        }));

        //classroom
        Classroom = findViewById(R.id.ClassroomButton);
        Classroom.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://classroom.google.com"));
                try {
                    Intent appIntent = getPackageManager().getLaunchIntentForPackage("com.google.android.apps.classroom");
                    startActivity(appIntent);
                } catch (NullPointerException ex) {
                    Intent myIntent = new Intent(Student.this, WebsiteView.class);
                    myIntent.putExtra("WEBSITE_NAME", "Google Classroom");
                    myIntent.putExtra("WEBSITE_URL", "https://classroom.google.com");
                    startActivity(myIntent);
                }
            }

        });
        //Teacher Search
        TeacherSearch = findViewById(R.id.TeacherSearch);
        TeacherSearch.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Student.this, TeacherSearch.class);
                startActivity(myIntent);
            }
        }));

        //turnitin.com
        Turnitin = findViewById(R.id.TurnitinButton);
        Turnitin.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Student.this, WebsiteView.class);
                myIntent.putExtra("WEBSITE_NAME", "turnitin.com");
                myIntent.putExtra("WEBSITE_URL", "https://www.turnitin.com/login_page.asp?lang=en_us");
                startActivity(myIntent);
            }
        }));

        //naviance
        Naviance = findViewById(R.id.NavianceButton);
        Naviance.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Student.this, WebsiteView.class);
                myIntent.putExtra("WEBSITE_NAME", "Naviance");
                myIntent.putExtra("WEBSITE_URL", "https://student.naviance.com/glen");
                startActivity(myIntent);
            }
        }));

        Athletics = findViewById(R.id.AthleticsButton);
        Athletics.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Student.this, WebsiteView.class);
                myIntent.putExtra("WEBSITE_NAME", "Athletics");
                myIntent.putExtra("WEBSITE_URL", "https://glendoraathletics.com/");
                startActivity(myIntent);
            }
        }));

        //collegeboard
        CollegeBoard = findViewById(R.id.CollegeBoardButton);
        CollegeBoard.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Student.this, WebsiteView.class);
                myIntent.putExtra("WEBSITE_NAME", "College Board");
                myIntent.putExtra("WEBSITE_URL", "https://www.collegeboard.org/");
                startActivity(myIntent);
            }
        }));

        BandAndPag = findViewById(R.id.BandAndPagButton);
        BandAndPag.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Student.this, WebsiteView.class);
                myIntent.putExtra("WEBSITE_NAME", "Band & Pag.");
                myIntent.putExtra("WEBSITE_URL", "https://www.leaguelineup.com/calendar.asp?url=ghstartanband");
                startActivity(myIntent);
            }
        }));

        //tutor.com
        Tutorcom = findViewById(R.id.TutorcomButton);
        Tutorcom.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Student.this, WebsiteView.class);
                myIntent.putExtra("WEBSITE_NAME", "Tutor.com");
                myIntent.putExtra("WEBSITE_URL", "https://lhh.tutor.com/?ProgramGUID=0dfda8cc-9f9e-4c9f-b88a-5b337887fdff");
                startActivity(myIntent);
            }
        }));

        //student store
        StudentStore = findViewById(R.id.StudentStoreButton);
        StudentStore.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Student.this, WebsiteView.class);
                myIntent.putExtra("WEBSITE_NAME", "Student Store");
                myIntent.putExtra("WEBSITE_URL", "https://glendorahighschool.myschoolcentral.com/asbworks/(S(pu4i0x25m52p5oduhuqljuvr))/apps/webstore/pages/WebStore.aspx?org=9701");
                startActivity(myIntent);
            }
        }));
    }
}
