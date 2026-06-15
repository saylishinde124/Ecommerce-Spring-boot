package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Cod;
import sbi.company.repository.CodRepository;
import sbi.company.service.UpdateCodService;

@Service
public class UpdateCodServiceImpl implements UpdateCodService {

    @Autowired
    private CodRepository repo;

    @Override
    public Cod updateCod(Cod cod) {
        return repo.save(cod);
    }
}
