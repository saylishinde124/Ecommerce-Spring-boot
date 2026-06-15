package sbi.company.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sbi.company.entity.Cod;
import sbi.company.service.*;

@Component
public class CodFactory {

    @Autowired
    private CreateCodService createService;

    @Autowired
    private UpdateCodService updateService;

    @Autowired
    private DeleteCodService deleteService;

    @Autowired
    private GetCodByIdService getByIdService;

    @Autowired
    private GetAllCodService getAllService;

    public Object execute(int choice, Cod cod, Integer id) {

        switch (choice) {

            case 1:
                return createService.saveCod(cod);

            case 2:
                return updateService.updateCod(cod);

            case 3:
                deleteService.deleteCod(id);
                return "COD deleted successfully";

            case 4:
                return getByIdService.getCodById(id);

            case 5:
                return getAllService.getAllCods();

            default:
                return "Invalid Choice";
        }
    }
}
