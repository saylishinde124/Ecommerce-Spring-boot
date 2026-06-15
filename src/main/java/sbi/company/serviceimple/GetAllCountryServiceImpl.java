package sbi.company.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Country;
import sbi.company.repository.CountryRepository;
import sbi.company.service.GetAllCountryService;

@Service
public class GetAllCountryServiceImpl implements GetAllCountryService {

    @Autowired
    private CountryRepository repo;

    @Override
    public List<Country> getAllCountries() {
        return repo.findAll();
    }
}
