package sbi.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import sbi.company.entity.Tracking;
import sbi.company.factory.TrackingFactory;

@RestController
@RequestMapping("/tracking")
public class TrackingController {

    @Autowired
    private TrackingFactory factory;

    @PostMapping("/save")
    public Object save(@RequestBody Tracking tracking) {
        return factory.execute(1, tracking, null);
    }

    @PutMapping("/update")
    public Object update(@RequestBody Tracking tracking) {
        return factory.execute(2, tracking, null);
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
