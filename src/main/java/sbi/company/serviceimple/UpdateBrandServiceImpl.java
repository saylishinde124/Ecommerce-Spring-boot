package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Brand;
import sbi.company.repository.BrandRepository;
import sbi.company.service.UpdateBrandService;

@Service
public class UpdateBrandServiceImpl implements UpdateBrandService {

    @Autowired
    private BrandRepository repo;

    @Override
    public Brand updateBrand(Brand brand) {
        return repo.save(brand);
    }
}
