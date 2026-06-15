package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.repository.CompanyResponseRepository;
import sbi.company.service.DeleteCompanyResponseService;

@Service
public class DeleteCompanyResponseServiceImpl implements DeleteCompanyResponseService {

    @Autowired
    private CompanyResponseRepository repo;

    @Override
    public void deleteCompanyResponse(int id) {
        repo.deleteById(id);
    }
}
