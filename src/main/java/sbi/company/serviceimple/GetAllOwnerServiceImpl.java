package sbi.company.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Owner;
import sbi.company.repository.OwnerRepository;
import sbi.company.service.GetAllOwnerService;

@Service
public class GetAllOwnerServiceImpl implements GetAllOwnerService {

    @Autowired
    private OwnerRepository repo;

    @Override
    public List<Owner> getAllOwners() {
        return repo.findAll();
    }
}
