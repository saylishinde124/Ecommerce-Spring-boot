package sbi.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sbi.company.entity.Type;
import sbi.company.factory.TypeFactory;

@RestController
@RequestMapping("/type")
public class TypeController {

    @Autowired
    private TypeFactory factory;

    @PostMapping("/save")
    public Object save(@RequestBody Type type) {
        return factory.execute(1, type, null);
    }

    @PutMapping("/update")
    public Object update(@RequestBody Type type) {
        return factory.execute(2, type, null);
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