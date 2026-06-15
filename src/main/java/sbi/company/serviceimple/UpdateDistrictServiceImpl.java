package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.District;
import sbi.company.repository.DistrictRepository;
import sbi.company.service.UpdateDistrictService;

@Service
public class UpdateDistrictServiceImpl implements UpdateDistrictService {

    @Autowired
    private DistrictRepository repo;

    @Override
    public District updateDistrict(District district) {
        return repo.save(district);
    }
}
