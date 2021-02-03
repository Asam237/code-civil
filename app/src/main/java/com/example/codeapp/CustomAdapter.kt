package com.example.codeapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(val userList: ArrayList<Chapter>): RecyclerView.Adapter<CustomAdapter.ViewHolder>() {


    override fun getItemCount(): Int {
        return userList.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val txtTitle = itemView.findViewById<TextView>(R.id.txtTitle)
        val txtBody = itemView.findViewById<TextView>(R.id.txtBody)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.txtTitle?.text = userList[position].titre
        holder?.txtBody?.text = userList[position].body
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.chap1_code_penal, parent, false)
        return  ViewHolder(v)
    }

}

