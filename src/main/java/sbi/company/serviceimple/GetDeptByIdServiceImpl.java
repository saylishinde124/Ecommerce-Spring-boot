package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.entity.Dept;
import sbi.company.repository.DeptRepository;
import sbi.company.service.GetDeptByIdService;

@Service
public class GetDeptByIdServiceImpl implements GetDeptByIdService {

    @Autowired
    private DeptRepository repo;

    @Override
    public Dept getDeptById(int id) {
        return repo.findById(id).orElse(null);
    }
}
