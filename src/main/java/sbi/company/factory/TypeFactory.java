package sbi.company.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sbi.company.entity.Type;
import sbi.company.service.*;

@Component
public class TypeFactory {

    @Autowired private CreateTypeService createService;
    @Autowired private UpdateTypeService updateService;
    @Autowired private DeleteTypeService deleteService;
    @Autowired private GetTypeByIdService getByIdService;
    @Autowired private GetAllTypeService getAllService;

    public Object execute(int choice, Type type, Integer id) {

        switch (choice) {
            case 1:
                return createService.saveType(type);

            case 2:
                return updateService.update(type);

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
