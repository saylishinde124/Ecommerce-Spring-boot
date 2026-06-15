package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.repository.AddressRepository;
import sbi.company.service.DeleteAddressService;

@Service
public class DeleteAddressServiceImpl implements DeleteAddressService {

    @Autowired
    private AddressRepository repo;

    @Override
    public void deleteAddress(int id) {
        repo.deleteById(id);
    }
}
