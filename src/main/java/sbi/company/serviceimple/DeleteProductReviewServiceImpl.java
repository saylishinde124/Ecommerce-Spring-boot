package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.repository.ProductReviewRepository;
import sbi.company.service.DeleteProductReviewService;

@Service
public class DeleteProductReviewServiceImpl implements DeleteProductReviewService {

    @Autowired
    private ProductReviewRepository repo;

    @Override
    public void delete(int id) {
        repo.deleteById(id);
    }
}
