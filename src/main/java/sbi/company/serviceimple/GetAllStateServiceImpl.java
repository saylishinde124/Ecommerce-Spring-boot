package sbi.company.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.State;
import sbi.company.repository.StateRepository;
import sbi.company.service.GetAllStateService;

@Service
public class GetAllStateServiceImpl implements GetAllStateService {

    @Autowired
    private StateRepository repo;

    @Override
    public List<State> getAllStates() {
        return repo.findAll();
    }
}