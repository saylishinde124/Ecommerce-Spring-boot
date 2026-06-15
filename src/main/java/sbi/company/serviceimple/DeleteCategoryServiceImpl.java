package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.repository.CategoryRepository;
import sbi.company.service.DeleteCategoryService;

@Service
public class DeleteCategoryServiceImpl implements DeleteCategoryService {

    @Autowired
    private CategoryRepository repo;

    @Override
    public void deleteCategory(int id) {
        repo.deleteById(id);
    }
}
