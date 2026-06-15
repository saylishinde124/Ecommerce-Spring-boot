package sbi.company.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Brand;
import sbi.company.repository.BrandRepository;
import sbi.company.service.GetAllBrandService;

@Service
public class GetAllBrandServiceImpl implements GetAllBrandService {

    @Autowired
    private BrandRepository repo;

    @Override
    public List<Brand> getAllBrands() {
        return repo.findAll();
    }
}
