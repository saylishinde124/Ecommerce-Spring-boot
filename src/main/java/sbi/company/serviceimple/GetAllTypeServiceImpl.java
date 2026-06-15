package sbi.company.serviceimple;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sbi.company.entity.Type;
import sbi.company.repository.TypeRepository;
import sbi.company.service.GetAllTypeService;

@Service
public class GetAllTypeServiceImpl implements GetAllTypeService {

    @Autowired
    private TypeRepository repo;

    @Override
    public List<Type> getAll() {
        return repo.findAll();
    }
}
