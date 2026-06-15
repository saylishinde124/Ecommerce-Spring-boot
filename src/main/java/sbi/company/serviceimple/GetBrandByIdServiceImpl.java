package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Brand;
import sbi.company.repository.BrandRepository;
import sbi.company.service.GetBrandByIdService;

@Service
public class GetBrandByIdServiceImpl implements GetBrandByIdService {

    @Autowired
    private BrandRepository repo;

    @Override
    public Brand getBrandById(int id) {
        return repo.findById(id).orElse(null);
    }
}
