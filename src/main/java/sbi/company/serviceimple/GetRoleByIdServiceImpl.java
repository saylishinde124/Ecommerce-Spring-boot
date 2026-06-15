package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Role;
import sbi.company.repository.RoleRepository;
import sbi.company.service.GetRoleByIdService;

@Service
public class GetRoleByIdServiceImpl implements GetRoleByIdService {

    @Autowired
    private RoleRepository repo;

    @Override
    public Role getRoleById(int id) {
        return repo.findById(id).orElse(null);
    }
}