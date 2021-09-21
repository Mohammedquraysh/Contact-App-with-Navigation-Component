package com.example.navcontrol_contactappassignment.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.navcontrol_contactappassignment.R
import com.example.navcontrol_contactappassignment.model.Contact

class RecyclerViewAdapter(val myContact: List<Contact>): RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>() {
    lateinit var nListener: onItemClickListener

    interface onItemClickListener {

        fun onItemClick(position: Int)
    }
    fun setOnItemClickListener(listener: onItemClickListener){
        nListener = listener
    }

    inner class MyViewHolder(view: View, listener: onItemClickListener):RecyclerView.ViewHolder(view){
        var playerImage: ImageView = itemView.findViewById(R.id.ivImage2)
        var playerContact: TextView = itemView.findViewById(R.id.contact1)

        fun bindView(data: Contact){
            playerImage.setImageResource(myContact[position].image)
            playerContact.text = data.contactList
        }

        init {
            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
      val inflater = LayoutInflater.from(parent.context).inflate(R.layout.contact_recycler,parent,false)
        return MyViewHolder(inflater, nListener)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bindView(myContact[position])

    }

    override fun getItemCount(): Int {
       return myContact.size
    }
}