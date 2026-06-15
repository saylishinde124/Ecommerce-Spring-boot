package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.CompanyResponse;
import sbi.company.repository.CompanyResponseRepository;
import sbi.company.service.GetCompanyResponseByIdService;

@Service
public class GetCompanyResponseByIdServiceImpl implements GetCompanyResponseByIdService {

    @Autowired
    private CompanyResponseRepository repo;

    @Override
    public CompanyResponse getCompanyResponseById(int id) {
        return repo.findById(id).orElse(null);
    }
}
