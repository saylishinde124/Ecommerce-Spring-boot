package sbi.company.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Address;
import sbi.company.repository.AddressRepository;
import sbi.company.service.GetAllAddressService;

@Service
public class GetAllAddressServiceImpl implements GetAllAddressService {

    @Autowired
    private AddressRepository repo;

    @Override
    public List<Address> getAllAddresses() {
        return repo.findAll();
    }
}
