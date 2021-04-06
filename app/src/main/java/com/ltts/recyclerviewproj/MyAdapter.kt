package com.ltts.recyclerviewproj

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(var userList: ArrayList<Data>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        fun holdingViews(users:Data)
        {
            var myName = itemView.findViewById<TextView>(R.id.textViewname)
            var myEmail= itemView.findViewById<TextView>(R.id.textViewemail)
            var myPhone= itemView.findViewById<TextView>(R.id.textViewphone)

            myName.setText(users.name)
            myEmail.setText(users.email)
            myPhone.setText(users.phone)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var v= LayoutInflater.from(parent.context).inflate(R.layout.recycle,parent,false)
        return MyViewHolder(v)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.holdingViews(userList[position])
    }

    override fun getItemCount(): Int {
        return userList.size
    }
}