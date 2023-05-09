package com.example.simpletodolist.ui

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.simpletodolist.databinding.TaskItemBinding
import com.example.simpletodolist.repository.propertiesTask

class TaskViewHolder(view:View): RecyclerView.ViewHolder(view) {
    private val binding = TaskItemBinding.bind(view)
    fun render(taskItemModel: propertiesTask, onClickDelete: (Int) -> Unit){
        binding.tvTitle.text =  taskItemModel.title
        binding.tvDescription.text = taskItemModel.description
        binding.btDelete.setOnClickListener { onClickDelete(bindingAdapterPosition) }
    }
}
