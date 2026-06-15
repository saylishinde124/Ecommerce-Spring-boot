package sbi.company.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sbi.company.entity.Product;
import sbi.company.service.*;

@Component
public class ProductFactory {

    @Autowired
    private CreateProductService createService;

    @Autowired
    private UpdateProductService updateService;

    @Autowired
    private DeleteProductService deleteService;

    @Autowired
    private GetProductByIdService getByIdService;

    @Autowired
    private GetAllProductService getAllService;

    public Object execute(int choice, Product product, Integer id) {

        switch (choice) {

            case 1:
                return createService.saveProduct(product);

            case 2:
                return updateService.updateProduct(product);

            case 3:
                deleteService.deleteProduct(id);
                return "Product Deleted Successfully";

            case 4:
                return getByIdService.getProductById(id);

            case 5:
                return getAllService.getAllProducts();

            default:
                return "Invalid Choice";
        }
    }
}
