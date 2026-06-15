package sbi.company.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sbi.company.entity.Dept;
import sbi.company.service.*;

@Component
public class DeptFactory {

    @Autowired
    private CreateDeptService createService;

    @Autowired
    private UpdateDeptService updateService;

    @Autowired
    private DeleteDeptService deleteService;

    @Autowired
    private GetDeptByIdService getByIdService;

    @Autowired
    private GetAllDeptService getAllService;

    public Object execute(int choice, Dept dept, Integer id) {

        switch (choice) {

            case 1:
                return createService.saveDept(dept);

            case 2:
                return updateService.updateDept(dept);

            case 3:
                deleteService.deleteDept(id);
                return "Dept Deleted Successfully";

            case 4:
                return getByIdService.getDeptById(id);

            case 5:
                return getAllService.getAllDepts();

            default:
                return "Invalid Choice";
        }
    }
}