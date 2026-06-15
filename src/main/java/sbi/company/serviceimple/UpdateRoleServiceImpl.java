package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Role;
import sbi.company.repository.RoleRepository;
import sbi.company.service.UpdateRoleService;

@Service
public class UpdateRoleServiceImpl implements UpdateRoleService {

    @Autowired
    private RoleRepository repo;

    @Override
    public Role updateRole(Role role) {
        return repo.save(role);
    }
}
