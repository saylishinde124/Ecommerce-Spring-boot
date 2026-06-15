package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Dept;
import sbi.company.repository.DeptRepository;
import sbi.company.service.UpdateDeptService;

@Service
public class UpdateDeptServiceImpl implements UpdateDeptService {

    @Autowired
    private DeptRepository repo;

    @Override
    public Dept updateDept(Dept dept) {
        return repo.save(dept);
    }
}
