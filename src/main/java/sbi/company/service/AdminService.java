package sbi.company.service;



import java.util.List;
import sbi.company.entity.Admin;

public interface AdminService {

    Admin saveAdmin(Admin admin);

    Admin getAdminById(int id);

    List<Admin> getAllAdmins();

    Admin updateAdmin(Admin admin);

    void deleteAdmin(int id);
}
