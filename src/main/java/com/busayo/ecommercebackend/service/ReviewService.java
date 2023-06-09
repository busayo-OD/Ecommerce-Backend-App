package com.busayo.ecommercebackend.service;

import com.busayo.ecommercebackend.dto.review.ResponseDto;
import com.busayo.ecommercebackend.dto.review.ReviewDto;
import com.busayo.ecommercebackend.dto.review.ReviewInfoDto;
import com.busayo.ecommercebackend.dto.review.ReviewInfoResponseDto;

import java.util.List;

public interface ReviewService {

    Boolean addReview(ReviewDto reviewDto, Long id);
    Boolean updateReview(ReviewDto reviewDto, Long userId);
    List<ReviewInfoDto> getAllReviews();
    ReviewInfoResponseDto getReviewsWithPaginationAndSorting(int pageNo, int pageSize, String sortBy, String sortDir);
    ReviewInfoDto getReview (Long reviewId);
    void deleteReview(Long reviewId, Long id);
    List<ReviewInfoDto> getProductReviews(Long productId);
    void addResponse(ResponseDto responseDto, Long reviewId);
    void deleteResponse(Long responseId);
//    ResponseDto getReviewResponse(Long reviewId);
}
