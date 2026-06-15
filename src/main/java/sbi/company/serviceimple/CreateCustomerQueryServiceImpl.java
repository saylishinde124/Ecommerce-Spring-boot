package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import sbi.company.entity.CustomerQuery;

import sbi.company.repository.CustomerQueryRepository;
import sbi.company.service.CreateCustomerQueryService;

@Service
public class CreateCustomerQueryServiceImpl implements CreateCustomerQueryService {

    @Autowired
    private CustomerQueryRepository repo;

    @Override
    public CustomerQuery saveCustomerQuery(CustomerQuery query) {
        return repo.save(query);
    }
}
