package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.repository.TalukaRepository;
import sbi.company.service.DeleteTalukaService;

@Service
public class DeleteTalukaServiceImpl implements DeleteTalukaService {

    @Autowired
    private TalukaRepository repo;

    @Override
    public void deleteTaluka(int id) {
        repo.deleteById(id);
    }
}
