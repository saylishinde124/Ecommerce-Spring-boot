package sbi.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import sbi.company.entity.Cod;
import sbi.company.factory.CodFactory;

@RestController
@RequestMapping("/cod")
public class CodController {

    @Autowired
    private CodFactory factory;

    @PostMapping("/save")
    public Object save(@RequestBody Cod cod) {
        return factory.execute(1, cod, null);
    }

    @PutMapping("/update")
    public Object update(@RequestBody Cod cod) {
        return factory.execute(2, cod, null);
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