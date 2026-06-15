package sbi.company.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sbi.company.entity.District;
import sbi.company.service.*;

@Component
public class DistrictFactory {

    @Autowired
    private CreateDistrictService createService;

    @Autowired
    private UpdateDistrictService updateService;

    @Autowired
    private DeleteDistrictService deleteService;

    @Autowired
    private GetDistrictByIdService getByIdService;

    @Autowired
    private GetAllDistrictService getAllService;

    public Object execute(int choice, District district, Integer id) {

        switch (choice) {

            case 1:
                return createService.saveDistrict(district);

            case 2:
                return updateService.updateDistrict(district);

            case 3:
                deleteService.deleteDistrict(id);
                return "District Deleted Successfully";

            case 4:
                return getByIdService.getDistrictById(id);

            case 5:
                return getAllService.getAllDistricts();

            default:
                return "Invalid Choice";
        }
    }
}
