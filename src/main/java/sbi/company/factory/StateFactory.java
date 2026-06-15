package sbi.company.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sbi.company.entity.State;
import sbi.company.service.*;

@Component
public class StateFactory {

    @Autowired private CreateStateService createService;
    @Autowired private UpdateStateService updateService;
    @Autowired private DeleteStateService deleteService;
    @Autowired private GetStateByIdService getByIdService;
    @Autowired private GetAllStateService getAllService;

    public Object execute(int choice, State state, Integer id) {

        switch (choice) {

            case 1:
                return createService.saveState(state);

            case 2:
                return updateService.updateState(state);

            case 3:
                deleteService.deleteState(id);
                return "State Deleted Successfully";

            case 4:
                return getByIdService.getStateById(id);

            case 5:
                return getAllService.getAllStates();

            default:
                return "Invalid Choice";
        }
    }
}
