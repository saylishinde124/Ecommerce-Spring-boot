package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sbi.company.entity.Type;
import sbi.company.repository.TypeRepository;
import sbi.company.service.CreateTypeService;

@Service
public class CreateTypeServiceImpl implements CreateTypeService {

    @Autowired
    private TypeRepository repo;

    @Override
    public Type saveType(Type type) {
        return repo.save(type);
    }
}
