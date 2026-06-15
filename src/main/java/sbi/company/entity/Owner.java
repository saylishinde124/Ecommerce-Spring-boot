package sbi.company.entity;

import java.util.Date;
import java.util.List;
import jakarta.persistence.*;

@Entity
public class Owner {

    @Id
    private int id;

    private String name;
    private String adhar;
    private String panno;
    private String mailid;

    private double income;
    private String experience;
    private Date dob;
    private String mobileNO;
    
    @OneToOne   // ✅ MUST be OneToOne
    @JoinColumn(name = "company_id")
    private Company company;

//    @OneToMany(mappedBy = "company")
//    private List<Manager> managers;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "owner_id")
    private List<Address> address;

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

    public double getIncome() { return income; }
    public void setIncome(double income) { this.income = income; }

    public String getExperience() { return experience; }
    public void setExperience(String experience) { this.experience = experience; }

    public Date getDob() { return dob; }
    public void setDob(Date dob) { this.dob = dob; }

    public String getMobileNO() { return mobileNO; }
    public void setMobileNO(String mobileNO) { this.mobileNO = mobileNO; }

    public List<Address> getAddress() { return address; }
    public void setAddress(List<Address> address) { this.address = address; }

    public Company getCompany() { return company; }
    public void setCompany(Company company) { this.company = company; }

//    public List<Manager> getManagers() { return managers; }
//    public void setManagers(List<Manager> managers) { this.managers = managers; }
}