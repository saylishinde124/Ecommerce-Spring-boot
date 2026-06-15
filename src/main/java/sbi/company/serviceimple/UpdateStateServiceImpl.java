package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.State;
import sbi.company.repository.StateRepository;
import sbi.company.service.UpdateStateService;

@Service
public class UpdateStateServiceImpl implements UpdateStateService {

    @Autowired
    private StateRepository repo;

    @Override
    public State updateState(State state) {
        return repo.save(state);
    }
}
