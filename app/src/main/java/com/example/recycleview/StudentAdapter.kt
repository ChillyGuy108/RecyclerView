package com.example.recycleview


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StudentAdapter(private val students: List<Student>): RecyclerView.Adapter<StudentAdapter.StudentViewHolder>(){
    class StudentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewName: TextView = itemView.findViewById(R.id.textViewName)
        val textViewClass: TextView = itemView.findViewById(R.id.textViewClass)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.student, parent, false)
        return StudentViewHolder(view)
    }


    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        val student = students[position]
        holder.textViewName.text = student.name
        holder.textViewClass.text = "Класс: ${student.studentClass}"
    }


    override fun getItemCount(): Int = students.size
}
