package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Country;
import sbi.company.repository.CountryRepository;
import sbi.company.service.UpdateCountryService;

@Service
public class UpdateCountryServiceImpl implements UpdateCountryService {

    @Autowired
    private CountryRepository repo;

    @Override
    public Country updateCountry(Country country) {
        return repo.save(country);
    }
}
