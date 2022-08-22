package com.example.c36login

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.c36login.adapters.OnClickListener
import com.example.c36login.adapters.PostsKotlinAdapter
import com.example.c36login.models.PostModel
import java.util.*
import kotlin.collections.ArrayList

class PostsKotlinRecycler : AppCompatActivity() {

    lateinit var postsRecycler: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_posts_recycler)
        postsRecycler=findViewById(R.id.postsRecycler)
        var list : ArrayList<PostModel> = createList()
        initRecyclerView(list)




    }

    private fun initRecyclerView(list : ArrayList<PostModel>) {

        var adapter : PostsKotlinAdapter = PostsKotlinAdapter(list)
        var layoutManeger : RecyclerView.LayoutManager = LinearLayoutManager(this,RecyclerView.VERTICAL,false)
       postsRecycler.adapter=adapter
        postsRecycler.layoutManager=layoutManeger

        adapter.onClickListener= object : OnClickListener {
            override fun onImageLikeClick(position: Int, model: PostModel) {
///
                Toast.makeText(this@PostsKotlinRecycler ,"im here", Toast.LENGTH_LONG).show()


            }
        }

    }

    private  fun createList():ArrayList<PostModel>{
        val list = ArrayList<PostModel>()
        list.add(
            PostModel(
                "mariam", "30 minute",
                "we are practice rwcyclerview", R.drawable.background, R.drawable.background
            )
        )
        list.add(
            PostModel(
                "mariam", "30 minute",
                "we are practice rwcyclerview", R.drawable.background, R.drawable.background
            )
        )
        list.add(
            PostModel(
                "mariam", "30 minute",
                "we are practice rwcyclerview", R.drawable.background, R.drawable.background
            )
        )
        list.add(
            PostModel(
                "mariam", "30 minute",
                "we are practice rwcyclerview", R.drawable.background, R.drawable.background
            )
        )

        list.add(
            PostModel(
                "mariam", "30 minute",
                "we are practice rwcyclerview", R.drawable.background, R.drawable.background
            )
        )
        list.add(
            PostModel(
                "mariam", "30 minute",
                "we are practice rwcyclerview", R.drawable.background, R.drawable.background
            )
        )
        list.add(
            PostModel(
                "mariam", "30 minute",
                "we are practice rwcyclerview", R.drawable.background, R.drawable.background
            )
        )

        return list

    }







}