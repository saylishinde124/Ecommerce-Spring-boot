package sbi.company.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sbi.company.entity.Tracking;
import sbi.company.service.*;

@Component
public class TrackingFactory {

    @Autowired
    private CreateTrackingService createService;

    @Autowired
    private UpdateTrackingService updateService;

    @Autowired
    private DeleteTrackingService deleteService;

    @Autowired
    private GetTrackingByIdService getByIdService;

    @Autowired
    private GetAllTrackingService getAllService;

    public Object execute(int choice, Tracking tracking, Integer id) {

        switch (choice) {

            case 1:
                return createService.saveTracking(tracking);

            case 2:
                return updateService.updateTracking(tracking);

            case 3:
                deleteService.deleteTracking(id);
                return "Deleted Successfully";

            case 4:
                return getByIdService.getTrackingById(id);

            case 5:
                return getAllService.getAllTrackings();

            default:
                return "Invalid Choice";
        }
    }
}
