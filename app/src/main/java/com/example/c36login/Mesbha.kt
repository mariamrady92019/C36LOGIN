package com.example.c36login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Mesbha : AppCompatActivity() {
    lateinit var counter:Button
    lateinit var  zekr : Button
    var genralCounter =0;
    var count = 0 ;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mesbha)
        counter = findViewById(R.id.counter)
        zekr = findViewById(R.id.zekr)
        counter.setOnClickListener {
            count++
            genralCounter++

            if(genralCounter==3){
                count=0
                zekr.setText("لاحول ولا قوة الا بالله")
            }else if(genralCounter==6){
                zekr.setText("لا اله الا الله")
            }
            counter.setText(count.toString())
        }

    }
}