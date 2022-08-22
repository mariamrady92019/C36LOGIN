package com.example.c36login.hadeeth;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.c36login.R;

import java.util.ArrayList;

public class AhadeethAdapter extends RecyclerView.Adapter<AhadeethAdapter.AhadeethViewHolder> {

    ArrayList<HadethModel> list = new ArrayList<>();

    public AhadeethAdapter(ArrayList<HadethModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public AhadeethViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ahadeeth_item,parent,false);


        return new AhadeethViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AhadeethViewHolder holder, int position) {
         HadethModel model = list.get(position);
         holder.had_num.setText(model.getHadeethnum());



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class AhadeethViewHolder extends RecyclerView.ViewHolder {
       TextView had_num ;
        public AhadeethViewHolder(@NonNull View itemView) {
            super(itemView);
            had_num=itemView.findViewById(R.id.number_ofHadeth);
        }
    }

}
