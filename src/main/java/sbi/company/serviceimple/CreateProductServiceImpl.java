package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import sbi.company.entity.Product;

import sbi.company.repository.ProductRepository;
import sbi.company.service.CreateProductService;

@Service
public class CreateProductServiceImpl implements CreateProductService {

    @Autowired
    private ProductRepository repo;

    @Override
    public Product saveProduct(Product product) {
        return repo.save(product);
    }
}
