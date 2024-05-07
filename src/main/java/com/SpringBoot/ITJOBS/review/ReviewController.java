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
    public ResponseEntity<List<Review>> getAllReviews(@PathVariable Long companyId)
    {
        return new ResponseEntity<>(reviewService.getAllReviews(companyId), HttpStatus.OK);
    }

    @PostMapping("/review")
    public ResponseEntity<String> addReview(@PathVariable Long companyId,@RequestBody Review review){
        boolean isReviewSaved=reviewService.addReview(companyId,review);
        if(isReviewSaved) {
            return new ResponseEntity<>("Reviews Added successfully", HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>("Reviews not saved", HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/review/{reviewId}")
    public ResponseEntity<Review> getReview(@PathVariable Long companyId,@PathVariable Long reviewId)
    {
        return new ResponseEntity<>(reviewService.getReview(companyId,reviewId),HttpStatus.OK);
    }

    @PutMapping("/review/{reviewId}")
    public ResponseEntity<String> updateReview(@PathVariable Long companyId,@PathVariable Long reviewId,@PathVariable Review review)
    {
        boolean isReviewUpdated= reviewService.updateReview(companyId,reviewId,review);
        if(isReviewUpdated) {
            return new ResponseEntity<>("Review updated successfully", HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>("Review is not updated", HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/review/{reviewId}")
    public ResponseEntity<String> deletedReview(@PathVariable Long companyId,@PathVariable Long reviewId)
    {
        boolean isDeletedReview=reviewService.deletedReview(companyId,reviewId);
        if(isDeletedReview) {
            return new ResponseEntity<>("Review deleted successfully", HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>("Review is not deleted", HttpStatus.NOT_FOUND);
        }
    }
}

