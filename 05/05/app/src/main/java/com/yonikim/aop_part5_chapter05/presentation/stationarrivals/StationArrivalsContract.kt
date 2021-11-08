package com.yonikim.aop_part5_chapter05.presentation.stationarrivals

import com.yonikim.aop_part5_chapter05.domain.ArrivalInformation
import com.yonikim.aop_part5_chapter05.presentation.BasePresenter
import com.yonikim.aop_part5_chapter05.presentation.BaseView

class StationArrivalsContract {

    interface View : BaseView<Presenter> {
        fun showLoadingIndicator()
        fun hideLoadingIndicator()
        fun showErrorDescription(message: String)
        fun showStationArrivals(arrivalInformation: List<ArrivalInformation>)
    }

    interface Presenter : BasePresenter {
        fun fetchStationArrivals()
        fun toggleStationFavorite()
    }

}