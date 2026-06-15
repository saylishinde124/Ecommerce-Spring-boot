package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import sbi.company.entity.Country;

import sbi.company.repository.CountryRepository;
import sbi.company.service.CreateCountryService;

@Service
public class CreateCountryServiceImpl implements CreateCountryService {

    @Autowired
    private CountryRepository repo;

    @Override
    public Country saveCountry(Country country) {
        return repo.save(country);
    }
}
