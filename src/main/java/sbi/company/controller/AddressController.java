package sbi.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import sbi.company.entity.Address;
import sbi.company.factory.AddressFactory;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressFactory factory;

    @PostMapping("/save")
    public Object save(@RequestBody Address address) {
        return factory.execute(1, address, null);
    }

    @PutMapping("/update")
    public Object update(@RequestBody Address address) {
        return factory.execute(2, address, null);
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