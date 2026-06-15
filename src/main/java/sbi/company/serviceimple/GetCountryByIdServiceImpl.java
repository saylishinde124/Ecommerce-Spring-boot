package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Country;
import sbi.company.repository.CountryRepository;
import sbi.company.service.GetCountryByIdService;

@Service
public class GetCountryByIdServiceImpl implements GetCountryByIdService {

    @Autowired
    private CountryRepository repo;

    @Override
    public Country getCountryById(int id) {
        return repo.findById(id).orElse(null);
    }
}
