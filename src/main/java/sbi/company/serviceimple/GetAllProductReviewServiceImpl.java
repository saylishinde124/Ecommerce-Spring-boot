package sbi.company.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.ProductReview;
import sbi.company.repository.ProductReviewRepository;
import sbi.company.service.GetAllProductReviewService;

@Service
public class GetAllProductReviewServiceImpl implements GetAllProductReviewService {

    @Autowired
    private ProductReviewRepository repo;

    @Override
    public List<ProductReview> getAll() {
        return repo.findAll();
    }
}
