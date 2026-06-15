package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Company;
import sbi.company.repository.CompanyRepository;
import sbi.company.service.GetCompanyByIdService;

@Service
public class GetCompanyByIdServiceImpl implements GetCompanyByIdService {

    @Autowired
    private CompanyRepository repo;

    @Override
    public Company getCompanyById(int id) {
        return repo.findById(id).orElse(null);
    }
}
