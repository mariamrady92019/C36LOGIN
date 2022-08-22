package com.example.c36login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button login_btn  ;
    EditText editText_email;
    EditText editText_password;
    TextView forget_password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login_btn=findViewById(R.id.login);
        editText_email= findViewById(R.id.emailAdress);
        editText_password = findViewById(R.id.password);
        forget_password = findViewById(R.id.forgetPass);

        login_btn.setOnClickListener(
                new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //login
                //how to go to another screen
            }
        });
   forget_password.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View view) {
         //
       }
   });


        String email = editText_email.getText().toString();

    }
}