package sbi.company.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;



@Entity
public class Tracking {

    @Override
	public String toString() {
		return "Tracking [id=" + id + "]";
	}

	public Tracking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Id
   
    private int id;
}
