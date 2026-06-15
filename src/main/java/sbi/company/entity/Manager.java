package sbi.company.entity;

import java.util.Date;
import java.util.List;
import jakarta.persistence.*;

@Entity
public class Manager {

    @Id
    private int id;

    private String name;
    private String adhar;
    private String panno;
    private String mailid;

    private float salary;
    private String experience;

    private Date dob;
    private Date doj;
    private String mobileNo;
//    @ManyToOne
//    @JoinColumn(name = "company_id")
//    private Company company;
    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;
    
    @OneToMany(mappedBy = "manager")
    private List<Employee> employees;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "manager_id")
    private List<Address> address;

    @OneToOne
    @JoinColumn(name = "dept_id")
    private Dept dept;

    // getters & setters

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAdhar() { return adhar; }
    public void setAdhar(String adhar) { this.adhar = adhar; }

    public String getPanno() { return panno; }
    public void setPanno(String panno) { this.panno = panno; }

    public String getMailid() { return mailid; }
    public void setMailid(String mailid) { this.mailid = mailid; }

    public float getSalary() { return salary; }
    public void setSalary(float salary) { this.salary = salary; }

    public String getExperience() { return experience; }
    public void setExperience(String experience) { this.experience = experience; }

    public Date getDob() { return dob; }
    public void setDob(Date dob) { this.dob = dob; }

    public Date getDoj() { return doj; }
    public void setDoj(Date doj) { this.doj = doj; }

    public String getMobileNo() { return mobileNo; }
    public void setMobileNo(String mobileNo) { this.mobileNo = mobileNo; }

    public Company getCompany() { return company; }
    public void setCompany(Company company) { this.company = company; }

    public Dept getDept() { return dept; }
    public void setDept(Dept dept) { this.dept = dept; }

    public List<Address> getAddress() { return address; }
    public void setAddress(List<Address> address) { this.address = address; }

    public List<Employee> getEmployees() { return employees; }
    public void setEmployees(List<Employee> employees) { this.employees = employees; }
}