package com.yonikim.aop_part6_chapter01.widget.adapter.viewholder.restaurant

import com.yonikim.aop_part6_chapter01.R
import com.yonikim.aop_part6_chapter01.databinding.ViewholderLikeRestaurantBinding
import com.yonikim.aop_part6_chapter01.extensions.clear
import com.yonikim.aop_part6_chapter01.extensions.load
import com.yonikim.aop_part6_chapter01.model.restaurant.RestaurantModel
import com.yonikim.aop_part6_chapter01.screen.base.BaseViewModel
import com.yonikim.aop_part6_chapter01.util.provider.ResourcesProvider
import com.yonikim.aop_part6_chapter01.widget.adapter.viewholder.ModelViewHolder

class LikeRestaurantViewHolder(
    private val binding: ViewholderLikeRestaurantBinding,
    viewModel: BaseViewModel,
    resourcesProvider: ResourcesProvider
): ModelViewHolder<RestaurantModel>(binding, viewModel, resourcesProvider) {

    override fun reset() = with(binding) {
        restaurantImage.clear()
    }

    override fun bindData(model: RestaurantModel) {
        super.bindData(model)
        with(binding) {
            restaurantImage.load(model.restaurantImageUrl, 24f)
            restaurantTitleText.text = model.restaurantTitle
            gradeText.text = resourcesProvider.getString(R.string.grade_format, model.grade)
            reviewCountText.text = resourcesProvider.getString(R.string.review_count, model.reviewCount)
            val (minTime, maxTime) = model.deliveryTimeRange
            deliveryTimeText.text = resourcesProvider.getString(R.string.delivery_time, minTime, maxTime)

            val (minTip, maxTip) = model.deliveryTipRange
            deliveryTipText.text = resourcesProvider.getString(R.string.delivery_tip, minTip, maxTip)
        }
    }

    override fun bindViews(model: RestaurantModel, adapterListener: AdapterListener) = with(binding) {
        if (adapterListener is RestaurantLikeListListener) {
            root.setOnClickListener {
                adapterListener.onClickItem(model)
            }
            likeImageButton.setOnClickListener {
                adapterListener.onDislikeItem(model)
            }
        }
    }

}