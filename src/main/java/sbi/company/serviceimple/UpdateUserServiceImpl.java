package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.User;
import sbi.company.repository.UserRepository;
import sbi.company.service.UpdateUserService;

@Service
public class UpdateUserServiceImpl implements UpdateUserService {

    @Autowired
    private UserRepository repo;

    @Override
    public User updateUser(User user) {
        return repo.save(user);
    }
}
