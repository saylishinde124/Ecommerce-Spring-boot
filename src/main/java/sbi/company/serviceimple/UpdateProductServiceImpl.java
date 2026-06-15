package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Product;
import sbi.company.repository.ProductRepository;
import sbi.company.service.UpdateProductService;

@Service
public class UpdateProductServiceImpl implements UpdateProductService {

    @Autowired
    private ProductRepository repo;

    @Override
    public Product updateProduct(Product product) {
        return repo.save(product);
    }
}
