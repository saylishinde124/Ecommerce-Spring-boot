package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Category;
import sbi.company.repository.CategoryRepository;
import sbi.company.service.GetCategoryByIdService;

@Service
public class GetCategoryByIdServiceImpl implements GetCategoryByIdService {

    @Autowired
    private CategoryRepository repo;

    @Override
    public Category getCategoryById(int id) {
        return repo.findById(id).orElse(null);
    }
}
