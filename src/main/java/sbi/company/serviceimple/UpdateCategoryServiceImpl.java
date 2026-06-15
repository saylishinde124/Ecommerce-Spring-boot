package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Category;
import sbi.company.repository.CategoryRepository;
import sbi.company.service.UpdateCategoryService;

@Service
public class UpdateCategoryServiceImpl implements UpdateCategoryService {

    @Autowired
    private CategoryRepository repo;

    @Override
    public Category updateCategory(Category category) {
        return repo.save(category);
    }
}
