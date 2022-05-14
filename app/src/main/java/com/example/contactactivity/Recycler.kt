package com.example.contactactivity

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

import org.w3c.dom.Text

class Recycler(var context: Context,var arrayList: ArrayList<ModelClass>):
    RecyclerView.Adapter<Recycler.AdapterHolder>() {
    class AdapterHolder(view: View): RecyclerView.ViewHolder(view){
       var showname : TextView = view.findViewById(R.id.showname)
       var showcontact : TextView = view.findViewById(R.id.showcontact)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Recycler.AdapterHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.contactlayout,parent,false)
        return AdapterHolder(itemView)
    }

    override fun onBindViewHolder(holder: Recycler.AdapterHolder, position: Int) {
        holder.showname.setText("${arrayList.get(position).name}")
        holder.showcontact.setText("${arrayList.get(position).contact}")


    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

}
