package com.example.kotlinprogram

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_retro.*
import kotlinx.android.synthetic.main.activity_second.view.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class Retro : AppCompatActivity() {

  lateinit  var adapter:Radapter
  lateinit var liniarlayout:LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retro)

        supportActionBar?.hide();

        recyc.setHasFixedSize(true)
        liniarlayout= LinearLayoutManager(this)
        recyc.layoutManager=liniarlayout

        getdat();
    }

    private fun getdat() {

       val retrofit = Retrofit.Builder()
            .baseUrl("https://fakestoreapi.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiInterface::class.java)
        val retrof=retrofit.getdata()
        retrof.enqueue(object : Callback<List<Rmodel>?> {
            override fun onResponse(call: Call<List<Rmodel>?>, response: Response<List<Rmodel>?>) {

                val responseBod=response.body()!!
                adapter= Radapter(baseContext,responseBod)
                adapter.notifyDataSetChanged()
                recyc.adapter=adapter



            }

            override fun onFailure(call: Call<List<Rmodel>?>, t: Throwable) {
                Log.d("Retro","fail your all try again"+t.message)

            }
        })
    }
}