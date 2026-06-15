package sbi.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import sbi.company.entity.Manager;
import sbi.company.factory.ManagerFactory;

@RestController
@RequestMapping("/manager")
public class ManagerController {

    @Autowired
    private ManagerFactory factory;

    @PostMapping("/save")
    public Object save(@RequestBody Manager manager) {
        return factory.execute(1, manager, null);
    }

    @PutMapping("/update")
    public Object update(@RequestBody Manager manager) {
        return factory.execute(2, manager, null);
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