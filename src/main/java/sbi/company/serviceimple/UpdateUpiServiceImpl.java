package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sbi.company.entity.Upi;
import sbi.company.repository.UpiRepository;
import sbi.company.service.UpdateUpiService;

@Service
public class UpdateUpiServiceImpl implements UpdateUpiService {

    @Autowired
    private UpiRepository repo;

    @Override
    public Upi update(Upi upi) {
        return repo.save(upi);
    }
}
