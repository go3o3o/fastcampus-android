package com.yonikim.aop_part5_chapter01.presentation.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.yonikim.aop_part5_chapter01.R
import com.yonikim.aop_part5_chapter01.data.entity.ToDoEntity
import com.yonikim.aop_part5_chapter01.databinding.ViewHolderTodoItemBinding

class ToDoAdapter: RecyclerView.Adapter<ToDoAdapter.ToDoItemViewHolder>() {

    private var toDoList: List<ToDoEntity> = listOf()
    private lateinit var toDoItemClickListener: (ToDoEntity) -> Unit
    private lateinit var toDoCheckListener: (ToDoEntity) -> Unit

    inner class ToDoItemViewHolder(
        private val binding: ViewHolderTodoItemBinding,
        val toDoItemClickListener: (ToDoEntity) -> Unit
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bindData(data: ToDoEntity) = with(binding) {
            checkBox.text = data.title
            checkToDoComplete(data.hasCompleted)
        }

        fun bindViews(data: ToDoEntity) {
            binding.checkBox.setOnClickListener {
                toDoCheckListener(
                    data.copy(hasCompleted = binding.checkBox.isChecked)
                )
                checkToDoComplete(binding.checkBox.isChecked)
            }
            binding.root.setOnClickListener {
                toDoItemClickListener(data)
            }
        }

        private fun checkToDoComplete(isChecked: Boolean) = with(binding) {
            checkBox.isChecked = isChecked
            container.setBackgroundColor(
                ContextCompat.getColor(
                    root.context,
                    if (isChecked) {
                        R.color.gray_300
                    } else {
                        R.color.white
                    }
                )
            )
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoItemViewHolder {
        val view = ViewHolderTodoItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ToDoItemViewHolder(view, toDoItemClickListener)
    }

    override fun onBindViewHolder(holder: ToDoItemViewHolder, position: Int) {
        holder.bindData(toDoList[position])
        holder.bindViews(toDoList[position])
    }

    override fun getItemCount(): Int = toDoList.size

    fun setToDoList(toDoList: List<ToDoEntity>, toDoItemClickListener: (ToDoEntity) -> Unit, toDoCheckListener: (ToDoEntity) -> Unit) {
        this.toDoList = toDoList
        this.toDoItemClickListener = toDoItemClickListener
        this.toDoCheckListener = toDoCheckListener
        notifyDataSetChanged()
    }
}