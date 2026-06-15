package sbi.company.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Admin;
import sbi.company.repository.AdminRepository;
import sbi.company.service.GetAllAdminService;

@Service
public class GetAllAdminServiceImpl implements GetAllAdminService {

    @Autowired
    private AdminRepository repo;

    @Override
    public List<Admin> getAllAdmins() {
        return repo.findAll();
    }
}
