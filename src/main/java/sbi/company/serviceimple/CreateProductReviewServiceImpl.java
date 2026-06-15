package sbi.company.serviceimple;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.ProductReview;
import sbi.company.repository.ProductReviewRepository;
import sbi.company.service.CreateProductReviewService;

@Service
public class CreateProductReviewServiceImpl implements CreateProductReviewService {

    @Autowired
    private ProductReviewRepository repo;

    @Override
    public ProductReview saveProductReview(ProductReview review) {
        return repo.save(review);
    }
}