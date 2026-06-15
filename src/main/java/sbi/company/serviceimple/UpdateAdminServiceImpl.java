package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Admin;
import sbi.company.repository.AdminRepository;
import sbi.company.service.UpdateAdminService;

@Service
public class UpdateAdminServiceImpl implements UpdateAdminService {

    @Autowired
    private AdminRepository repo;

    @Override
    public Admin updateAdmin(Admin admin) {
        return repo.save(admin);
    }
}
