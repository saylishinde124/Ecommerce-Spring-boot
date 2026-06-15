package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.repository.CodRepository;
import sbi.company.service.DeleteCodService;

@Service
public class DeleteCodServiceImpl implements DeleteCodService {

    @Autowired
    private CodRepository repo;

    @Override
    public void deleteCod(int id) {
        repo.deleteById(id);
    }
}
