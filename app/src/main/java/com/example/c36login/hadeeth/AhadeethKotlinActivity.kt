package com.example.c36login.hadeeth

import android.content.Intent
import android.os.Bundle
import android.provider.Telephony
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.c36login.R

class AhadeethKotlinActivity : AppCompatActivity() {

     lateinit var  recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ahadeeth)
        recyclerView = findViewById(R.id.Ahadeeth_rcy)
            var list : ArrayList<HadethModel> = createAhadeethList()
        initRecycler(list)

    }

    private fun initRecycler(list: ArrayList<HadethModel>) {
     var adapter =  AhadeethKotlinAdapter(list)
     var layoutManager = LinearLayoutManager(this,RecyclerView.VERTICAL, false)
     recyclerView.adapter=adapter
     recyclerView.layoutManager=layoutManager

      adapter.onClickInterface = object  : OnHadeethClickCalback{
            override fun onHadeethClick(position: Int) {

                val content : String = readHadContentFromFile(position)



             var intent = Intent(this@AhadeethKotlinActivity,HadeethContentKotlin::class.java)
              intent.putExtra("hadeeth_num",position.toString())
                intent.putExtra("content",content)
                startActivity(intent)
             }

        }

    }

    private fun readHadContentFromFile(position: Int): String {
       val filename= "h${position+1}.txt"
       val fileContent= assets.open(filename).bufferedReader()
           .use { it.readText() }
        return  fileContent
    }

    private fun createAhadeethList(): ArrayList<HadethModel> {
        val list = java.util.ArrayList<HadethModel>()

        for (i in 1..40) {
            val s = "الحديث رقم$i"
            list.add(HadethModel(s))
        }

        return list
    }
}