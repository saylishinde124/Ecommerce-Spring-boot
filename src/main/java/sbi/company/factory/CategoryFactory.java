package sbi.company.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sbi.company.entity.Category;
import sbi.company.service.*;

@Component
public class CategoryFactory {

    @Autowired
    private CreateCategoryService createService;

    @Autowired
    private UpdateCategoryService updateService;

    @Autowired
    private DeleteCategoryService deleteService;

    @Autowired
    private GetCategoryByIdService getByIdService;

    @Autowired
    private GetAllCategoryService getAllService;

    public Object execute(int choice, Category category, Integer id) {

        switch (choice) {

            case 1:
                return createService.saveCategory(category);

            case 2:
                return updateService.updateCategory(category);

            case 3:
                deleteService.deleteCategory(id);
                return "Category deleted successfully";

            case 4:
                return getByIdService.getCategoryById(id);

            case 5:
                return getAllService.getAllCategories();

            default:
                return "Invalid Choice";
        }
    }
}
