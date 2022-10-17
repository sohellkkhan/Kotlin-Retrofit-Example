package com.example.kotlinprogram

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.squareup.picasso.Picasso

class Radapter(val context :Context, val userList: List<Rmodel>):RecyclerView.Adapter<Radapter.holderr>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): holderr {
       var item=LayoutInflater.from(context).inflate(R.layout.ritem_view,parent,false);
        return holderr(item)
    }

    override fun onBindViewHolder(holder: holderr, position: Int) {

        holder.uid.text="Rs "+userList[position].price.toString()
        holder.title.text=userList[position].title.toString()
        Picasso.get().load(userList[position].image).into(holder.image)

           var color="#CCCCCC"
        if (position % 2 ==0){
            color="#EEEEEE"
        }
        holder.container.setBackgroundColor(Color.parseColor(color))

        holder.itemView.setOnClickListener {

                val snackBar =
                    Snackbar.make(it, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .show()


            }


    }

    override fun getItemCount(): Int {
       return userList.size;
    }


    class holderr(itemView: View):RecyclerView.ViewHolder(itemView){

        var uid=itemView.findViewById<TextView>(R.id.id);
        var title=itemView.findViewById<TextView>(R.id.titl);
        var image=itemView.findViewById<ImageView>(R.id.img);
        var container=itemView.findViewById<LinearLayout>(R.id.lin);

    }
}