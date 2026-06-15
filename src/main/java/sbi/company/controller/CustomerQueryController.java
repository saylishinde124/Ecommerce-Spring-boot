package sbi.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import sbi.company.entity.CustomerQuery;
import sbi.company.factory.CustomerQueryFactory;

@RestController
@RequestMapping("/customerquery")
public class CustomerQueryController {

    @Autowired
    private CustomerQueryFactory factory;

    @PostMapping("/save")
    public Object save(@RequestBody CustomerQuery query) {
        return factory.execute(1, query, null);
    }

    @PutMapping("/update")
    public Object update(@RequestBody CustomerQuery query) {
        return factory.execute(2, query, null);
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