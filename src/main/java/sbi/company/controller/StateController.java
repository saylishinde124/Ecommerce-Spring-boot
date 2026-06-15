package sbi.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import sbi.company.entity.State;
import sbi.company.factory.StateFactory;

@RestController
@RequestMapping("/state")
public class StateController {

    @Autowired
    private StateFactory factory;

    @PostMapping("/save")
    public Object save(@RequestBody State state) {
        return factory.execute(1, state, null);
    }

    @PutMapping("/update")
    public Object update(@RequestBody State state) {
        return factory.execute(2, state, null);
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
