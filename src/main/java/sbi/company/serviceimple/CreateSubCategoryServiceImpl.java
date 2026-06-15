package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.SubCategory;
import sbi.company.repository.SubCategoryRepository;
import sbi.company.service.CreateSubCategoryService;

@Service
public class CreateSubCategoryServiceImpl implements CreateSubCategoryService {

    @Autowired
    private SubCategoryRepository repo;

    @Override
    public SubCategory saveSubCategory(SubCategory subCategory) {
        return repo.save(subCategory);
    }
}
