package com.example.kotlinprogram



import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_fragment6.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide();

        go.setOnClickListener {
           Toast.makeText(this,"its ok",Toast.LENGTH_LONG).show();
            val Intent= Intent(this,second::class.java);
            startActivity(Intent);
        }

        retro.setOnClickListener {
            val  Intent=Intent(this,Retro::class.java);
            startActivity(Intent)
        }

        button6.setOnClickListener {
            val fragmentManager = supportFragmentManager
            fragmentManager.beginTransaction()
                .replace(R.id.container, fragment6::class.java, null)
                .commit()

        }

    }
}