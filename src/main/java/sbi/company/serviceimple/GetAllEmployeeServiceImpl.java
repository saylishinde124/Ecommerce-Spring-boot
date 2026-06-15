package sbi.company.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Employee;
import sbi.company.repository.EmployeeRepository;
import sbi.company.service.GetAllEmployeeService;

@Service
public class GetAllEmployeeServiceImpl implements GetAllEmployeeService {

    @Autowired
    private EmployeeRepository repo;

    @Override
    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }
}
