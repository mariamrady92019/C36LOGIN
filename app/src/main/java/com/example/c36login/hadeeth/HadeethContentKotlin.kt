package com.example.c36login.hadeeth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.c36login.R

class HadeethContentKotlin : AppCompatActivity() {

    lateinit var hadithContent :TextView
    lateinit var had_num : TextView

  var num : String=""
   var content : String =""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hadeeth_content_kotlin)
        hadithContent = findViewById(R.id.had_details)
        had_num = findViewById(R.id.had_num)
         getDataFromIntent()

        hadithContent.text=content
        had_num.text = "الحديث رقم"+num


    }

    private fun getDataFromIntent() {
      content = intent.getStringExtra("content").toString()
        num = intent.getStringExtra("hadeeth_num").toString()
     }
}