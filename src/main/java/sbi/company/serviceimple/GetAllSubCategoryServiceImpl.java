package sbi.company.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.SubCategory;
import sbi.company.repository.SubCategoryRepository;
import sbi.company.service.GetAllSubCategoryService;

@Service
public class GetAllSubCategoryServiceImpl implements GetAllSubCategoryService {

    @Autowired
    private SubCategoryRepository repo;

    @Override
    public List<SubCategory> getAllSubCategories() {
        return repo.findAll();
    }
}
