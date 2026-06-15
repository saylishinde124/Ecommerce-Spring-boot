package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.repository.TownRepository;
import sbi.company.service.DeleteTownService;

@Service
public class DeleteTownServiceImpl implements DeleteTownService {

    @Autowired
    private TownRepository repo;

    @Override
    public void deleteTown(int id) {
        repo.deleteById(id);
    }
}
