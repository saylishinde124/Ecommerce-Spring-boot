package sbi.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import sbi.company.entity.Company;
import sbi.company.factory.CompanyFactory;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyFactory factory;

    @PostMapping("/save")
    public Object save(@RequestBody Company company) {
        return factory.execute(1, company, null);
    }

    @PutMapping("/update")
    public Object update(@RequestBody Company company) {
        return factory.execute(2, company, null);
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