package com.abhinav.jdm_v2.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.abhinav.jdm_v2.R

class DashboardRecyclerAdapter(val context: Context, private val itemList: ArrayList<String>): RecyclerView.Adapter<DashboardRecyclerAdapter.DashboardViewHolder>() {
    class DashboardViewHolder (view:View) : RecyclerView.ViewHolder(view){
        val textView: TextView=view.findViewById(R.id.txt_recycle_dashboard_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DashboardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycle_dashboard_view, parent,false)
        return DashboardViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: DashboardViewHolder, position: Int) {
        val text=itemList[position]
        holder.textView.text=text
    }
}