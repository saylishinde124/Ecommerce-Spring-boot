package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.CompanyResponse;
import sbi.company.repository.CompanyResponseRepository;
import sbi.company.service.UpdateCompanyResponseService;

@Service
public class UpdateCompanyResponseServiceImpl implements UpdateCompanyResponseService {

    @Autowired
    private CompanyResponseRepository repo;

    @Override
    public CompanyResponse updateCompanyResponse(CompanyResponse response) {
        return repo.save(response);
    }
}
