package com.example.note

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_display_notes.*

class DisplayNotes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_notes)

        val bundle = intent.extras
        val title = bundle?.getString("title")
        val note = bundle?.getString("note_text")

        title_diplay.text= title
        note_text.text = note
    }
}