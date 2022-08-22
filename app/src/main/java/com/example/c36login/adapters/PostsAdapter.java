package com.example.c36login.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.c36login.R;
import com.example.c36login.models.PostModel;

import java.util.ArrayList;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.PostsViewHolder> {

   ArrayList<PostModel> list = new ArrayList();
    public PostsAdapter(ArrayList<PostModel> list)
    {
        this.list=list;
    }

    @NonNull
    @Override
    public PostsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_facebook,parent,false);

        return new PostsViewHolder(layoutView);
    }

    @Override
    public void onBindViewHolder(@NonNull PostsViewHolder holder, int position) {

        PostModel model = this.list.get(position);
        holder.name.setText(model.getName());
        holder.time.setText(model.getTime());
        holder.details.setText(model.getPostDetails());

        holder.profileImage.setImageResource(model.getProfileImage());
        holder.postImage.setImageResource(model.getPostImage());



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class PostsViewHolder extends RecyclerView.ViewHolder{

        TextView name ;
        TextView time ;
        TextView details ;
        ImageView profileImage ;
        ImageView postImage ;


        public PostsViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name_tv);
            time = itemView.findViewById(R.id.time_tv);
            details= itemView.findViewById(R.id.post_details);
            postImage = itemView.findViewById(R.id.post_image);
            profileImage = itemView.findViewById(R.id.profile_image);


        }
    }


}
