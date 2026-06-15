package sbi.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import sbi.company.entity.ShippingDetails;
import sbi.company.factory.ShippingDetailsFactory;

@RestController
@RequestMapping("/shipping")
public class ShippingDetailsController {

    @Autowired
    private ShippingDetailsFactory factory;

    @PostMapping("/save")
    public Object save(@RequestBody ShippingDetails sd) {
        return factory.execute(1, sd, null);
    }

    @PutMapping("/update")
    public Object update(@RequestBody ShippingDetails sd) {
        return factory.execute(2, sd, null);
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
