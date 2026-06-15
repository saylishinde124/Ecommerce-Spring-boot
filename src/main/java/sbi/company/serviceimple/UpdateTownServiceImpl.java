package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Town;
import sbi.company.repository.TownRepository;
import sbi.company.service.UpdateTownService;

@Service
public class UpdateTownServiceImpl implements UpdateTownService {

    @Autowired
    private TownRepository repo;

    @Override
    public Town updateTown(Town town) {
        return repo.save(town);
    }
}
