package sbi.company.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Company;
import sbi.company.repository.CompanyRepository;
import sbi.company.service.GetAllCompanyService;

@Service
public class GetAllCompanyServiceImpl implements GetAllCompanyService {

    @Autowired
    private CompanyRepository repo;

    @Override
    public List<Company> getAllCompanies() {
        return repo.findAll();
    }
}
