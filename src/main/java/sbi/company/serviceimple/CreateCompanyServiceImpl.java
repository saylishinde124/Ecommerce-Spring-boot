package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import sbi.company.entity.Company;

import sbi.company.repository.CompanyRepository;
import sbi.company.service.CreateCompanyService;

@Service
public class CreateCompanyServiceImpl implements CreateCompanyService {

    @Autowired
    private CompanyRepository repo;

    @Override
    public Company saveCompany(Company company) {
        return repo.save(company);
    }
}

