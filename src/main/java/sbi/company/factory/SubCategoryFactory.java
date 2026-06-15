package sbi.company.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sbi.company.entity.SubCategory;
import sbi.company.service.*;

@Component
public class SubCategoryFactory {

    @Autowired
    private CreateSubCategoryService createService;

    @Autowired
    private UpdateSubCategoryService updateService;

    @Autowired
    private DeleteSubCategoryService deleteService;

    @Autowired
    private GetSubCategoryByIdService getByIdService;

    @Autowired
    private GetAllSubCategoryService getAllService;

    public Object execute(int choice, SubCategory subCategory, Integer id) {

        switch (choice) {

            case 1:
                return createService.saveSubCategory(subCategory);

            case 2:
                return updateService.updateSubCategory(subCategory);

            case 3:
                deleteService.deleteSubCategory(id);
                return "Deleted Successfully";

            case 4:
                return getByIdService.getSubCategoryById(id);

            case 5:
                return getAllService.getAllSubCategories();

            default:
                return "Invalid Choice";
        }
    }
}
