package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Manager;
import sbi.company.repository.ManagerRepository;
import sbi.company.service.UpdateManagerService;

@Service
public class UpdateManagerServiceImpl implements UpdateManagerService {

    @Autowired
    private ManagerRepository repo;

    @Override
    public Manager updateManager(Manager manager) {
        return repo.save(manager);
    }
}
