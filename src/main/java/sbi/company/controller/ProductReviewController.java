package sbi.company.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sbi.company.entity.ProductReview;
import sbi.company.factory.ProductReviewFactory;

@RestController
@RequestMapping("/review")
public class ProductReviewController {

    @Autowired
    private ProductReviewFactory factory;

    @PostMapping("/save")
    public Object save(@RequestBody ProductReview review) {
        return factory.execute(1, review, null);
    }

    @PutMapping("/update")
    public Object update(@RequestBody ProductReview review) {
        return factory.execute(2, review, null);
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