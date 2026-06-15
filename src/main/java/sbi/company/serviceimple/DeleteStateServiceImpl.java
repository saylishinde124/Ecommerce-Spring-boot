package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.repository.StateRepository;
import sbi.company.service.DeleteStateService;

@Service
public class DeleteStateServiceImpl implements DeleteStateService {

    @Autowired
    private StateRepository repo;

    @Override
    public void deleteState(int id) {
        repo.deleteById(id);
    }
}
