package sbi.company.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "admin")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "adhar")
    private String adhar;

    @Column(name = "panno")
    private String panno;

    @Column(name = "mailid")
    private String mailid;

    @Column(name = "dob")
    private Date dob;

    @Column(name = "mobile_no")
    private String mobileNo;

    @Column(name = "doj")
    private Date doj;

    @Column(name = "experience")
    private String experience;

//    @OneToMany(mappedBy = "admin", cascade = CascadeType.ALL)
//    private List<Address> address;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "admin_id")   // FK will be created in Address table
    private List<Address> address;
    
    @OneToOne(cascade = CascadeType.ALL)
    private Company company;

    @OneToOne(cascade = CascadeType.ALL)
    private Dept dept;

    @ManyToOne
    @JoinColumn(name = "role_rid")
    private Role role;

    // Constructors
    public Admin() {}

    public Admin(String name, String adhar, String panno, String mailid) {
        this.name = name;
        this.adhar = adhar;
        this.panno = panno;
        this.mailid = mailid;
    }

    // Getters and Setters
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

    public Date getDob() { return dob; }
    public void setDob(Date dob) { this.dob = dob; }

    public String getMobileNo() { return mobileNo; }
    public void setMobileNo(String mobileNo) { this.mobileNo = mobileNo; }

    public Date getDoj() { return doj; }
    public void setDoj(Date doj) { this.doj = doj; }

    public String getExperience() { return experience; }
    public void setExperience(String experience) { this.experience = experience; }

    public List<Address> getAddress() { return address; }
    public void setAddress(List<Address> address) { this.address = address; }

    public Company getCompany() { return company; }
    public void setCompany(Company company) { this.company = company; }

    public Dept getDept() { return dept; }
    public void setDept(Dept dept) { this.dept = dept; }

    public Role getRole() { return role; }
    public void setRole(Role role) { this.role = role; }
}