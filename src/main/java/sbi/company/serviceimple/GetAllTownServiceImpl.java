package sbi.company.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Town;
import sbi.company.repository.TownRepository;
import sbi.company.service.GetAllTownService;

@Service
public class GetAllTownServiceImpl implements GetAllTownService {

    @Autowired
    private TownRepository repo;

    @Override
    public List<Town> getAllTowns() {
        return repo.findAll();
    }
}
