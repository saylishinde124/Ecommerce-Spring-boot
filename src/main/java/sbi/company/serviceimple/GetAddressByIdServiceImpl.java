package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Address;
import sbi.company.repository.AddressRepository;
import sbi.company.service.GetAddressByIdService;


@Service
public class GetAddressByIdServiceImpl implements GetAddressByIdService {

    @Autowired
    private AddressRepository repo;

    @Override
    public Address getAddressById(int id) {
        return repo.findById(id).orElse(null);
    }
}
