package com.example.c36login.hadeeth

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.c36login.R

class AhadeethKotlinAdapter(var list : ArrayList<HadethModel>) : RecyclerView.Adapter<AhadeethKotlinViewHolder>() {
    public var onClickInterface : OnHadeethClickCalback? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AhadeethKotlinViewHolder {
    var view = LayoutInflater.from(parent.context).inflate(R.layout.ahadeeth_item,parent,false)
        return AhadeethKotlinViewHolder(view)
     }

    override fun onBindViewHolder(holder: AhadeethKotlinViewHolder, position: Int) {
               var model = this.list.get(position)
        holder.hadeeth_tv.setText(model.hadeethnum)

        if(onClickInterface!=null){
            holder.itemView.setOnClickListener {
                onClickInterface?.onHadeethClick(position)
            }
        }
    }

    override fun getItemCount(): Int {
         return list.size
     }
}

class AhadeethKotlinViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    lateinit  var hadeeth_tv:TextView
    init {
         hadeeth_tv = itemView.findViewById(R.id.number_ofHadeth)
    }


}

interface OnHadeethClickCalback{
    fun onHadeethClick(position: Int)
}