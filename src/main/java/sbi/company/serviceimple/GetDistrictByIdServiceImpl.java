package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.District;
import sbi.company.repository.DistrictRepository;
import sbi.company.service.GetDistrictByIdService;

@Service
public class GetDistrictByIdServiceImpl implements GetDistrictByIdService {

    @Autowired
    private DistrictRepository repo;

    @Override
    public District getDistrictById(int id) {
        return repo.findById(id).orElse(null);
    }
}
