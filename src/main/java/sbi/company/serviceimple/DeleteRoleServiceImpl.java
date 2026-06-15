package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.repository.RoleRepository;
import sbi.company.service.DeleteRoleService;

@Service
public class DeleteRoleServiceImpl implements DeleteRoleService {

    @Autowired
    private RoleRepository repo;

    @Override
    public void deleteRole(int id) {
        repo.deleteById(id);
    }
}
