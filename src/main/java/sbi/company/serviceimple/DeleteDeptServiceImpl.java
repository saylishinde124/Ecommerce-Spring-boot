package sbi.company.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbi.company.repository.DeptRepository;
import sbi.company.service.DeleteDeptService;

@Service
public class DeleteDeptServiceImpl implements DeleteDeptService {

    @Autowired
    private DeptRepository repo;

    @Override
    public void deleteDept(int id) {
        repo.deleteById(id);
    }
}
