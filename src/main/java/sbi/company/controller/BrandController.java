package sbi.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import sbi.company.entity.Brand;
import sbi.company.factory.BrandFactory;

@RestController
@RequestMapping("/brand")
public class BrandController {

    @Autowired
    private BrandFactory factory;

    @PostMapping("/save")
    public Object save(@RequestBody Brand brand) {
        return factory.execute(1, brand, null);
    }

    @PutMapping("/update")
    public Object update(@RequestBody Brand brand) {
        return factory.execute(2, brand, null);
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