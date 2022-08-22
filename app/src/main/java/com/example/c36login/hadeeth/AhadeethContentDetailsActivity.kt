package com.example.c36login.hadeeth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.c36login.R

class AhadeethContentDetailsActivity : AppCompatActivity() {
     var hadeethnum : Int = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ahadeeth_content_details)
       hadeethnum =  intent.getIntExtra("hadeeth_num",1)
        Log.e("intent data passed" , hadeethnum.toString())
        // fun show content

    }
}