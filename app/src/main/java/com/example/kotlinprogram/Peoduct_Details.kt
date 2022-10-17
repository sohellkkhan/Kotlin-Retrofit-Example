package com.example.kotlinprogram

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_peoduct_details.*

class Peoduct_Details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_peoduct_details)

        val i=findViewById<TextView>(R.id.productDescription)

        val name = intent.getStringExtra("name")
        val image = intent.getStringExtra("image")
        val id = intent.getIntExtra("id", 0)
        val price = intent.getIntExtra("price - ", 2500)

        i.text= price.toString()

    }
}