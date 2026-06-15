package sbi.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import sbi.company.entity.SubCategory;
import sbi.company.factory.SubCategoryFactory;

@RestController
@RequestMapping("/subcategory")
public class SubCategoryController {

    @Autowired
    private SubCategoryFactory factory;

    @PostMapping("/save")
    public Object save(@RequestBody SubCategory subCategory) {
        return factory.execute(1, subCategory, null);
    }

    @PutMapping("/update")
    public Object update(@RequestBody SubCategory subCategory) {
        return factory.execute(2, subCategory, null);
    }

    @DeleteMapping("/delete/{id}")
    public Object delete(@PathVariable int id) {
        return factory.execute(3, null, id);
    }

    @GetMapping("/{id}")
    public Object getById(@PathVariable int id) {
        return factory.execute(4, null, id);
    }

    @GetMapping("/all")
    public Object getAll() {
        return factory.execute(5, null, null);
    }
}
