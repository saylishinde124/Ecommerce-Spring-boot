package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Role;
import sbi.company.repository.RoleRepository;
import sbi.company.service.CreateRoleService;

@Service
public class CreateRoleServiceImpl implements CreateRoleService {

    @Autowired
    private RoleRepository repo;

    @Override
    public Role saveRole(Role role) {
        return repo.save(role);
    }
}
