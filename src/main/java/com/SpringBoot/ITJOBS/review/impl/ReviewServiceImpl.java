package com.SpringBoot.ITJOBS.review.impl;

import com.SpringBoot.ITJOBS.review.Review;
import com.SpringBoot.ITJOBS.review.ReviewRepository;
import com.SpringBoot.ITJOBS.review.ReviewService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {
    private ReviewRepository reviewRepository;

    public ReviewServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public List<Review> getAllReviews(Long companyId) {
        List<Review> reviews=reviewRepository.findByCompanyId(companyId);
        return reviews;
    }
}
