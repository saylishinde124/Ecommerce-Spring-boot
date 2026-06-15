package sbi.company.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sbi.company.entity.Upi;
import sbi.company.service.*;

@Component
public class UpiFactory {

    @Autowired private CreateUpiService createService;
    @Autowired private UpdateUpiService updateService;
    @Autowired private DeleteUpiService deleteService;
    @Autowired private GetUpiByIdService getByIdService;
    @Autowired private GetAllUpiService getAllService;

    public Object execute(int choice, Upi upi, Integer id) {

        switch (choice) {

            case 1:
                return createService.saveUpi(upi);

            case 2:
                return updateService.update(upi);

            case 3:
                deleteService.delete(id);
                return "Deleted Successfully";

            case 4:
                return getByIdService.getById(id);

            case 5:
                return getAllService.getAll();

            default:
                return "Invalid Choice";
        }
    }
}
