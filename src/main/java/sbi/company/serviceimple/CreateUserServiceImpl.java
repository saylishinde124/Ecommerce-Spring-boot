package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.User;

import sbi.company.repository.UserRepository;
import sbi.company.service.CreateUserService;

@Service
public class CreateUserServiceImpl implements CreateUserService {

    @Autowired
    private UserRepository repo;

    @Override
    public User saveUser(User user) {

    

        return repo.save(user);
    }
}
