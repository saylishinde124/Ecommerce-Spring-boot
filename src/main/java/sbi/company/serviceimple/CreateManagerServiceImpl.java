package sbi.company.serviceimple;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import sbi.company.entity.Manager;

import sbi.company.repository.ManagerRepository;
import sbi.company.service.CreateManagerService;

@Service
public class CreateManagerServiceImpl implements CreateManagerService {

    @Autowired
    private ManagerRepository repo;

    @Override
    public Manager saveManager(Manager manager) {
        return repo.save(manager);
    }
}