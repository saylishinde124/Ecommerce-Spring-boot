package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Manager;
import sbi.company.repository.ManagerRepository;
import sbi.company.service.GetManagerByIdService;

@Service
public class GetManagerByIdServiceImpl implements GetManagerByIdService {

    @Autowired
    private ManagerRepository repo;

    @Override
    public Manager getManagerById(int id) {
        return repo.findById(id).orElse(null);
    }
}
