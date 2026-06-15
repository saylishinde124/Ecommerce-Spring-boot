package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Owner;
import sbi.company.repository.OwnerRepository;
import sbi.company.service.UpdateOwnerService;

@Service
public class UpdateOwnerServiceImpl implements UpdateOwnerService {

    @Autowired
    private OwnerRepository repo;

    @Override
    public Owner updateOwner(Owner owner) {
        return repo.save(owner);
    }
}
