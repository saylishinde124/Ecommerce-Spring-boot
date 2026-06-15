package sbi.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import sbi.company.entity.Card;
import sbi.company.factory.CardFactory;

@RestController
@RequestMapping("/card")
public class CardController {

    @Autowired
    private CardFactory factory;

    @PostMapping("/save")
    public Object save(@RequestBody Card card) {
        return factory.execute(1, card, null);
    }

    @PutMapping("/update")
    public Object update(@RequestBody Card card) {
        return factory.execute(2, card, null);
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