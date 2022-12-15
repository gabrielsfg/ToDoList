package com.example.whishlist

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.view.view.*

class Adapter(var data:List<TasksInfo>): RecyclerView.Adapter<Adapter.viewHolder>() {
    class viewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var title = itemView.title
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.view,parent,false)
        return viewHolder(itemView)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        holder.title.text = data[position].title
        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context,UpdateTask::class.java)
            intent.putExtra("id", position)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }
}