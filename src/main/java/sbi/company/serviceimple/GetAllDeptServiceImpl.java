package sbi.company.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Dept;
import sbi.company.repository.DeptRepository;
import sbi.company.service.GetAllDeptService;

@Service
public class GetAllDeptServiceImpl implements GetAllDeptService {

    @Autowired
    private DeptRepository repo;

    @Override
    public List<Dept> getAllDepts() {
        return repo.findAll();
    }
}
