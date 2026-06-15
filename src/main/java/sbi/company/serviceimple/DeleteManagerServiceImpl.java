package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.repository.ManagerRepository;
import sbi.company.service.DeleteManagerService;

@Service
public class DeleteManagerServiceImpl implements DeleteManagerService {

    @Autowired
    private ManagerRepository repo;

    @Override
    public void deleteManager(int id) {
        repo.deleteById(id);
    }
}
