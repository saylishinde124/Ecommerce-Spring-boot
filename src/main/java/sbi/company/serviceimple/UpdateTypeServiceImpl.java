package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sbi.company.entity.Type;
import sbi.company.repository.TypeRepository;
import sbi.company.service.UpdateTypeService;

@Service
public class UpdateTypeServiceImpl implements UpdateTypeService {

    @Autowired
    private TypeRepository repo;

    @Override
    public Type update(Type type) {
        return repo.save(type);
    }
}
