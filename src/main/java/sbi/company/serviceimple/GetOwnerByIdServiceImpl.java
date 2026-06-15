package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Owner;
import sbi.company.repository.OwnerRepository;
import sbi.company.service.GetOwnerByIdService;

@Service
public class GetOwnerByIdServiceImpl implements GetOwnerByIdService {

    @Autowired
    private OwnerRepository repo;

    @Override
    public Owner getOwnerById(int id) {
        return repo.findById(id).orElse(null);
    }
}
