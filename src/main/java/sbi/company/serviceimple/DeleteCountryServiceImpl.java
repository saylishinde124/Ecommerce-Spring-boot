package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.repository.CountryRepository;
import sbi.company.service.DeleteCountryService;

@Service
public class DeleteCountryServiceImpl implements DeleteCountryService {

    @Autowired
    private CountryRepository repo;

    @Override
    public void deleteCountry(int id) {
        repo.deleteById(id);
    }
}
