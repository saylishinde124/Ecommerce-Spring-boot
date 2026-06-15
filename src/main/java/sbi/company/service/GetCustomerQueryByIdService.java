package sbi.company.service;

import sbi.company.entity.CustomerQuery;

public interface GetCustomerQueryByIdService {
    CustomerQuery getCustomerQueryById(int id);
}
