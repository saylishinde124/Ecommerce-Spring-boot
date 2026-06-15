package sbi.company.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.CustomerQuery;
import sbi.company.repository.CustomerQueryRepository;
import sbi.company.service.GetAllCustomerQueryService;

@Service
public class GetAllCustomerQueryServiceImpl implements GetAllCustomerQueryService {

    @Autowired
    private CustomerQueryRepository repo;

    @Override
    public List<CustomerQuery> getAllCustomerQueries() {
        return repo.findAll();
    }
}
