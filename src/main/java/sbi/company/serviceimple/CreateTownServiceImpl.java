package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Town;
import sbi.company.repository.TownRepository;
import sbi.company.service.CreateTownService;

@Service
public class CreateTownServiceImpl implements CreateTownService {

    @Autowired
    private TownRepository repo;

    @Override
    public Town saveTown(Town town) {
        return repo.save(town);
    }
}
