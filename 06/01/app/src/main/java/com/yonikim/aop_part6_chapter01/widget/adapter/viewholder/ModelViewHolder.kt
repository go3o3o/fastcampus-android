package com.yonikim.aop_part6_chapter01.widget.adapter.viewholder

import android.content.res.loader.ResourcesProvider
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.yonikim.aop_part6_chapter01.model.Model
import com.yonikim.aop_part6_chapter01.screen.base.BaseViewModel

abstract class ModelViewHolder<M: Model>(
    binding: ViewBinding,
    protected val viewModel: BaseViewModel,
    protected val resourcesProvider: ResourcesProvider
) : RecyclerView.ViewHolder(binding.root) {

    abstract fun reset()

    open fun bindData(model: M) {
        reset()
    }

    abstract fun bindViews(model: M, adapterListener: AdapterListener)

}