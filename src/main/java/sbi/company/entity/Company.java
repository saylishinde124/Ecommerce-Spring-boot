package sbi.company.entity;

import java.util.List;
import jakarta.persistence.*;

@Entity
public class Company {

    @Id
    private int regNo;

    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Address> address;

    @OneToOne(mappedBy = "company")  // ✅ now valid
    private Owner owner;

    @OneToMany(mappedBy = "company")
    private List<Manager> managers;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Admin> admins;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Employee> employees;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Dept> depts;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Type> types;

	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public List<Manager> getManagers() {
		return managers;
	}

	public void setManagers(List<Manager> managers) {
		this.managers = managers;
	}

	public List<Admin> getAdmins() {
		return admins;
	}

	public void setAdmins(List<Admin> admins) {
		this.admins = admins;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public List<Dept> getDepts() {
		return depts;
	}

	public void setDepts(List<Dept> depts) {
		this.depts = depts;
	}

	public List<Type> getTypes() {
		return types;
	}

	public void setTypes(List<Type> types) {
		this.types = types;
	}

	@Override
	public String toString() {
		return "Company [regNo=" + regNo + ", name=" + name + ", address=" + address + ", owner=" + owner
				+ ", managers=" + managers + ", admins=" + admins + ", employees=" + employees + ", depts=" + depts
				+ ", types=" + types + "]";
	}

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

    
}