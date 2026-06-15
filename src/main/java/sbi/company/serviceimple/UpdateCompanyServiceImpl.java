package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Company;
import sbi.company.repository.CompanyRepository;
import sbi.company.service.UpdateCompanyService;

@Service
public class UpdateCompanyServiceImpl implements UpdateCompanyService {

    @Autowired
    private CompanyRepository repo;

    @Override
    public Company updateCompany(Company company) {
        return repo.save(company);
    }
}
