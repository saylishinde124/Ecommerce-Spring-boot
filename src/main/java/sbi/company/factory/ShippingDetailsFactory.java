package sbi.company.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sbi.company.entity.ShippingDetails;
import sbi.company.service.*;

@Component
public class ShippingDetailsFactory {

    @Autowired private CreateShippingDetailsService createService;
    @Autowired private UpdateShippingDetailsService updateService;
    @Autowired private DeleteShippingDetailsService deleteService;
    @Autowired private GetShippingDetailsByIdService getByIdService;
    @Autowired private GetAllShippingDetailsService getAllService;

    public Object execute(int choice, ShippingDetails sd, Integer id) {

        switch (choice) {

            case 1:
                return createService.saveShippingDetails(sd);

            case 2:
                return updateService.updateShippingDetails(sd);

            case 3:
                deleteService.deleteShippingDetails(id);
                return "Deleted Successfully";

            case 4:
                return getByIdService.getShippingDetailsById(id);

            case 5:
                return getAllService.getAllShippingDetails();

            default:
                return "Invalid Choice";
        }
    }
}
