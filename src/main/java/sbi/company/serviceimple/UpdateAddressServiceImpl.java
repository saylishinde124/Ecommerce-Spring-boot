package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Address;
import sbi.company.repository.AddressRepository;
import sbi.company.service.UpdateAddressService;

@Service
public class UpdateAddressServiceImpl implements UpdateAddressService {

    @Autowired
    private AddressRepository repo;

    @Override
    public Address updateAddress(Address address) {
        return repo.save(address);
    }
}
