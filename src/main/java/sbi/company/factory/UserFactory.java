package sbi.company.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sbi.company.entity.User;
import sbi.company.service.CreateUserService;
import sbi.company.service.DeleteUserService;
import sbi.company.service.GetAllUserService;
import sbi.company.service.GetUserByIdService;
import sbi.company.service.UpdateUserService;

@Component
public class UserFactory {

    @Autowired
    private CreateUserService createService;

    @Autowired
    private UpdateUserService updateService;

    @Autowired
    private DeleteUserService deleteService;

    @Autowired
    private GetUserByIdService getByIdService;

    @Autowired
    private GetAllUserService getAllService;

    public Object execute(int choice, User user, Integer id) {

        switch (choice) {

            case 1:
                return createService.saveUser(user);

            case 2:
                return updateService.updateUser(user);

            case 3:
                deleteService.deleteUser(id);
                return "User Deleted Successfully";

            case 4:
                return getByIdService.getUserById(id);

            case 5:
                return getAllService.getAllUsers();

            default:
                return "Invalid Choice";
        }
    }
}
