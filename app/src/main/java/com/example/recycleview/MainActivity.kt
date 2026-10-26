package com.example.recycleview

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.item_student2)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        val students = listOf(
            Student("Иван Иванов", "10-А"),
            Student("Мария Петрова", "10-Б"),
            Student("Алексей Смирнов", "11-А"),
            Student("Ольга Кузнецова", "9-В"),
            Student("Дмитрий Соколов", "11-Б")
        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = StudentAdapter(students)
    }
    }
