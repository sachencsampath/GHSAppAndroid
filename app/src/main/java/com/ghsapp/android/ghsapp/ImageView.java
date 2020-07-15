package com.ghsapp.android.ghsapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.github.barteksc.pdfviewer.PDFView;

public class ImageView extends AppCompatActivity {
    ImageButton back;
    Global global;
    PDFView pdfView;
    TextView header;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        global=((Global)getApplicationContext());
        setTheme(global.getThemes());
        setContentView(R.layout.activity_image_view);
        back = findViewById(R.id.BackButton1);
        back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                finish();
            }
        });

        //header
        String imageName = getIntent().getStringExtra("IMAGE_NAME");
        header = findViewById(R.id.ImageHeader);
        header.setText(imageName);


        String imageFileName = getIntent().getStringExtra("IMAGE_FILE_NAME");
        pdfView= findViewById(R.id.pdfView);
        pdfView.fromAsset(imageFileName).load();

    }
}
