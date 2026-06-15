package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.repository.CustomerQueryRepository;
import sbi.company.service.DeleteCustomerQueryService;

@Service
public class DeleteCustomerQueryServiceImpl implements DeleteCustomerQueryService {

    @Autowired
    private CustomerQueryRepository repo;

    @Override
    public void deleteCustomerQuery(int id) {
        repo.deleteById(id);
    }
}