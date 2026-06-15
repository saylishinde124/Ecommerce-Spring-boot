package sbi.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import sbi.company.entity.Employee;
import sbi.company.factory.EmployeeFactory;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeFactory factory;

    @PostMapping("/save")
    public Object save(@RequestBody Employee employee) {
        return factory.execute(1, employee, null);
    }

    @PutMapping("/update")
    public Object update(@RequestBody Employee employee) {
        return factory.execute(2, employee, null);
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