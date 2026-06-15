package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.repository.AdminRepository;
import sbi.company.service.DeleteAdminService;

@Service
public class DeleteAdminServiceImpl implements DeleteAdminService {

    @Autowired
    private AdminRepository repo;

    @Override
    public void deleteAdmin(int id) {
        repo.deleteById(id);
    }
}
