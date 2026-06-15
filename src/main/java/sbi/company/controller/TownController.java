package sbi.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import sbi.company.entity.Town;
import sbi.company.factory.TownFactory;

@RestController
@RequestMapping("/town")
public class TownController {

    @Autowired
    private TownFactory factory;

    @PostMapping("/save")
    public Object save(@RequestBody Town town) {
        return factory.execute(1, town, null);
    }

    @PutMapping("/update")
    public Object update(@RequestBody Town town) {
        return factory.execute(2, town, null);
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
