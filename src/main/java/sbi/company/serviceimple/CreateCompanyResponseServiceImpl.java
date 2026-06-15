package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import sbi.company.entity.CompanyResponse;

import sbi.company.repository.CompanyResponseRepository;
import sbi.company.service.CreateCompanyResponseService;

@Service
public class CreateCompanyResponseServiceImpl implements CreateCompanyResponseService {

    @Autowired
    private CompanyResponseRepository repo;

    @Override
    public CompanyResponse saveCompanyResponse(CompanyResponse response) {
        return repo.save(response);
    }
}
