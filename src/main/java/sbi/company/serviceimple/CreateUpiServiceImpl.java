package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sbi.company.entity.Upi;
import sbi.company.repository.UpiRepository;
import sbi.company.service.CreateUpiService;

@Service
public class CreateUpiServiceImpl implements CreateUpiService {

    @Autowired
    private UpiRepository repo;

    @Override
    public Upi saveUpi(Upi upi) {
        return repo.save(upi);
    }
}
