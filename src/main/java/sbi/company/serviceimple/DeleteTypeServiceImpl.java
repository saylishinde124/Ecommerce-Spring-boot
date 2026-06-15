package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sbi.company.repository.TypeRepository;
import sbi.company.service.DeleteTypeService;

@Service
public class DeleteTypeServiceImpl implements DeleteTypeService {

    @Autowired
    private TypeRepository repo;

    @Override
    public void delete(int id) {
        repo.deleteById(id);
    }
}
