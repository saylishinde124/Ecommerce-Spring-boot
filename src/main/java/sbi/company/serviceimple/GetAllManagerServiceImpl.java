package sbi.company.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Manager;
import sbi.company.repository.ManagerRepository;
import sbi.company.service.GetAllManagerService;

@Service
public class GetAllManagerServiceImpl implements GetAllManagerService {

    @Autowired
    private ManagerRepository repo;

    @Override
    public List<Manager> getAllManagers() {
        return repo.findAll();
    }
}
