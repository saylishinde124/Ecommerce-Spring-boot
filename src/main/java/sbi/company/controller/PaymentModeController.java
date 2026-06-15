package sbi.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import sbi.company.entity.PaymentMode;
import sbi.company.factory.PaymentModeFactory;

@RestController
@RequestMapping("/paymentmode")
public class PaymentModeController {

    @Autowired
    private PaymentModeFactory factory;

    @PostMapping("/save")
    public Object save(@RequestBody PaymentMode pm) {
        return factory.execute(1, pm, null);
    }

    @PutMapping("/update")
    public Object update(@RequestBody PaymentMode pm) {
        return factory.execute(2, pm, null);
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