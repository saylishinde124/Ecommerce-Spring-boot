package sbi.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import sbi.company.entity.Category;
import sbi.company.factory.CategoryFactory;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryFactory factory;

    @PostMapping("/save")
    public Object save(@RequestBody Category category) {
        return factory.execute(1, category, null);
    }

    @PutMapping("/update")
    public Object update(@RequestBody Category category) {
        return factory.execute(2, category, null);
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