package com.example.kotlinprogram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_second.*

class second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        supportActionBar?.hide()

         val detailObjects= mutableListOf<model>();
        detailObjects.add(model("sohel","cse"))
        detailObjects.add(model("suchi","cse"))
        detailObjects.add(model("rohir","cse"))
        detailObjects.add(model("pall","cse"))
        detailObjects.add(model("tanu","cse"))
        detailObjects.add(model("sohim","ece"))
        detailObjects.add(model("sohel","cse"))
        detailObjects.add(model("suchi","cse"))
        detailObjects.add(model("rohir","cse"))
        detailObjects.add(model("pall","cse"))
        detailObjects.add(model("tanu","cse"))
        detailObjects.add(model("sohim","ece"))
        recycle.adapter=Adepterr(detailObjects);
        recycle.layoutManager=LinearLayoutManager(this);

    }
}