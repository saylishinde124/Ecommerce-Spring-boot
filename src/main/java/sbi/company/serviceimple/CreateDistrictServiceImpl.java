package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import sbi.company.entity.District;

import sbi.company.repository.DistrictRepository;
import sbi.company.service.CreateDistrictService;

@Service
public class CreateDistrictServiceImpl implements CreateDistrictService {

    @Autowired
    private DistrictRepository repo;

    @Override
    public District saveDistrict(District district) {
        return repo.save(district);
    }
}
