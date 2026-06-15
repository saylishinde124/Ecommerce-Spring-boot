package sbi.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import sbi.company.entity.District;
import sbi.company.factory.DistrictFactory;

@RestController
@RequestMapping("/district")
public class DistrictController {

    @Autowired
    private DistrictFactory factory;

    @PostMapping("/save")
    public Object save(@RequestBody District district) {
        return factory.execute(1, district, null);
    }

    @PutMapping("/update")
    public Object update(@RequestBody District district) {
        return factory.execute(2, district, null);
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