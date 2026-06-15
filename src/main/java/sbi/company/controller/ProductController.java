package sbi.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import sbi.company.entity.Product;
import sbi.company.factory.ProductFactory;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductFactory factory;

    @PostMapping("/save")
    public Object save(@RequestBody Product product) {
        return factory.execute(1, product, null);
    }

    @PutMapping("/update")
    public Object update(@RequestBody Product product) {
        return factory.execute(2, product, null);
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