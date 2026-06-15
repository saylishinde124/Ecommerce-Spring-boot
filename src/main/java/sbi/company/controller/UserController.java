package sbi.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import sbi.company.entity.User;
import sbi.company.factory.UserFactory;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserFactory factory;

    @PostMapping("/save")
    public Object saveUser(@RequestBody User user) {
        return factory.execute(1, user, null);
    }

    @PutMapping("/update")
    public Object updateUser(@RequestBody User user) {
        return factory.execute(2, user, null);
    }

    @DeleteMapping("/delete/{id}")
    public Object deleteUser(@PathVariable int id) {
        return factory.execute(3, null, id);
    }

    @GetMapping("/{id}")
    public Object getUserById(@PathVariable int id) {
        return factory.execute(4, null, id);
    }

    @GetMapping("/all")
    public Object getAllUsers() {
        return factory.execute(5, null, null);
    }
}