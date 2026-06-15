package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.repository.EmployeeRepository;
import sbi.company.service.DeleteEmployeeService;

@Service
public class DeleteEmployeeServiceImpl implements DeleteEmployeeService {

    @Autowired
    private EmployeeRepository repo;

    @Override
    public void deleteEmployee(int id) {
        repo.deleteById(id);
    }
}
