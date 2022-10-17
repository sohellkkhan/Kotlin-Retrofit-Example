package com.example.kotlinprogram

import android.content.Intent
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import java.lang.Character.getName


class Adepterr(val detail:List<model>):RecyclerView.Adapter<Adepterr.vholder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): vholder {

        val inflater=LayoutInflater.from(parent.context);
        val view=inflater.inflate(R.layout.item_view,parent,false);
        return  vholder(view);

    }

    override fun onBindViewHolder(holder: vholder, position: Int) {

        holder.name.text=detail[position].name;
        holder.department.text=detail[position].department;


        var color="#CCCCCC"
        if (position % 2 ==0){
            color="#EEEEEE"
        }
        holder.container.setBackgroundColor(Color.parseColor(color))

  holder.itemView.setOnClickListener {

      val snackBar = Snackbar.make(
          it, "Replace with your own action",
          Snackbar.LENGTH_LONG
      ).show()
  }


    }

    override fun getItemCount(): Int {
   return detail.size;
    }

    class vholder(itemView: View):RecyclerView.ViewHolder(itemView) {

        var name=itemView.findViewById<TextView>(R.id.name);
        var department=itemView.findViewById<TextView>(R.id.department);
        var container=itemView.findViewById<LinearLayout>(R.id.linear);
    }




}


