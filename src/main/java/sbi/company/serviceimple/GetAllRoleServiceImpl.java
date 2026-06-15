package sbi.company.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Role;
import sbi.company.repository.RoleRepository;
import sbi.company.service.GetAllRoleService;

@Service
public class GetAllRoleServiceImpl implements GetAllRoleService {

    @Autowired
    private RoleRepository repo;

    @Override
    public List<Role> getAllRoles() {
        return repo.findAll();
    }
}
