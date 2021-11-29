package com.example.aop_part5_chapter06.presentation.trackingitems

class TrackingItemsFragment: ScopeFragment(), TrackingItemContract.View {
    override val presenter: TrackingItemsContract.Presenter by inject()
}