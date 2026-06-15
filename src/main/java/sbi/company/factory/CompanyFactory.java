package sbi.company.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sbi.company.entity.Company;
import sbi.company.service.*;

@Component
public class CompanyFactory {

    @Autowired
    private CreateCompanyService createService;

    @Autowired
    private UpdateCompanyService updateService;

    @Autowired
    private DeleteCompanyService deleteService;

    @Autowired
    private GetCompanyByIdService getByIdService;

    @Autowired
    private GetAllCompanyService getAllService;

    public Object execute(int choice, Company company, Integer id) {

        switch (choice) {

            case 1:
                return createService.saveCompany(company);

            case 2:
                return updateService.updateCompany(company);

            case 3:
                deleteService.deleteCompany(id);
                return "Company Deleted Successfully";

            case 4:
                return getByIdService.getCompanyById(id);

            case 5:
                return getAllService.getAllCompanies();

            default:
                return "Invalid Choice";
        }
    }
}