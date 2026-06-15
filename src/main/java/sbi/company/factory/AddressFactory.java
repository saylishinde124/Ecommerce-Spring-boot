package sbi.company.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sbi.company.entity.Address;
import sbi.company.service.*;

@Component
public class AddressFactory {

    @Autowired
    private CreateAddressService createService;

    @Autowired
    private UpdateAddressService updateService;

    @Autowired
    private DeleteAddressService deleteService;

    @Autowired
    private GetAddressByIdService getByIdService;

    @Autowired
    private GetAllAddressService getAllService;

    public Object execute(int choice, Address address, Integer id) {

        switch (choice) {

            case 1:
                return createService.saveAddress(address);

            case 2:
                return updateService.updateAddress(address);

            case 3:
                deleteService.deleteAddress(id);
                return "Address deleted successfully";

            case 4:
                return getByIdService.getAddressById(id);

            case 5:
                return getAllService.getAllAddresses();

            default:
                return "Invalid Choice";
        }
    }
}
