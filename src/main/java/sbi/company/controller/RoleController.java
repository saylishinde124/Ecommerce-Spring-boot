package sbi.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import sbi.company.entity.Role;
import sbi.company.factory.RoleFactory;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleFactory factory;

    @PostMapping("/save")
    public Object saveRole(@RequestBody Role role) {
        return factory.execute(1, role, null);
    }

    @PutMapping("/update")
    public Object updateRole(@RequestBody Role role) {
        return factory.execute(2, role, null);
    }

    @DeleteMapping("/delete/{id}")
    public Object deleteRole(@PathVariable int id) {
        return factory.execute(3, null, id);
    }

    @GetMapping("/{id}")
    public Object getRoleById(@PathVariable int id) {
        return factory.execute(4, null, id);
    }

    @GetMapping("/all")
    public Object getAllRoles() {
        return factory.execute(5, null, null);
    }
}
