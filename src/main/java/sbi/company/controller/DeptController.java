package sbi.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import sbi.company.entity.Dept;
import sbi.company.factory.DeptFactory;

@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptFactory factory;

    @PostMapping("/save")
    public Object save(@RequestBody Dept dept) {
        return factory.execute(1, dept, null);
    }

    @PutMapping("/update")
    public Object update(@RequestBody Dept dept) {
        return factory.execute(2, dept, null);
    }

    @DeleteMapping("/delete/{id}")
    public Object delete(@PathVariable int id) {
        return factory.execute(3, null, id);
    }

    @GetMapping("/get/{id}")
    public Object getById(@PathVariable int id) {
        return factory.execute(4, null, id);
    }

    @GetMapping("/getall")
    public Object getAll() {
        return factory.execute(5, null, null);
    }
}