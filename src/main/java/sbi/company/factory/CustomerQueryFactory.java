package sbi.company.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sbi.company.entity.CustomerQuery;
import sbi.company.service.*;

@Component
public class CustomerQueryFactory {

    @Autowired
    private CreateCustomerQueryService createService;

    @Autowired
    private UpdateCustomerQueryService updateService;

    @Autowired
    private DeleteCustomerQueryService deleteService;

    @Autowired
    private GetCustomerQueryByIdService getByIdService;

    @Autowired
    private GetAllCustomerQueryService getAllService;

    public Object execute(int choice, CustomerQuery query, Integer id) {

        switch (choice) {

            case 1:
                return createService.saveCustomerQuery(query);

            case 2:
                return updateService.updateCustomerQuery(query);

            case 3:
                deleteService.deleteCustomerQuery(id);
                return "CustomerQuery Deleted Successfully";

            case 4:
                return getByIdService.getCustomerQueryById(id);

            case 5:
                return getAllService.getAllCustomerQueries();

            default:
                return "Invalid Choice";
        }
    }
}
