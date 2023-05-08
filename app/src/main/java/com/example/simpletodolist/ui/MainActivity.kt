package com.example.simpletodolist.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.simpletodolist.R
import com.example.simpletodolist.databinding.ActivityMainBinding
import com.example.simpletodolist.repository.propertiesTask

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        setUpRecyclerView()
    }

    private fun setUpRecyclerView(){
        binding.rvTodoList.layoutManager = LinearLayoutManager(this)
        binding.rvTodoList.adapter =  TaskRecyclerAdapter(getTask())
    }

    private fun getTask(): List<propertiesTask>{
        var tasks: MutableList<propertiesTask> = ArrayList()
        tasks.add(propertiesTask("titulo", "prueba"))
        tasks.add(propertiesTask("titulo2", "prueba2"))
        tasks.add(propertiesTask("titulo2", "prueba2"))
        tasks.add(propertiesTask("titulo2", "prueba2"))
        tasks.add(propertiesTask("titulo2", "prueba2"))
        tasks.add(propertiesTask("titulo2", "prueba2"))
        return tasks
    }
}