package sbi.company.entity;

import java.util.List;
import jakarta.persistence.*;

@Entity
public class Dept {

    @Id
    private int did;

    private String name;
    @OneToOne
    @JoinColumn(name = "manager_id")
    private Manager manager;


    @OneToMany(mappedBy = "dept")
    private List<Employee> employees;

    @OneToOne
    private Admin admin;

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
}