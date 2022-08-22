package com.example.c36login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainCourses extends AppCompatActivity {

    Button and_btn ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_courses);
        and_btn=findViewById(R.id.andr_btn);
        and_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //
                Intent intent = new Intent(MainCourses.this , AndroidContent.class);
                startActivity(intent);
            }
        });


    }

}