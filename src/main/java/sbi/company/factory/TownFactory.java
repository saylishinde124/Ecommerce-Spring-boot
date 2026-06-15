package sbi.company.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sbi.company.entity.Town;
import sbi.company.service.*;

@Component
public class TownFactory {

    @Autowired
    private CreateTownService createService;

    @Autowired
    private UpdateTownService updateService;

    @Autowired
    private DeleteTownService deleteService;

    @Autowired
    private GetTownByIdService getByIdService;

    @Autowired
    private GetAllTownService getAllService;

    public Object execute(int choice, Town town, Integer id) {

        switch (choice) {

            case 1:
                return createService.saveTown(town);

            case 2:
                return updateService.updateTown(town);

            case 3:
                deleteService.deleteTown(id);
                return "Deleted Successfully";

            case 4:
                return getByIdService.getTownById(id);

            case 5:
                return getAllService.getAllTowns();

            default:
                return "Invalid Choice";
        }
    }
}
