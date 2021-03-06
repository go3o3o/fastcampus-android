package com.yonikim.aop_part6_chapter01.screen.home.restaurant.detail.menu

import android.os.Bundle
import android.widget.Toast
import com.yonikim.aop_part6_chapter01.data.entity.restaurant.RestaurantFoodEntity
import com.yonikim.aop_part6_chapter01.databinding.FragmentListBinding
import com.yonikim.aop_part6_chapter01.model.restaurant.FoodModel
import com.yonikim.aop_part6_chapter01.screen.base.BaseFragment
import com.yonikim.aop_part6_chapter01.screen.home.restaurant.detail.RestaurantDetailViewModel
import com.yonikim.aop_part6_chapter01.widget.adapter.ModelRecyclerAdapter
import com.yonikim.aop_part6_chapter01.widget.adapter.listener.restaurant.FoodMenuListListener
import org.koin.core.parameter.parametersOf
import org.koin.android.viewmodel.ext.android.sharedViewModel
import org.koin.android.viewmodel.ext.android.viewModel

class RestaurantMenuListFragment : BaseFragment<RestaurantMenuListViewModel, FragmentListBinding>() {

    override fun getViewBinding(): FragmentListBinding = FragmentListBinding.inflate(layoutInflater)

    private val restaurantId by lazy { arguments?.getLong(RESTAURANT_ID_KEY, -1) }

    private val restaurantFoodList by lazy { arguments?.getParcelableArrayList<RestaurantFoodEntity>(FOOD_LIST_KEY)!! }

    override val viewModel by viewModel<RestaurantMenuListViewModel> { parametersOf(restaurantId, restaurantFoodList) }

    private val restaurantDetailViewModel by sharedViewModel<RestaurantDetailViewModel>()

    private val adapter by lazy {
        ModelRecyclerAdapter<FoodModel, RestaurantMenuListViewModel>(listOf(), viewModel, adapterListener = object :
            FoodMenuListListener {
            override fun onClickItem(model: FoodModel) {
                viewModel.insertMenuInBasket(model)
            }
        })
    }

    override fun initViews() = with(binding) {
        recyclerVIew.adapter = adapter
    }

    override fun observeData() {
        viewModel.restaurantMenuListLiveData.observe(viewLifecycleOwner) {
            adapter.submitList(it)
        }
        viewModel.menuBasketLiveData.observe(viewLifecycleOwner) {
            Toast.makeText(requireContext(), "??????????????? ???????????????. ?????? : ${it.title}", Toast.LENGTH_SHORT).show()
            restaurantDetailViewModel.notifyFoodMenuListInBasket(it)
        }
        viewModel.isClearNeedInBasketLiveData.observe(viewLifecycleOwner) { (isClearNeed, afterAction) ->
            if (isClearNeed) {
                restaurantDetailViewModel.notifyClearNeedAlertInBasket(isClearNeed, afterAction)
            }
        }
    }

    companion object {
        const val RESTAURANT_ID_KEY = "restaurantId"
        const val FOOD_LIST_KEY = "foodList"

        fun newInstance(restaurantId: Long, foodList: ArrayList<RestaurantFoodEntity>): RestaurantMenuListFragment {
            val bundle = Bundle().apply {
                putLong(RESTAURANT_ID_KEY, restaurantId)
                putParcelableArrayList(FOOD_LIST_KEY, foodList)
            }

            return RestaurantMenuListFragment().apply {
                arguments = bundle
            }
        }

    }
}