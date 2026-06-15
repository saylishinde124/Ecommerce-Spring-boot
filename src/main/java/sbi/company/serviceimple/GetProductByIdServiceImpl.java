package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Product;
import sbi.company.repository.ProductRepository;
import sbi.company.service.GetProductByIdService;

@Service
public class GetProductByIdServiceImpl implements GetProductByIdService {

    @Autowired
    private ProductRepository repo;

    @Override
    public Product getProductById(int id) {
        return repo.findById(id).orElse(null);
    }
}
