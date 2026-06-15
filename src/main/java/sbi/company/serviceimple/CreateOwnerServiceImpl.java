package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import sbi.company.entity.Owner;

import sbi.company.repository.OwnerRepository;
import sbi.company.service.CreateOwnerService;

@Service
public class CreateOwnerServiceImpl implements CreateOwnerService {

    @Autowired
    private OwnerRepository repo;

    @Override
    public Owner saveOwner(Owner owner) {
        return repo.save(owner);
    }
}
