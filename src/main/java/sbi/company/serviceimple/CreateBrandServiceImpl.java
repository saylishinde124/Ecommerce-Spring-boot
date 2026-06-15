package sbi.company.serviceimple;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Brand;
import sbi.company.repository.BrandRepository;
import sbi.company.service.CreateBrandService;

@Service
public class CreateBrandServiceImpl implements CreateBrandService {

    @Autowired
    private BrandRepository repo;

    @Override
    public Brand saveBrand(Brand brand) {
        return repo.save(brand);
    }
}
