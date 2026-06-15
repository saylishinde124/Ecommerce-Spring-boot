package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Employee;

import sbi.company.repository.EmployeeRepository;
import sbi.company.service.CreateEmployeeService;
@Service
public class CreateEmployeeServiceImpl implements CreateEmployeeService {

    @Autowired
    private EmployeeRepository repo;

    @Override
    public Employee saveEmployee(Employee employee) {
        return repo.save(employee);
    }
}