package com.yonikim.aop_part6_chapter01.widget.adapter.viewholder.food

import android.content.res.loader.ResourcesProvider
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.yonikim.aop_part6_chapter01.R
import com.yonikim.aop_part6_chapter01.databinding.ViewholderFoodMenuBinding
import com.yonikim.aop_part6_chapter01.extensions.clear
import com.yonikim.aop_part6_chapter01.extensions.load
import com.yonikim.aop_part6_chapter01.model.restaurant.FoodModel
import com.yonikim.aop_part6_chapter01.screen.base.BaseViewModel
import com.yonikim.aop_part6_chapter01.widget.adapter.viewholder.ModelViewHolder

class FoodMenuViewHolder(
    private val binding: ViewholderFoodMenuBinding,
    viewModel: BaseViewModel,
    resourcesProvider: ResourcesProvider
): ModelViewHolder<FoodModel>(binding, viewModel, resourcesProvider) {

    override fun reset() = with(binding) {
        foodImage.clear()
    }

    override fun bindData(model: FoodModel) {
        super.bindData(model)
        with(binding) {
            foodImage.load(model.imageUrl, 24f, CenterCrop())
            foodTitleText.text = model.title
            foodDescriptionText.text = model.description
            priceText.text = resourcesProvider.getString(R.string.price, model.price)
        }
    }

    override fun bindViews(model: FoodModel, adapterListener: AdapterListener) {
        if (adapterListener is FoodMenuListListener) {
            binding.root.setOnClickListener {
                adapterListener.onClickItem(model)
            }
        }
    }

}