package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import sbi.company.entity.Category;

import sbi.company.repository.CategoryRepository;
import sbi.company.service.CreateCategoryService;
@Service
public class CreateCategoryServiceImpl implements CreateCategoryService {

    @Autowired
    private CategoryRepository repo;

    @Override
    public Category saveCategory(Category category) {
        return repo.save(category);
    }
}
