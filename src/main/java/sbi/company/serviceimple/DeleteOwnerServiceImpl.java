package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.repository.OwnerRepository;
import sbi.company.service.DeleteOwnerService;

@Service
public class DeleteOwnerServiceImpl implements DeleteOwnerService {

    @Autowired
    private OwnerRepository repo;

    @Override
    public void deleteOwner(int id) {
        repo.deleteById(id);
    }
}
