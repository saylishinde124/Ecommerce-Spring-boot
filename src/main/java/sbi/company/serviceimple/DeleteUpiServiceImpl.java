package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sbi.company.repository.UpiRepository;
import sbi.company.service.DeleteUpiService;

@Service
public class DeleteUpiServiceImpl implements DeleteUpiService {

    @Autowired
    private UpiRepository repo;

    @Override
    public void delete(int id) {
        repo.deleteById(id);
    }
}
