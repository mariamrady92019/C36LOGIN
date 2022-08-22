package com.example.c36login.hadeeth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.c36login.R;

import java.util.ArrayList;

public class AhadeethActivity extends AppCompatActivity {
RecyclerView had_rcy ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ahadeeth);
        had_rcy=findViewById(R.id.Ahadeeth_rcy);
        ArrayList<HadethModel> list = getList();
        initRecycler(list);


    }

    private void initRecycler(ArrayList<HadethModel> list) {
        AhadeethAdapter adapter = new AhadeethAdapter(list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        had_rcy.setLayoutManager(layoutManager);
        had_rcy.setAdapter(adapter);


    }

    private ArrayList<HadethModel> getList() {
        ArrayList<HadethModel> list = new ArrayList<>();

        for (int i = 1; i <=40 ; i++) {
            String s = "الحديث رقم"+i;
            list.add(new HadethModel(s));
        }

        return list;
    }
}