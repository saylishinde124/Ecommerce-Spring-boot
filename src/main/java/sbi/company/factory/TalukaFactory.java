package sbi.company.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sbi.company.entity.Taluka;
import sbi.company.service.*;

@Component
public class TalukaFactory {

    @Autowired
    private CreateTalukaService createService;

    @Autowired
    private UpdateTalukaService updateService;

    @Autowired
    private DeleteTalukaService deleteService;

    @Autowired
    private GetTalukaByIdService getByIdService;

    @Autowired
    private GetAllTalukaService getAllService;

    public Object execute(int choice, Taluka taluka, Integer id) {

        switch (choice) {

            case 1:
                return createService.saveTaluka(taluka);

            case 2:
                return updateService.updateTaluka(taluka);

            case 3:
                deleteService.deleteTaluka(id);
                return "Deleted Successfully";

            case 4:
                return getByIdService.getTalukaById(id);

            case 5:
                return getAllService.getAllTalukas();

            default:
                return "Invalid Choice";
        }
    }
}
