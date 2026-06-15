package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.repository.UserRepository;
import sbi.company.service.DeleteUserService;

@Service
public class DeleteUserServiceImpl implements DeleteUserService {

    @Autowired
    private UserRepository repo;

    @Override
    public void deleteUser(int id) {
        repo.deleteById(id);
    }
}
