package com.example.footballquiz

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_premier.setOnClickListener {

            var intent = Intent(this,QuestionActivity::class.java)
            startActivity(intent)
            finish()

        }
            nbfootball.onItemSelectedListener = object : AdapterView.OnItemSelectedListener  {

            override fun onItemSelected(parent: AdapterView<*>, view: View?, pos: Int, id: Long) {

                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // Another interface callback
                }
            }

        btn_football.setOnClickListener {

            var intent = Intent(this,FootballActivity::class.java)
            startActivity(intent)
            finish()

        }
    }
}