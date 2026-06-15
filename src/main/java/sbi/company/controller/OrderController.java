package sbi.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import sbi.company.entity.Order;
import sbi.company.factory.OrderFactory;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderFactory factory;

    @PostMapping("/save")
    public Object save(@RequestBody Order order) {
        return factory.execute(1, order, null);
    }

    @PutMapping("/update")
    public Object update(@RequestBody Order order) {
        return factory.execute(2, order, null);
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