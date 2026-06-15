package sbi.company.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sbi.company.entity.Owner;
import sbi.company.service.*;

@Component
public class OwnerFactory {

    @Autowired
    private CreateOwnerService createService;

    @Autowired
    private UpdateOwnerService updateService;

    @Autowired
    private DeleteOwnerService deleteService;

    @Autowired
    private GetOwnerByIdService getByIdService;

    @Autowired
    private GetAllOwnerService getAllService;

    public Object execute(int choice, Owner owner, Integer id) {

        switch (choice) {

            case 1:
                return createService.saveOwner(owner);

            case 2:
                return updateService.updateOwner(owner);

            case 3:
                deleteService.deleteOwner(id);
                return "Owner Deleted Successfully";

            case 4:
                return getByIdService.getOwnerById(id);

            case 5:
                return getAllService.getAllOwners();

            default:
                return "Invalid Choice";
        }
    }
}