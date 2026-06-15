package sbi.company.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Taluka;
import sbi.company.repository.TalukaRepository;
import sbi.company.service.GetAllTalukaService;

@Service
public class GetAllTalukaServiceImpl implements GetAllTalukaService {

    @Autowired
    private TalukaRepository repo;

    @Override
    public List<Taluka> getAllTalukas() {
        return repo.findAll();
    }
}
