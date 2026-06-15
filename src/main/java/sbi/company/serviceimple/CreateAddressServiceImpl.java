package sbi.company.serviceimple;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Address;
import sbi.company.repository.AddressRepository;
import sbi.company.service.CreateAddressService;

@Service
public class CreateAddressServiceImpl implements CreateAddressService {

    @Autowired
    private AddressRepository repo;

    @Override
    public Address saveAddress(Address address) {
        return repo.save(address);
    }
}
