package sbi.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import sbi.company.entity.FeedBack;
import sbi.company.factory.FeedBackFactory;

@RestController
@RequestMapping("/feedback")
public class FeedBackController {

    @Autowired
    private FeedBackFactory factory;

    @PostMapping("/save")
    public Object save(@RequestBody FeedBack fb) {
        return factory.execute(1, fb, null);
    }

    @PutMapping("/update")
    public Object update(@RequestBody FeedBack fb) {
        return factory.execute(2, fb, null);
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