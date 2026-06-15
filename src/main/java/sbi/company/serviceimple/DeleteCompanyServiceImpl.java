package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.repository.CompanyRepository;
import sbi.company.service.DeleteCompanyService;

@Service
public class DeleteCompanyServiceImpl implements DeleteCompanyService {

    @Autowired
    private CompanyRepository repo;

    @Override
    public void deleteCompany(int id) {
        repo.deleteById(id);
    }
}
