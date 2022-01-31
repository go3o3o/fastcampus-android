package com.yonikim.aop_part6_chapter01.util.event

import kotlinx.coroutines.flow.MutableSharedFlow

class MenuChangeEventBus {
    private val _mainTabMenuFlow = MutableSharedFlow<<MainTabMenu>()
    val mainTabMenuFlow = _mainTabMenuFlow.asSharedFlow()

    suspend fun changeMenu(event: MainTabMenu) {
        _mainTabMenuFlow.emit(event)
    }
}