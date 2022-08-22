package com.example.c36login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.c36login.adapters.PostsAdapter;
import com.example.c36login.models.PostModel;

import java.util.ArrayList;

public class PostsRecycler extends AppCompatActivity {
  RecyclerView posts_Recycler ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posts_recycler);
        posts_Recycler= findViewById(R.id.postsRecycler);

         ArrayList<PostModel> list = createListOfPostsModel();
         initRecycler(list);


    }

    private void initRecycler(ArrayList<PostModel> list) {
        PostsAdapter adapter = new PostsAdapter(list);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        posts_Recycler.setAdapter(adapter);
        posts_Recycler.setLayoutManager(manager);
    }

    private ArrayList<PostModel> createListOfPostsModel() {
        ArrayList<PostModel> list = new ArrayList<>();
        list.add(new PostModel("mariam","30 minute",
                "we are practice rwcyclerview",R.drawable.background,R.drawable.background));
        list.add(new PostModel("mariam","30 minute",
                "we are practice rwcyclerview",R.drawable.background,R.drawable.background));
        list.add(new PostModel("mariam","30 minute",
                "we are practice rwcyclerview",R.drawable.background,R.drawable.background));
        list.add(new PostModel("mariam","30 minute",
                "we are practice rwcyclerview",R.drawable.background,R.drawable.background));

        list.add(new PostModel("mariam","30 minute",
                "we are practice rwcyclerview",R.drawable.background,R.drawable.background));
        list.add(new PostModel("mariam","30 minute",
                "we are practice rwcyclerview",R.drawable.background,R.drawable.background));
        list.add(new PostModel("mariam","30 minute",
                "we are practice rwcyclerview",R.drawable.background,R.drawable.background));

        return list;


    }
}