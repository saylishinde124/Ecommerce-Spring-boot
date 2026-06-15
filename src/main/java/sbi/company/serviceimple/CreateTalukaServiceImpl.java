package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Taluka;
import sbi.company.repository.TalukaRepository;
import sbi.company.service.CreateTalukaService;

@Service
public class CreateTalukaServiceImpl implements CreateTalukaService {

    @Autowired
    private TalukaRepository repo;

    @Override
    public Taluka saveTaluka(Taluka taluka) {
        return repo.save(taluka);
    }
}
