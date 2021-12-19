package com.example.aop_part6_chapter07.presentation

interface BaseView<PresenterT : BasePresenter> {
    val presenter: PresenterT
}