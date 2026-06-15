package sbi.company.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sbi.company.entity.Country;
import sbi.company.service.*;

@Component
public class CountryFactory {

    @Autowired
    private CreateCountryService createService;

    @Autowired
    private UpdateCountryService updateService;

    @Autowired
    private DeleteCountryService deleteService;

    @Autowired
    private GetCountryByIdService getByIdService;

    @Autowired
    private GetAllCountryService getAllService;

    public Object execute(int choice, Country country, Integer id) {

        switch (choice) {

            case 1:
                return createService.saveCountry(country);

            case 2:
                return updateService.updateCountry(country);

            case 3:
                deleteService.deleteCountry(id);
                return "Country Deleted Successfully";

            case 4:
                return getByIdService.getCountryById(id);

            case 5:
                return getAllService.getAllCountries();

            default:
                return "Invalid Choice";
        }
    }
}
