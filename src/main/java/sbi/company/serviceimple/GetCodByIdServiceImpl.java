package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Cod;
import sbi.company.repository.CodRepository;
import sbi.company.service.GetCodByIdService;

@Service
public class GetCodByIdServiceImpl implements GetCodByIdService {

    @Autowired
    private CodRepository repo;

    @Override
    public Cod getCodById(int id) {
        return repo.findById(id).orElse(null);
    }
}
