package sbi.company.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sbi.company.entity.Admin;
import sbi.company.service.*;

@Component
public class AdminFactory {

    @Autowired
    private CreateAdminService createService;

    @Autowired
    private UpdateAdminService updateService;

    @Autowired
    private DeleteAdminService deleteService;

    @Autowired
    private GetAdminByIdService getByIdService;

    @Autowired
    private GetAllAdminService getAllService;

    public Object execute(int choice, Admin admin, Integer id) {

        switch (choice) {

            case 1:
                return createService.saveAdmin(admin);

            case 2:
                return updateService.updateAdmin(admin);

            case 3:
                deleteService.deleteAdmin(id);
                return "Admin deleted successfully";

            case 4:
                return getByIdService.getAdminById(id);

            case 5:
                return getAllService.getAllAdmins();

            default:
                return "Invalid Choice";
        }
    }
}