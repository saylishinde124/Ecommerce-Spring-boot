package sbi.company.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.District;
import sbi.company.repository.DistrictRepository;
import sbi.company.service.GetAllDistrictService;

@Service
public class GetAllDistrictServiceImpl implements GetAllDistrictService {

    @Autowired
    private DistrictRepository repo;

    @Override
    public List<District> getAllDistricts() {
        return repo.findAll();
    }
}
