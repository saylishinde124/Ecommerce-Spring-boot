package sbi.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import sbi.company.entity.Taluka;
import sbi.company.factory.TalukaFactory;

@RestController
@RequestMapping("/taluka")
public class TalukaController {

    @Autowired
    private TalukaFactory factory;

    @PostMapping("/save")
    public Object save(@RequestBody Taluka taluka) {
        return factory.execute(1, taluka, null);
    }

    @PutMapping("/update")
    public Object update(@RequestBody Taluka taluka) {
        return factory.execute(2, taluka, null);
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
