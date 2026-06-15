package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.ProductReview;
import sbi.company.repository.ProductReviewRepository;
import sbi.company.service.UpdateProductReviewService;

@Service
public class UpdateProductReviewServiceImpl implements UpdateProductReviewService {

    @Autowired
    private ProductReviewRepository repo;

    @Override
    public ProductReview update(ProductReview review) {
        return repo.save(review);
    }
}
