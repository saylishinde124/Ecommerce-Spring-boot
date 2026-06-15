package sbi.company.serviceimple;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Admin;
import sbi.company.repository.AdminRepository;
import sbi.company.service.CreateAdminService;

@Service
public class CreateAdminServiceImpl implements CreateAdminService {

    @Autowired
    private AdminRepository repo;

    @Override
    public Admin saveAdmin(Admin admin) {
        return repo.save(admin);
    }
}
