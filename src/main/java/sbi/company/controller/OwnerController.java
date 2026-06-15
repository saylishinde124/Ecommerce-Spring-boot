package sbi.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import sbi.company.entity.Owner;
import sbi.company.factory.OwnerFactory;

@RestController
@RequestMapping("/owner")
public class OwnerController {

    @Autowired
    private OwnerFactory factory;

    @PostMapping("/save")
    public Object save(@RequestBody Owner owner) {
        return factory.execute(1, owner, null);
    }

    @PutMapping("/update")
    public Object update(@RequestBody Owner owner) {
        return factory.execute(2, owner, null);
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