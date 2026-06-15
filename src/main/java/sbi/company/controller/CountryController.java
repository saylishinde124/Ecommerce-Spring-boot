package sbi.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import sbi.company.entity.Country;
import sbi.company.factory.CountryFactory;

@RestController
@RequestMapping("/country")
public class CountryController {

    @Autowired
    private CountryFactory factory;

    @PostMapping("/save")
    public Object save(@RequestBody Country country) {
        return factory.execute(1, country, null);
    }

    @PutMapping("/update")
    public Object update(@RequestBody Country country) {
        return factory.execute(2, country, null);
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