package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.CustomerQuery;
import sbi.company.repository.CustomerQueryRepository;
import sbi.company.service.GetCustomerQueryByIdService;

@Service
public class GetCustomerQueryByIdServiceImpl implements GetCustomerQueryByIdService {

    @Autowired
    private CustomerQueryRepository repo;

    @Override
    public CustomerQuery getCustomerQueryById(int id) {
        return repo.findById(id).orElse(null);
    }
}
