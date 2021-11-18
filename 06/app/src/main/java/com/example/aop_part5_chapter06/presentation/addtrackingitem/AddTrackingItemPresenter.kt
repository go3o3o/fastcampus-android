package com.example.aop_part5_chapter06.presentation.addtrackingitem

import com.example.aop_part5_chapter06.data.repository.ShippingCompanyRepository
import com.example.aop_part5_chapter06.data.repository.TrackingItemRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.MainScope

class AddTrackingItemPresenter(
    private val view: AddTrackingItemsContract.View,
    private val shippingCompanyRepository: ShippingCompanyRepository,
    private val trackerRepository: TrackingItemRepository
): AddTrackingItemsContract.Presenter {

    override val scope: CoroutineScope = MainScope()
}