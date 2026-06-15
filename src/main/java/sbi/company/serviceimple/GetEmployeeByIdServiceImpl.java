package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Employee;
import sbi.company.repository.EmployeeRepository;
import sbi.company.service.GetEmployeeByIdService;

@Service
public class GetEmployeeByIdServiceImpl implements GetEmployeeByIdService {

    @Autowired
    private EmployeeRepository repo;

    @Override
    public Employee getEmployeeById(int id) {
        return repo.findById(id).orElse(null);
    }
}
