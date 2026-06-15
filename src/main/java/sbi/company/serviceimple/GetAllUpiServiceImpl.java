package sbi.company.serviceimple;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sbi.company.entity.Upi;
import sbi.company.repository.UpiRepository;
import sbi.company.service.GetAllUpiService;

@Service
public class GetAllUpiServiceImpl implements GetAllUpiService {

    @Autowired
    private UpiRepository repo;

    @Override
    public List<Upi> getAll() {
        return repo.findAll();
    }
}
