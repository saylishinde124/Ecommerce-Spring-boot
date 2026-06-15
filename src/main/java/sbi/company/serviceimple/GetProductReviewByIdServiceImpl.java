package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.ProductReview;
import sbi.company.repository.ProductReviewRepository;
import sbi.company.service.GetProductReviewByIdService;

@Service
public class GetProductReviewByIdServiceImpl implements GetProductReviewByIdService {

    @Autowired
    private ProductReviewRepository repo;

    @Override
    public ProductReview getById(int id) {
        return repo.findById(id).orElse(null);
    }
}
