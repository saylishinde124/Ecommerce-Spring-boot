package sbi.company.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Product;
import sbi.company.repository.ProductRepository;
import sbi.company.service.GetAllProductService;

@Service
public class GetAllProductServiceImpl implements GetAllProductService {

    @Autowired
    private ProductRepository repo;

    @Override
    public List<Product> getAllProducts() {
        return repo.findAll();
    }
}
