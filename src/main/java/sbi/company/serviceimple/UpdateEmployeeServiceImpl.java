package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Employee;
import sbi.company.repository.EmployeeRepository;
import sbi.company.service.UpdateEmployeeService;

@Service
public class UpdateEmployeeServiceImpl implements UpdateEmployeeService {

    @Autowired
    private EmployeeRepository repo;

    @Override
    public Employee updateEmployee(Employee emp) {
        return repo.save(emp);
    }
}
