package com.example.c36login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.c36login.hadeeth.AhadeethActivity;
import com.example.c36login.hadeeth.AhadeethKotlinActivity;

public class LoginActivity extends AppCompatActivity {

    Button login_btn ;
    TextView signup_tv;
   EditText email_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login_btn =  findViewById(R.id.login_btn);
        signup_tv = findViewById(R.id.register_txv);
        email_tv = findViewById(R.id.email_edt);
        login_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //go to regis activite


            }
        });
        signup_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this , Mesbha.class);
                startActivity(intent);
            }
        });

        String em =email_tv.getText().toString();

    }
}