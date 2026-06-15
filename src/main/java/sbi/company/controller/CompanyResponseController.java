package sbi.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import sbi.company.entity.CompanyResponse;
import sbi.company.factory.CompanyResponseFactory;

@RestController
@RequestMapping("/companyresponse")
public class CompanyResponseController {

    @Autowired
    private CompanyResponseFactory factory;

    @PostMapping("/save")
    public Object save(@RequestBody CompanyResponse response) {
        return factory.execute(1, response, null);
    }

    @PutMapping("/update")
    public Object update(@RequestBody CompanyResponse response) {
        return factory.execute(2, response, null);
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