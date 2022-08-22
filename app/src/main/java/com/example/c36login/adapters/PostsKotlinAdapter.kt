package com.example.c36login.adapters

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.c36login.R
import com.example.c36login.models.PostModel
import java.util.ArrayList

class PostsKotlinAdapter(private  val list : ArrayList<PostModel>) : RecyclerView.Adapter<PostsKotlinAdapter.PostsKotlinViewHolder>() {

     var onClickListener : OnClickListener? = null

    class PostsKotlinViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
       lateinit var name : TextView

        lateinit var time : TextView
        lateinit var  details : TextView
        lateinit var  profileImage : ImageView
        lateinit var  postImage : ImageView

      init {
          name = itemView.findViewById(R.id.name_tv)
          time = itemView.findViewById<TextView>(R.id.time_tv)
          details = itemView.findViewById<TextView>(R.id.post_details)
          postImage = itemView.findViewById<ImageView>(R.id.post_image)
          profileImage = itemView.findViewById<ImageView>(R.id.profile_image)
      }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostsKotlinViewHolder {

        var view = LayoutInflater.from(parent.context).inflate(R.layout.activity_facebook,parent,false)

          return PostsKotlinViewHolder(view)
    }



    override fun onBindViewHolder(holder: PostsKotlinViewHolder, position: Int) {
       var post : PostModel = this.list.get(position)
        holder.name.setText(post.name)
        holder.details.setText(post.postDetails)
        holder.time.setText(post.time)
        holder.postImage.setImageResource(post.postImage)
        holder.profileImage.setImageResource(post.profileImage)
        if(onClickListener!=null){
            holder.profileImage.setOnClickListener {
                onClickListener?.onImageLikeClick(position , post)

            }

        }



    }

    override fun getItemCount(): Int {
       return this.list.size
    }

}

public  interface OnClickListener {
    fun onImageLikeClick(position: Int , model: PostModel)
}