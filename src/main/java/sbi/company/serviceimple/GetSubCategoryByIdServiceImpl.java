package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.SubCategory;
import sbi.company.repository.SubCategoryRepository;
import sbi.company.service.GetSubCategoryByIdService;

@Service
public class GetSubCategoryByIdServiceImpl implements GetSubCategoryByIdService {

    @Autowired
    private SubCategoryRepository repo;

    @Override
    public SubCategory getSubCategoryById(int id) {
        return repo.findById(id).orElse(null);
    }
}
