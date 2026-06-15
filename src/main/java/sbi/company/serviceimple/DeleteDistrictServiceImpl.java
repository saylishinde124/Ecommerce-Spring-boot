package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.repository.DistrictRepository;
import sbi.company.service.DeleteDistrictService;

@Service
public class DeleteDistrictServiceImpl implements DeleteDistrictService {

    @Autowired
    private DistrictRepository repo;

    @Override
    public void deleteDistrict(int id) {
        repo.deleteById(id);
    }
}
