package com.example.aop_part6_chapter07.domain.usecase

import com.example.aop_part6_chapter07.domain.model.Review

class DeleteReviewUseCase(
    private val reviewRepository: ReviewRepository
) {
    suspend operator fun invoke(review: Review) = reviewRepository.removeReview(review)
}