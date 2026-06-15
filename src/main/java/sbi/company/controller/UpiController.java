package sbi.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sbi.company.entity.Upi;
import sbi.company.factory.UpiFactory;

@RestController
@RequestMapping("/upi")
public class UpiController {

    @Autowired
    private UpiFactory factory;

    @PostMapping("/save")
    public Object save(@RequestBody Upi upi) {
        return factory.execute(1, upi, null);
    }

    @PutMapping("/update")
    public Object update(@RequestBody Upi upi) {
        return factory.execute(2, upi, null);
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
