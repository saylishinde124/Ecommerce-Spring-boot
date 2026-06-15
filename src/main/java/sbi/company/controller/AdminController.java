package sbi.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import sbi.company.entity.Admin;
import sbi.company.factory.AdminFactory;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminFactory factory;

    @PostMapping("/save")
    public Object save(@RequestBody Admin admin) {
        return factory.execute(1, admin, null);
    }

    @PutMapping("/update")
    public Object update(@RequestBody Admin admin) {
        return factory.execute(2, admin, null);
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