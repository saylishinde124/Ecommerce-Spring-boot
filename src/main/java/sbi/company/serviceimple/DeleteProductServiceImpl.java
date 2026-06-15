package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.repository.ProductRepository;
import sbi.company.service.DeleteProductService;

@Service
public class DeleteProductServiceImpl implements DeleteProductService {

    @Autowired
    private ProductRepository repo;

    @Override
    public void deleteProduct(int id) {
        repo.deleteById(id);
    }
}
