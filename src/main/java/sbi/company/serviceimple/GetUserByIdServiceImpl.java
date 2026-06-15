package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.User;
import sbi.company.repository.UserRepository;
import sbi.company.service.GetUserByIdService;

@Service
public class GetUserByIdServiceImpl implements GetUserByIdService {

    @Autowired
    private UserRepository repo;

    @Override
    public User getUserById(int id) {
        return repo.findById(id).orElse(null);
    }
}
