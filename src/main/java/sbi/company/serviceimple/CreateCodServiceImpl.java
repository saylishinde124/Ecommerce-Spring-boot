package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import sbi.company.entity.Cod;

import sbi.company.repository.CodRepository;
import sbi.company.service.CreateCodService;

@Service
public class CreateCodServiceImpl implements CreateCodService {

    @Autowired
    private CodRepository repo;

    @Override
    public Cod saveCod(Cod cod) {
        return repo.save(cod);
    }
}