package sbi.company.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sbi.company.entity.ProductReview;
import sbi.company.service.*;
@Component
public class ProductReviewFactory {

    @Autowired
    private CreateProductReviewService createService;

    @Autowired
    private UpdateProductReviewService updateService;

    @Autowired
    private DeleteProductReviewService deleteService;

    @Autowired
    private GetProductReviewByIdService getByIdService;

    @Autowired
    private GetAllProductReviewService getAllService;

    public Object execute(int choice, ProductReview review, Integer id) {

        switch (choice) {

            case 1:
                return createService.saveProductReview(review);

            case 2:
                return updateService.update(review);

            case 3:
                deleteService.delete(id);
                return "Deleted Successfully";

            case 4:
                return getByIdService.getById(id);

            case 5:
                return getAllService.getAll();

            default:
                return "Invalid Choice";
        }
    }
}