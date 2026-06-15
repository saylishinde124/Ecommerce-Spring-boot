package sbi.company.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Cod;
import sbi.company.repository.CodRepository;
import sbi.company.service.GetAllCodService;

@Service
public class GetAllCodServiceImpl implements GetAllCodService {

    @Autowired
    private CodRepository repo;

    @Override
    public List<Cod> getAllCods() {
        return repo.findAll();
    }
}
