package com.example.note

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.text.DateFormat
import java.text.FieldPosition
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val notess = arrayListOf<Notes>()
        for (i in 0..100){
            notess.add(Notes("this is ${i+1}", i))
        }


        recyclerview.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = AdapterNote(notess)
        }
    }

    private fun onClick(position: Int) {
        TODO("Not yet implemented")
    }
}

// DateFormat.getDateInstance().format(Calendar.getInstance().time