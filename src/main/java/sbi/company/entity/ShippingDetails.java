package sbi.company.entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;


@Entity
public class ShippingDetails {

    @Id
   
    private int sid;

    @ManyToMany(targetEntity=User.class)
    private Set<User> user;

	@Override
	public String toString() {
		return "ShippingDetails [sid=" + sid + ", user=" + user + "]";
	}

	public ShippingDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public Set<User> getUser() {
		return user;
	}

	public void setUser(Set<User> user) {
		this.user = user;
	}
}
