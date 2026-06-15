package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.SubCategory;
import sbi.company.repository.SubCategoryRepository;
import sbi.company.service.UpdateSubCategoryService;

@Service
public class UpdateSubCategoryServiceImpl implements UpdateSubCategoryService {

    @Autowired
    private SubCategoryRepository repo;

    @Override
    public SubCategory updateSubCategory(SubCategory subCategory) {
        return repo.save(subCategory);
    }
}
