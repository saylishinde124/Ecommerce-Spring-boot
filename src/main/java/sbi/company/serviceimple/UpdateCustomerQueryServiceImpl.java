package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.CustomerQuery;
import sbi.company.repository.CustomerQueryRepository;
import sbi.company.service.UpdateCustomerQueryService;

@Service
public class UpdateCustomerQueryServiceImpl implements UpdateCustomerQueryService {

    @Autowired
    private CustomerQueryRepository repo;

    @Override
    public CustomerQuery updateCustomerQuery(CustomerQuery cq) {
        return repo.save(cq);
    }
}
