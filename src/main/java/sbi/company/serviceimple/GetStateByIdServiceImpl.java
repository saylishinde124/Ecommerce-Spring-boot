package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.State;
import sbi.company.repository.StateRepository;
import sbi.company.service.GetStateByIdService;

@Service
public class GetStateByIdServiceImpl implements GetStateByIdService {

    @Autowired
    private StateRepository repo;

    @Override
    public State getStateById(int id) {
        return repo.findById(id).orElse(null);
    }
}
