package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sbi.company.entity.Upi;
import sbi.company.repository.UpiRepository;
import sbi.company.service.GetUpiByIdService;

@Service
public class GetUpiByIdServiceImpl implements GetUpiByIdService {

    @Autowired
    private UpiRepository repo;

    @Override
    public Upi getById(int id) {
        return repo.findById(id).orElse(null);
    }
}
