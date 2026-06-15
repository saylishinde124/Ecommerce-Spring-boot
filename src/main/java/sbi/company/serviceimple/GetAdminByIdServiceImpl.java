package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Admin;
import sbi.company.repository.AdminRepository;
import sbi.company.service.GetAdminByIdService;

@Service
public class GetAdminByIdServiceImpl implements GetAdminByIdService {

    @Autowired
    private AdminRepository repo;

    @Override
    public Admin getAdminById(int id) {
        return repo.findById(id).orElse(null);
    }
}
