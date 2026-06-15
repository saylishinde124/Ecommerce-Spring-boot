package sbi.company.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Category;
import sbi.company.repository.CategoryRepository;
import sbi.company.service.GetAllCategoryService;

@Service
public class GetAllCategoryServiceImpl implements GetAllCategoryService {

    @Autowired
    private CategoryRepository repo;

    @Override
    public List<Category> getAllCategories() {
        return repo.findAll();
    }
}
