package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sbi.company.entity.Type;
import sbi.company.repository.TypeRepository;
import sbi.company.service.GetTypeByIdService;

@Service
public class GetTypeByIdServiceImpl implements GetTypeByIdService {

    @Autowired
    private TypeRepository repo;

    @Override
    public Type getById(int id) {
        return repo.findById(id).orElse(null);
    }
}
