package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Taluka;
import sbi.company.repository.TalukaRepository;
import sbi.company.service.GetTalukaByIdService;

@Service
public class GetTalukaByIdServiceImpl implements GetTalukaByIdService {

    @Autowired
    private TalukaRepository repo;

    @Override
    public Taluka getTalukaById(int id) {
        return repo.findById(id).orElse(null);
    }
}
