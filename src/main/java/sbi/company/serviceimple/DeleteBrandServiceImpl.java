package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.repository.BrandRepository;
import sbi.company.service.DeleteBrandService;

@Service
public class DeleteBrandServiceImpl implements DeleteBrandService {

    @Autowired
    private BrandRepository repo;

    @Override
    public void deleteBrand(int id) {
        repo.deleteById(id);
    }
}
