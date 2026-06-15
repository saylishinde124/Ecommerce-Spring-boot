package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Town;
import sbi.company.repository.TownRepository;
import sbi.company.service.GetTownByIdService;

@Service
public class GetTownByIdServiceImpl implements GetTownByIdService {

    @Autowired
    private TownRepository repo;

    @Override
    public Town getTownById(int id) {
        return repo.findById(id).orElse(null);
    }
}

