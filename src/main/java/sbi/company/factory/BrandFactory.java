package sbi.company.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sbi.company.entity.Brand;
import sbi.company.service.*;

@Component
public class BrandFactory {

    @Autowired
    private CreateBrandService createService;

    @Autowired
    private UpdateBrandService updateService;

    @Autowired
    private DeleteBrandService deleteService;

    @Autowired
    private GetBrandByIdService getByIdService;

    @Autowired
    private GetAllBrandService getAllService;

    public Object execute(int choice, Brand brand, Integer id) {

        switch (choice) {

            case 1:
                return createService.saveBrand(brand);

            case 2:
                return updateService.updateBrand(brand);

            case 3:
                deleteService.deleteBrand(id);
                return "Brand deleted successfully";

            case 4:
                return getByIdService.getBrandById(id);

            case 5:
                return getAllService.getAllBrands();

            default:
                return "Invalid Choice";
        }
    }
}
