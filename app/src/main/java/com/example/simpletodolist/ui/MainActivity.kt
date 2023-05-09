package com.example.simpletodolist.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.simpletodolist.databinding.ActivityMainBinding
import com.example.simpletodolist.repository.propertiesTask

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: TaskRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityMainBinding.inflate(layoutInflater)
        binding.btNewTask.setOnClickListener { createNewTask() }
        setContentView(binding.root)
        setUpRecyclerView()
    }

    private fun createNewTask() {
        TODO("Not yet implemented")
    }


    private fun setUpRecyclerView(){
        adapter = TaskRecyclerAdapter(getTask(), onClickDelete = {onDeleteItem(it)})
        binding.rvTodoList.layoutManager = LinearLayoutManager(this)
        binding.rvTodoList.adapter =  adapter
    }

    private fun getTask(): MutableList<propertiesTask>{
        val tasks: MutableList<propertiesTask> = ArrayList()
        tasks.add(propertiesTask("titulo", "prueba"))
        tasks.add(propertiesTask("titulo2", "prueba2"))
        tasks.add(propertiesTask("titulo2", "prueba2"))
        tasks.add(propertiesTask("titulo2", "prueba2"))
        tasks.add(propertiesTask("titulo2", "prueba2"))
        tasks.add(propertiesTask("titulo2", "prueba2"))
        return tasks
    }

    private fun onDeleteItem(position:Int){
        getTask().removeAt(position)
        adapter.notifyItemRemoved(position)
    }
}