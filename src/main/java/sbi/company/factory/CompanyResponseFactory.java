package sbi.company.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sbi.company.entity.CompanyResponse;
import sbi.company.service.*;

@Component
public class CompanyResponseFactory {

    @Autowired
    private CreateCompanyResponseService createService;

    @Autowired
    private UpdateCompanyResponseService updateService;

    @Autowired
    private DeleteCompanyResponseService deleteService;

    @Autowired
    private GetCompanyResponseByIdService getByIdService;

    @Autowired
    private GetAllCompanyResponseService getAllService;

    public Object execute(int choice, CompanyResponse response, Integer id) {

        switch (choice) {

            case 1:
                return createService.saveCompanyResponse(response);

            case 2:
                return updateService.updateCompanyResponse(response);

            case 3:
                deleteService.deleteCompanyResponse(id);
                return "CompanyResponse Deleted Successfully";

            case 4:
                return getByIdService.getCompanyResponseById(id);

            case 5:
                return getAllService.getAllCompanyResponses();

            default:
                return "Invalid Choice";
        }
    }
}
