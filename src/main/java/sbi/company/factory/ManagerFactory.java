package sbi.company.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sbi.company.entity.Manager;
import sbi.company.service.*;

@Component
public class ManagerFactory {

    @Autowired
    private CreateManagerService createService;

    @Autowired
    private UpdateManagerService updateService;

    @Autowired
    private DeleteManagerService deleteService;

    @Autowired
    private GetManagerByIdService getByIdService;

    @Autowired
    private GetAllManagerService getAllService;

    public Object execute(int choice, Manager manager, Integer id) {

        switch (choice) {

            case 1:
                return createService.saveManager(manager);

            case 2:
                return updateService.updateManager(manager);

            case 3:
                deleteService.deleteManager(id);
                return "Manager Deleted Successfully";

            case 4:
                return getByIdService.getManagerById(id);

            case 5:
                return getAllService.getAllManagers();

            default:
                return "Invalid Choice";
        }
    }
}