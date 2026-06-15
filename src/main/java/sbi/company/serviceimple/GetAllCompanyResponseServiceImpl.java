package sbi.company.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.CompanyResponse;
import sbi.company.repository.CompanyResponseRepository;
import sbi.company.service.GetAllCompanyResponseService;

@Service
public class GetAllCompanyResponseServiceImpl implements GetAllCompanyResponseService {

    @Autowired
    private CompanyResponseRepository repo;

    @Override
    public List<CompanyResponse> getAllCompanyResponses() {
        return repo.findAll();
    }
}
