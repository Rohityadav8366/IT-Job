package com.SpringBoot.ITJOBS.review;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies/{companyId}")
public class ReviewController {
    private ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }
    @GetMapping("/review")
    public ResponseEntity<List<Review>> getAllReviews(@PathVariable Long id)
    {
        return new ResponseEntity(reviewService.getAllReviews(id), HttpStatus.OK);
    }

}

