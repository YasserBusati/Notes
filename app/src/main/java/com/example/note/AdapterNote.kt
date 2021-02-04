package com.example.note

import android.content.*
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class AdapterNote(private  val notes : ArrayList<Notes>) : RecyclerView.Adapter<AdapterNote.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterNote.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.note_row,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text =notes[position].title
       // holder.date.text = notes[position].date.toString()

    }

    override fun getItemCount() =notes.size
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView=itemView.findViewById(R.id.title)
        val date: TextView=itemView.findViewById(R.id.date)

        init {
            itemView.setOnClickListener {
                val position = adapterPosition
               // Toast.makeText(itemView.context, "you clicked on item ${position + 1} ", Toast.LENGTH_SHORT).show()
                val intent= Intent(itemView.context,DisplayNotes::class.java)
                intent.putExtra("title","Yasserko")
                intent.putExtra("note_text","i am software engineering")
                itemView.context.startActivity(intent)
            }
        }


    }
}


