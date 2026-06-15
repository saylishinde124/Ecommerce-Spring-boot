package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.State;
import sbi.company.repository.StateRepository;
import sbi.company.service.CreateStateService;

@Service
public class CreateStateServiceImpl implements CreateStateService {

    @Autowired
    private StateRepository repo;

    @Override
    public State saveState(State state) {
        return repo.save(state);
    }
}
