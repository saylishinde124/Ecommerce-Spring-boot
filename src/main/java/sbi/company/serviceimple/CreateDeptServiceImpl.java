package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import sbi.company.entity.Dept;

import sbi.company.repository.DeptRepository;
import sbi.company.service.CreateDeptService;

@Service
public class CreateDeptServiceImpl implements CreateDeptService {

    @Autowired
    private DeptRepository repo;

    @Override
    public Dept saveDept(Dept dept) {
        return repo.save(dept);
    }
}
