package sbi.company.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sbi.company.entity.Employee;
import sbi.company.service.*;

@Component
public class EmployeeFactory {

    @Autowired
    private CreateEmployeeService createService;

    @Autowired
    private UpdateEmployeeService updateService;

    @Autowired
    private DeleteEmployeeService deleteService;

    @Autowired
    private GetEmployeeByIdService getByIdService;

    @Autowired
    private GetAllEmployeeService getAllService;

    public Object execute(int choice, Employee employee, Integer id) {

        switch (choice) {

            case 1:
                return createService.saveEmployee(employee);

            case 2:
                return updateService.updateEmployee(employee);

            case 3:
                deleteService.deleteEmployee(id);
                return "Employee Deleted Successfully";

            case 4:
                return getByIdService.getEmployeeById(id);

            case 5:
                return getAllService.getAllEmployees();

            default:
                return "Invalid Choice";
        }
    }
}