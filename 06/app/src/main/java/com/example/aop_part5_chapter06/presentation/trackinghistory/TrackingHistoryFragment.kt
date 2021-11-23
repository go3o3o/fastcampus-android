package com.example.aop_part5_chapter06.presentation.trackinghistory

import androidx.navigation.fragment.navArgs
import com.example.aop_part5_chapter06.databinding.FragmentTrackingHistoryBinding
import fastcampus.aop.part5.chapter06.presentation.trackinghistory.TrackingHistoryFragmentArgs
import org.koin.android.scope.ScopeFragment
import org.koin.core.parameter.parametersOf

class TrackingHistoryFragment: ScopeFragment(), TrackingHistoryContract.View {

    private var binding: FragmentTrackingHistoryBinding? = null

    private val arguments: TrackingHistoryFragmentArgs by navArgs()

    override val presenter: TrackingHistoryContract.Presenter by inject {
        parametersOf(arguments.item, arguments.information)
    }


}