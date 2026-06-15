package sbi.company.entity;


import jakarta.persistence.CascadeType;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.OneToOne;



@Entity
public class Upi {

    @Id
   
    private int uid;

    private float amount;

    @OneToOne(cascade = CascadeType.ALL)
   
    private User user;

	@Override
	public String toString() {
		return "Upi [uid=" + uid + ", amount=" + amount + ", user=" + user + "]";
	}

	public Upi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
