package sbi.company.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class Role {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rid;
	@Override
	public String toString() {
		return "Role [rid=" + rid + ", name=" + name + "]";
	}
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;

}
