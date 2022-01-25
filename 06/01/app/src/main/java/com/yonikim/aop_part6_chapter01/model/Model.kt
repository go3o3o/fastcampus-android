package com.yonikim.aop_part6_chapter01.model

import android.annotation.SuppressLint
import androidx.annotation.NonNull
import androidx.recyclerview.widget.DiffUtil

abstract class Model(
    open val id: Long,
    open val type: CellType
) {
    companion object {
        val DIFF_CALLBACK: DiffUtil.ItemCallback<Model> = object : DiffUtil.ItemCallback<Model>() {
            override fun areItemsTheSame(@NonNull oldItem: Model, @NonNull newItem: Model): Boolean {
                return oldItem.id == newItem.id && oldItem.type == newItem.type
            }

            @SuppressLint("DiffUtilEquals")
            override fun areContentsTheSame(@NonNull oldItem: Model, @NonNull newItem: Model): Boolean {
                return oldItem === newItem
            }
        }
    }

}