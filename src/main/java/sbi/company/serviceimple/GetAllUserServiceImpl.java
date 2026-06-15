package sbi.company.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.User;
import sbi.company.repository.UserRepository;
import sbi.company.service.GetAllUserService;

@Service
public class GetAllUserServiceImpl implements GetAllUserService {

    @Autowired
    private UserRepository repo;

    @Override
    public List<User> getAllUsers() {
        return repo.findAll();
    }
}
