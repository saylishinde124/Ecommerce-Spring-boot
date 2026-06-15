package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.repository.SubCategoryRepository;
import sbi.company.service.DeleteSubCategoryService;

@Service
public class DeleteSubCategoryServiceImpl implements DeleteSubCategoryService {

    @Autowired
    private SubCategoryRepository repo;

    @Override
    public void deleteSubCategory(int id) {
        repo.deleteById(id);
    }
}
