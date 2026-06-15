package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Taluka;
import sbi.company.repository.TalukaRepository;
import sbi.company.service.UpdateTalukaService;

@Service
public class UpdateTalukaServiceImpl implements UpdateTalukaService {

    @Autowired
    private TalukaRepository repo;

    @Override
    public Taluka updateTaluka(Taluka taluka) {
        return repo.save(taluka);
    }
}
