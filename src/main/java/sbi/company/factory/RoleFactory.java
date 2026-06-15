package sbi.company.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sbi.company.entity.Role;
import sbi.company.service.*;

@Component
public class RoleFactory {

    @Autowired private CreateRoleService createService;
    @Autowired private UpdateRoleService updateService;
    @Autowired private DeleteRoleService deleteService;
    @Autowired private GetRoleByIdService getByIdService;
    @Autowired private GetAllRoleService getAllService;

    public Object execute(int choice, Role role, Integer id) {

        switch (choice) {

            case 1:
                return createService.saveRole(role);

            case 2:
                return updateService.updateRole(role);

            case 3:
                deleteService.deleteRole(id);
                return "Role Deleted Successfully";

            case 4:
                return getByIdService.getRoleById(id);

            case 5:
                return getAllService.getAllRoles();

            default:
                return "Invalid Choice";
        }
    }
}
